
package mx.com.inbursa.filenet.expediente.unico.ws;

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
@WebService(name = "ExpedienteUnico", targetNamespace = "http://ws.unico.expediente.filenet.inbursa.com.mx/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ExpedienteUnico {


    /**
     * 
     * @param replicarExpedienteVo
     * @param datosOrigen
     * @return
     *     returns mx.com.inbursa.filenet.expediente.unico.ws.ResponseReplicaExpedienteVo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "replicarExpediente", targetNamespace = "http://ws.unico.expediente.filenet.inbursa.com.mx/", className = "mx.com.inbursa.filenet.expediente.unico.ws.ReplicarExpediente")
    @ResponseWrapper(localName = "replicarExpedienteResponse", targetNamespace = "http://ws.unico.expediente.filenet.inbursa.com.mx/", className = "mx.com.inbursa.filenet.expediente.unico.ws.ReplicarExpedienteResponse")
    public ResponseReplicaExpedienteVo replicarExpediente(
        @WebParam(name = "replicarExpedienteVo", targetNamespace = "")
        ReplicarExpedienteRequestVo replicarExpedienteVo,
        @WebParam(name = "datosOrigen", targetNamespace = "")
        DatosOrigenVo datosOrigen);

    /**
     * 
     * @param idsDocumento
     * @param datosOrigen
     * @return
     *     returns mx.com.inbursa.filenet.expediente.unico.ws.ResponseDocumentoEliminadoVo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarDocumentosPorId", targetNamespace = "http://ws.unico.expediente.filenet.inbursa.com.mx/", className = "mx.com.inbursa.filenet.expediente.unico.ws.EliminarDocumentosPorId")
    @ResponseWrapper(localName = "eliminarDocumentosPorIdResponse", targetNamespace = "http://ws.unico.expediente.filenet.inbursa.com.mx/", className = "mx.com.inbursa.filenet.expediente.unico.ws.EliminarDocumentosPorIdResponse")
    public ResponseDocumentoEliminadoVo eliminarDocumentosPorId(
        @WebParam(name = "idsDocumento", targetNamespace = "")
        List<String> idsDocumento,
        @WebParam(name = "datosOrigen", targetNamespace = "")
        DatosOrigenVo datosOrigen);

    /**
     * 
     * @param claveTramite
     * @return
     *     returns mx.com.inbursa.filenet.expediente.unico.ws.ResponseTiposDocumentosByTramiteVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTiposDocumentosByTramite", targetNamespace = "http://ws.unico.expediente.filenet.inbursa.com.mx/", className = "mx.com.inbursa.filenet.expediente.unico.ws.GetTiposDocumentosByTramite")
    @ResponseWrapper(localName = "getTiposDocumentosByTramiteResponse", targetNamespace = "http://ws.unico.expediente.filenet.inbursa.com.mx/", className = "mx.com.inbursa.filenet.expediente.unico.ws.GetTiposDocumentosByTramiteResponse")
    public ResponseTiposDocumentosByTramiteVO getTiposDocumentosByTramite(
        @WebParam(name = "claveTramite", targetNamespace = "")
        String claveTramite);

    /**
     * 
     * @param idspersona
     * @param datosOrigen
     * @return
     *     returns mx.com.inbursa.filenet.expediente.unico.ws.ResponseExpedienteUnico
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getExpedientePorIdPersona", targetNamespace = "http://ws.unico.expediente.filenet.inbursa.com.mx/", className = "mx.com.inbursa.filenet.expediente.unico.ws.GetExpedientePorIdPersona")
    @ResponseWrapper(localName = "getExpedientePorIdPersonaResponse", targetNamespace = "http://ws.unico.expediente.filenet.inbursa.com.mx/", className = "mx.com.inbursa.filenet.expediente.unico.ws.GetExpedientePorIdPersonaResponse")
    public ResponseExpedienteUnico getExpedientePorIdPersona(
        @WebParam(name = "idspersona", targetNamespace = "")
        List<String> idspersona,
        @WebParam(name = "datosOrigen", targetNamespace = "")
        DatosOrigenVo datosOrigen);

    /**
     * 
     * @param idFolder
     * @param datosOrigen
     * @return
     *     returns mx.com.inbursa.filenet.expediente.unico.ws.ResponseDocumentosFolder
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDocumentosFolder", targetNamespace = "http://ws.unico.expediente.filenet.inbursa.com.mx/", className = "mx.com.inbursa.filenet.expediente.unico.ws.GetDocumentosFolder")
    @ResponseWrapper(localName = "getDocumentosFolderResponse", targetNamespace = "http://ws.unico.expediente.filenet.inbursa.com.mx/", className = "mx.com.inbursa.filenet.expediente.unico.ws.GetDocumentosFolderResponse")
    public ResponseDocumentosFolder getDocumentosFolder(
        @WebParam(name = "idFolder", targetNamespace = "")
        String idFolder,
        @WebParam(name = "datosOrigen", targetNamespace = "")
        DatosOrigenVo datosOrigen);

}