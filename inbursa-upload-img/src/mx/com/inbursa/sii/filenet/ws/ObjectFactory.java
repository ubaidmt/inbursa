
package mx.com.inbursa.sii.filenet.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.com.inbursa.sii.filenet.ws package. 
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

    private final static QName _DeleteDocumentResponse_QNAME = new QName("http://ws.filenet.sii.inbursa.com.mx/", "deleteDocumentResponse");
    private final static QName _DeleteDocument_QNAME = new QName("http://ws.filenet.sii.inbursa.com.mx/", "deleteDocument");
    private final static QName _UploadDocument_QNAME = new QName("http://ws.filenet.sii.inbursa.com.mx/", "uploadDocument");
    private final static QName _UploadDocumentResponse_QNAME = new QName("http://ws.filenet.sii.inbursa.com.mx/", "uploadDocumentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.inbursa.sii.filenet.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteDocumentResponse }
     * 
     */
    public DeleteDocumentResponse createDeleteDocumentResponse() {
        return new DeleteDocumentResponse();
    }

    /**
     * Create an instance of {@link UploadDocument }
     * 
     */
    public UploadDocument createUploadDocument() {
        return new UploadDocument();
    }

    /**
     * Create an instance of {@link DeleteDocument }
     * 
     */
    public DeleteDocument createDeleteDocument() {
        return new DeleteDocument();
    }

    /**
     * Create an instance of {@link UploadDocumentResponse }
     * 
     */
    public UploadDocumentResponse createUploadDocumentResponse() {
        return new UploadDocumentResponse();
    }

    /**
     * Create an instance of {@link ResponseDocumentVO }
     * 
     */
    public ResponseDocumentVO createResponseDocumentVO() {
        return new ResponseDocumentVO();
    }

    /**
     * Create an instance of {@link DocumentoVO }
     * 
     */
    public DocumentoVO createDocumentoVO() {
        return new DocumentoVO();
    }

    /**
     * Create an instance of {@link DocumentoEliminadoVO }
     * 
     */
    public DocumentoEliminadoVO createDocumentoEliminadoVO() {
        return new DocumentoEliminadoVO();
    }

    /**
     * Create an instance of {@link DatosOrigenVo }
     * 
     */
    public DatosOrigenVo createDatosOrigenVo() {
        return new DatosOrigenVo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.filenet.sii.inbursa.com.mx/", name = "deleteDocumentResponse")
    public JAXBElement<DeleteDocumentResponse> createDeleteDocumentResponse(DeleteDocumentResponse value) {
        return new JAXBElement<DeleteDocumentResponse>(_DeleteDocumentResponse_QNAME, DeleteDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.filenet.sii.inbursa.com.mx/", name = "deleteDocument")
    public JAXBElement<DeleteDocument> createDeleteDocument(DeleteDocument value) {
        return new JAXBElement<DeleteDocument>(_DeleteDocument_QNAME, DeleteDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.filenet.sii.inbursa.com.mx/", name = "uploadDocument")
    public JAXBElement<UploadDocument> createUploadDocument(UploadDocument value) {
        return new JAXBElement<UploadDocument>(_UploadDocument_QNAME, UploadDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.filenet.sii.inbursa.com.mx/", name = "uploadDocumentResponse")
    public JAXBElement<UploadDocumentResponse> createUploadDocumentResponse(UploadDocumentResponse value) {
        return new JAXBElement<UploadDocumentResponse>(_UploadDocumentResponse_QNAME, UploadDocumentResponse.class, null, value);
    }

}
