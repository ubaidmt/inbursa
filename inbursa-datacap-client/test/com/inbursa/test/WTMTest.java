package com.inbursa.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;

import org.apache.commons.io.IOUtils;

import com.inbursa.wtm.bean.BatchAttributes;
import com.inbursa.wtm.bean.BatchDCO;
import com.inbursa.wtm.bean.Page;
import com.inbursa.wtm.bean.Upload;
import com.inbursa.wtm.endpoint.CreateBatch;
import com.inbursa.wtm.endpoint.GetBatchAttributes;
import com.inbursa.wtm.endpoint.UploadFile;
import com.inbursa.wtm.endpoint.GetPageFile;
import com.inbursa.wtm.endpoint.ReleaseBatch;
import com.inbursa.wtm.endpoint.SaveBatchAttribute;

public class WTMTest {
	
	private final static String host = "http://192.168.185.130:82/service";
	private final static String app = "TravelDocs";
	private final static String job = "VScan Job";
	private final static String operator = "admin";
	private final static String station = "1";
	private final static String pageFile = "vscan.xml";
	private final static String resource = "/images/Car1.tif";

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testProcessImage() {
		
		InputStream is = null;
		try
		{
			// Create batch
			StringBuffer payload = new StringBuffer();
			payload.append("<createBatchAttributes>");
			payload.append("<application>" + app + "</application>");
			payload.append("<job>" + job + "</job>");
			payload.append("</createBatchAttributes>");
			
			BatchAttributes batch = CreateBatch.sendRequest(host + "/Queue/CreateBatch", payload.toString(), true);
			
			// Set additional batch attributes
			payload = new StringBuffer();
			payload.append("<BatchAttrSave>");
			payload.append("<batchDir>" + batch.getBatchdir() + "</batchDir>");
			payload.append("<operationUser>"+ operator + "</operationUser>"); 
			payload.append("<pageFile>" + pageFile + "</pageFile>");
			payload.append("<queueID>" + batch.getQueueId() + "</queueID>");
			payload.append("<station>" + station + "</station>");
			payload.append("<xtraBatchFields>"); 
			payload.append("<Count>0</Count>"); 
			payload.append("<Fields>");
			payload.append("<XtraBatchField></XtraBatchField>"); 
			payload.append("</Fields>");
			payload.append("</xtraBatchFields>"); 
			payload.append("</BatchAttrSave>");				
			
			int returnCode = SaveBatchAttribute.sendRequest(host + "/Queue/SaveBatchAttribute/" + app, payload.toString(), true);
			if (returnCode != 0)
				throw new RuntimeException("Error al guardar los atributos del batch. Codigo de error " + returnCode);
			
			// Validate additional batch attributes
			batch = GetBatchAttributes.sendRequest(host + "/Queue/GetBatchAttributes/" + app + "/" + batch.getQueueId(), true);
			if (batch.getQueueId() == -1)
				throw new RuntimeException("Error al leer los atributos del batch, queueId invalido");			
			
			// Upload image
			is = this.getClass().getResourceAsStream(resource);
			if (is == null)
				throw new RuntimeException ("Recurso " + resource + " no encontrado");
				
			File f = File.createTempFile("temp", ".tif");
			OutputStream out = new FileOutputStream(f);
			IOUtils.copy(is, out);
			IOUtils.closeQuietly(is);
			Upload upload = UploadFile.sendRequest(host + "/Queue/UploadFile/" + app + "/" + batch.getQueueId(), f, true);
			if (!f.getName().equals(upload.getOriginalFileName()))
				throw new RuntimeException("No se completo el upload de la imagen en el batch");
			
			// Validate image upload
			BatchDCO batchDCO = GetPageFile.sendRequest(host + "/Queue/GetPageFile/" + app + "/" + batch.getQueueId(), true);
			if (batchDCO.getId().isEmpty())
				throw new RuntimeException("Error al leer el pagefile del batch");
			List<Page> pages = batchDCO.getPages();
			if (pages.size() == 0)
				throw new RuntimeException("No se encontro el objecto de la pagina en el pagefile");			
			
			// Release batch
			ReleaseBatch.sendRequest(host + "/Queue/ReleaseBatch/" + app + "/" + batch.getQueueId() + "/finished", true);
			
		} 
		catch (Exception e) 
		{	
			e.printStackTrace();
		}
		
	}

}
