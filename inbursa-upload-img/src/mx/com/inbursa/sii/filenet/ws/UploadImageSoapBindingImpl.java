package mx.com.inbursa.sii.filenet.ws;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.WebServiceException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.codec.binary.Base64;

@javax.jws.WebService (endpointInterface="mx.com.inbursa.sii.filenet.ws.UploadImage", targetNamespace="http://ws.filenet.sii.inbursa.com.mx/", serviceName="UploadImage", portName="UpLoadImageImplPort")
public class UploadImageSoapBindingImpl{

    public List<DocumentoEliminadoVO> deleteDocument(String idDocumento, DatosOrigenVo datosOrigen) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<ResponseDocumentVO> uploadDocument(List<DocumentoVO> documento, String negocio, String producto, String tramite, DatosOrigenVo datosOrigen) {
    	List<ResponseDocumentVO> response = new ArrayList<ResponseDocumentVO>();
    	
    	for (DocumentoVO docReq : documento) {
    		ResponseDocumentVO docResp = new ResponseDocumentVO();
    		try {
    			
    			if (docReq.getBase64Documento() == null)
    				throw new WebServiceException("No se incluyo la imagen en la peticion del servicio");
    			
    			File file = new File(docReq.getNombreDocumento() + "." + docReq.getExtension());
    			FileUtils.writeByteArrayToFile(file, Base64.decodeBase64(docReq.base64Documento), false);
	        	
	    		docResp.setError(0);
	    		docResp.setDescripcion("Datos recibidos: " + negocio + "," + producto + "," + tramite + "," + datosOrigen.getSistemaOrigen() + "," + datosOrigen.getUsuario());
	    		docResp.setNombreImagen(file.getPath());
	    		docResp.setTipoDocumento(docReq.getTipoDocumento());
	    		
    		} catch (IOException ioe) {
    			docResp.setError(1);
    			docResp.setDescripcion(ioe.toString());
    			
    		} catch (WebServiceException wse) {
    			docResp.setError(1);
    			docResp.setDescripcion(wse.toString());
    		}
    		response.add(docResp);
    	}

    	return response;
    }

}