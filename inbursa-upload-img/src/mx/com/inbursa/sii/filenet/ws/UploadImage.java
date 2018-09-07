
package mx.com.inbursa.sii.filenet.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UploadImage", targetNamespace = "http://ws.filenet.sii.inbursa.com.mx/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UploadImage {


    /**
     * 
     * @param idDocumento
     * @param datosOrigen
     * @return
     *     returns java.util.List<mx.com.inbursa.sii.filenet.ws.DocumentoEliminadoVO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteDocument", targetNamespace = "http://ws.filenet.sii.inbursa.com.mx/", className = "mx.com.inbursa.sii.filenet.ws.DeleteDocument")
    @ResponseWrapper(localName = "deleteDocumentResponse", targetNamespace = "http://ws.filenet.sii.inbursa.com.mx/", className = "mx.com.inbursa.sii.filenet.ws.DeleteDocumentResponse")
    public List<DocumentoEliminadoVO> deleteDocument(
        @WebParam(name = "idDocumento", targetNamespace = "")
        String idDocumento,
        @WebParam(name = "datosOrigen", targetNamespace = "")
        DatosOrigenVo datosOrigen);

    /**
     * 
     * @param negocio
     * @param producto
     * @param documento
     * @param tramite
     * @param datosOrigen
     * @return
     *     returns java.util.List<mx.com.inbursa.sii.filenet.ws.ResponseDocumentVO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "uploadDocument", targetNamespace = "http://ws.filenet.sii.inbursa.com.mx/", className = "mx.com.inbursa.sii.filenet.ws.UploadDocument")
    @ResponseWrapper(localName = "uploadDocumentResponse", targetNamespace = "http://ws.filenet.sii.inbursa.com.mx/", className = "mx.com.inbursa.sii.filenet.ws.UploadDocumentResponse")
    public List<ResponseDocumentVO> uploadDocument(
        @WebParam(name = "documento", targetNamespace = "")
        List<DocumentoVO> documento,
        @WebParam(name = "negocio", targetNamespace = "")
        String negocio,
        @WebParam(name = "producto", targetNamespace = "")
        String producto,
        @WebParam(name = "tramite", targetNamespace = "")
        String tramite,
        @WebParam(name = "datosOrigen", targetNamespace = "")
        DatosOrigenVo datosOrigen);

}