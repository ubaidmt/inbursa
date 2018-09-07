
package mx.com.inbursa.filenet.expediente.unico.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.com.inbursa.filenet.expediente.unico.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReplicarExpediente_QNAME = new QName("http://ws.unico.expediente.filenet.inbursa.com.mx/", "replicarExpediente");
    private final static QName _EliminarDocumentosPorId_QNAME = new QName("http://ws.unico.expediente.filenet.inbursa.com.mx/", "eliminarDocumentosPorId");
    private final static QName _GetDocumentosFolderResponse_QNAME = new QName("http://ws.unico.expediente.filenet.inbursa.com.mx/", "getDocumentosFolderResponse");
    private final static QName _GetTiposDocumentosByTramiteResponse_QNAME = new QName("http://ws.unico.expediente.filenet.inbursa.com.mx/", "getTiposDocumentosByTramiteResponse");
    private final static QName _GetExpedientePorIdPersona_QNAME = new QName("http://ws.unico.expediente.filenet.inbursa.com.mx/", "getExpedientePorIdPersona");
    private final static QName _GetExpedientePorIdPersonaResponse_QNAME = new QName("http://ws.unico.expediente.filenet.inbursa.com.mx/", "getExpedientePorIdPersonaResponse");
    private final static QName _ReplicarExpedienteResponse_QNAME = new QName("http://ws.unico.expediente.filenet.inbursa.com.mx/", "replicarExpedienteResponse");
    private final static QName _GetDocumentosFolder_QNAME = new QName("http://ws.unico.expediente.filenet.inbursa.com.mx/", "getDocumentosFolder");
    private final static QName _GetTiposDocumentosByTramite_QNAME = new QName("http://ws.unico.expediente.filenet.inbursa.com.mx/", "getTiposDocumentosByTramite");
    private final static QName _EliminarDocumentosPorIdResponse_QNAME = new QName("http://ws.unico.expediente.filenet.inbursa.com.mx/", "eliminarDocumentosPorIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.inbursa.filenet.expediente.unico.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReplicarExpedienteResponse }
     * 
     */
    public ReplicarExpedienteResponse createReplicarExpedienteResponse() {
        return new ReplicarExpedienteResponse();
    }

    /**
     * Create an instance of {@link GetExpedientePorIdPersonaResponse }
     * 
     */
    public GetExpedientePorIdPersonaResponse createGetExpedientePorIdPersonaResponse() {
        return new GetExpedientePorIdPersonaResponse();
    }

    /**
     * Create an instance of {@link GetExpedientePorIdPersona }
     * 
     */
    public GetExpedientePorIdPersona createGetExpedientePorIdPersona() {
        return new GetExpedientePorIdPersona();
    }

    /**
     * Create an instance of {@link EliminarDocumentosPorIdResponse }
     * 
     */
    public EliminarDocumentosPorIdResponse createEliminarDocumentosPorIdResponse() {
        return new EliminarDocumentosPorIdResponse();
    }

    /**
     * Create an instance of {@link GetTiposDocumentosByTramite }
     * 
     */
    public GetTiposDocumentosByTramite createGetTiposDocumentosByTramite() {
        return new GetTiposDocumentosByTramite();
    }

    /**
     * Create an instance of {@link GetDocumentosFolder }
     * 
     */
    public GetDocumentosFolder createGetDocumentosFolder() {
        return new GetDocumentosFolder();
    }

    /**
     * Create an instance of {@link GetTiposDocumentosByTramiteResponse }
     * 
     */
    public GetTiposDocumentosByTramiteResponse createGetTiposDocumentosByTramiteResponse() {
        return new GetTiposDocumentosByTramiteResponse();
    }

    /**
     * Create an instance of {@link GetDocumentosFolderResponse }
     * 
     */
    public GetDocumentosFolderResponse createGetDocumentosFolderResponse() {
        return new GetDocumentosFolderResponse();
    }

    /**
     * Create an instance of {@link EliminarDocumentosPorId }
     * 
     */
    public EliminarDocumentosPorId createEliminarDocumentosPorId() {
        return new EliminarDocumentosPorId();
    }

    /**
     * Create an instance of {@link ReplicarExpediente }
     * 
     */
    public ReplicarExpediente createReplicarExpediente() {
        return new ReplicarExpediente();
    }

    /**
     * Create an instance of {@link ResponseExpedienteUnico }
     * 
     */
    public ResponseExpedienteUnico createResponseExpedienteUnico() {
        return new ResponseExpedienteUnico();
    }

    /**
     * Create an instance of {@link TiposDocumentosVO }
     * 
     */
    public TiposDocumentosVO createTiposDocumentosVO() {
        return new TiposDocumentosVO();
    }

    /**
     * Create an instance of {@link DocumentoReplicadoVo }
     * 
     */
    public DocumentoReplicadoVo createDocumentoReplicadoVo() {
        return new DocumentoReplicadoVo();
    }

    /**
     * Create an instance of {@link DatosOrigenVo }
     * 
     */
    public DatosOrigenVo createDatosOrigenVo() {
        return new DatosOrigenVo();
    }

    /**
     * Create an instance of {@link ResponseDocumentosFolder }
     * 
     */
    public ResponseDocumentosFolder createResponseDocumentosFolder() {
        return new ResponseDocumentosFolder();
    }

    /**
     * Create an instance of {@link ResponseDocumentoEliminadoVo }
     * 
     */
    public ResponseDocumentoEliminadoVo createResponseDocumentoEliminadoVo() {
        return new ResponseDocumentoEliminadoVo();
    }

    /**
     * Create an instance of {@link DocumentoAreplicarVo }
     * 
     */
    public DocumentoAreplicarVo createDocumentoAreplicarVo() {
        return new DocumentoAreplicarVo();
    }

    /**
     * Create an instance of {@link ReplicarExpedienteRequestVo }
     * 
     */
    public ReplicarExpedienteRequestVo createReplicarExpedienteRequestVo() {
        return new ReplicarExpedienteRequestVo();
    }

    /**
     * Create an instance of {@link ResponseTiposDocumentosByTramiteVO }
     * 
     */
    public ResponseTiposDocumentosByTramiteVO createResponseTiposDocumentosByTramiteVO() {
        return new ResponseTiposDocumentosByTramiteVO();
    }

    /**
     * Create an instance of {@link ResponseReplicaExpedienteVo }
     * 
     */
    public ResponseReplicaExpedienteVo createResponseReplicaExpedienteVo() {
        return new ResponseReplicaExpedienteVo();
    }

    /**
     * Create an instance of {@link DocumentoEliminadoVo }
     * 
     */
    public DocumentoEliminadoVo createDocumentoEliminadoVo() {
        return new DocumentoEliminadoVo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplicarExpediente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unico.expediente.filenet.inbursa.com.mx/", name = "replicarExpediente")
    public JAXBElement<ReplicarExpediente> createReplicarExpediente(ReplicarExpediente value) {
        return new JAXBElement<ReplicarExpediente>(_ReplicarExpediente_QNAME, ReplicarExpediente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarDocumentosPorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unico.expediente.filenet.inbursa.com.mx/", name = "eliminarDocumentosPorId")
    public JAXBElement<EliminarDocumentosPorId> createEliminarDocumentosPorId(EliminarDocumentosPorId value) {
        return new JAXBElement<EliminarDocumentosPorId>(_EliminarDocumentosPorId_QNAME, EliminarDocumentosPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentosFolderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unico.expediente.filenet.inbursa.com.mx/", name = "getDocumentosFolderResponse")
    public JAXBElement<GetDocumentosFolderResponse> createGetDocumentosFolderResponse(GetDocumentosFolderResponse value) {
        return new JAXBElement<GetDocumentosFolderResponse>(_GetDocumentosFolderResponse_QNAME, GetDocumentosFolderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTiposDocumentosByTramiteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unico.expediente.filenet.inbursa.com.mx/", name = "getTiposDocumentosByTramiteResponse")
    public JAXBElement<GetTiposDocumentosByTramiteResponse> createGetTiposDocumentosByTramiteResponse(GetTiposDocumentosByTramiteResponse value) {
        return new JAXBElement<GetTiposDocumentosByTramiteResponse>(_GetTiposDocumentosByTramiteResponse_QNAME, GetTiposDocumentosByTramiteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExpedientePorIdPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unico.expediente.filenet.inbursa.com.mx/", name = "getExpedientePorIdPersona")
    public JAXBElement<GetExpedientePorIdPersona> createGetExpedientePorIdPersona(GetExpedientePorIdPersona value) {
        return new JAXBElement<GetExpedientePorIdPersona>(_GetExpedientePorIdPersona_QNAME, GetExpedientePorIdPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExpedientePorIdPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unico.expediente.filenet.inbursa.com.mx/", name = "getExpedientePorIdPersonaResponse")
    public JAXBElement<GetExpedientePorIdPersonaResponse> createGetExpedientePorIdPersonaResponse(GetExpedientePorIdPersonaResponse value) {
        return new JAXBElement<GetExpedientePorIdPersonaResponse>(_GetExpedientePorIdPersonaResponse_QNAME, GetExpedientePorIdPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplicarExpedienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unico.expediente.filenet.inbursa.com.mx/", name = "replicarExpedienteResponse")
    public JAXBElement<ReplicarExpedienteResponse> createReplicarExpedienteResponse(ReplicarExpedienteResponse value) {
        return new JAXBElement<ReplicarExpedienteResponse>(_ReplicarExpedienteResponse_QNAME, ReplicarExpedienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentosFolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unico.expediente.filenet.inbursa.com.mx/", name = "getDocumentosFolder")
    public JAXBElement<GetDocumentosFolder> createGetDocumentosFolder(GetDocumentosFolder value) {
        return new JAXBElement<GetDocumentosFolder>(_GetDocumentosFolder_QNAME, GetDocumentosFolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTiposDocumentosByTramite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unico.expediente.filenet.inbursa.com.mx/", name = "getTiposDocumentosByTramite")
    public JAXBElement<GetTiposDocumentosByTramite> createGetTiposDocumentosByTramite(GetTiposDocumentosByTramite value) {
        return new JAXBElement<GetTiposDocumentosByTramite>(_GetTiposDocumentosByTramite_QNAME, GetTiposDocumentosByTramite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarDocumentosPorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unico.expediente.filenet.inbursa.com.mx/", name = "eliminarDocumentosPorIdResponse")
    public JAXBElement<EliminarDocumentosPorIdResponse> createEliminarDocumentosPorIdResponse(EliminarDocumentosPorIdResponse value) {
        return new JAXBElement<EliminarDocumentosPorIdResponse>(_EliminarDocumentosPorIdResponse_QNAME, EliminarDocumentosPorIdResponse.class, null, value);
    }

}
