
package mx.com.inbursa.filenet.expediente.unico.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseDocumentoEliminadoVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseDocumentoEliminadoVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripcionError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentosEliminados" type="{http://ws.unico.expediente.filenet.inbursa.com.mx/}documentoEliminadoVo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseDocumentoEliminadoVo", propOrder = {
    "descripcionError",
    "documentosEliminados",
    "error"
})
public class ResponseDocumentoEliminadoVo {

    protected String descripcionError;
    @XmlElement(nillable = true)
    protected List<DocumentoEliminadoVo> documentosEliminados;
    protected boolean error;

    /**
     * Gets the value of the descripcionError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionError() {
        return descripcionError;
    }

    /**
     * Sets the value of the descripcionError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionError(String value) {
        this.descripcionError = value;
    }

    /**
     * Gets the value of the documentosEliminados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentosEliminados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentosEliminados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentoEliminadoVo }
     * 
     * 
     */
    public List<DocumentoEliminadoVo> getDocumentosEliminados() {
        if (documentosEliminados == null) {
            documentosEliminados = new ArrayList<DocumentoEliminadoVo>();
        }
        return this.documentosEliminados;
    }

    /**
     * Gets the value of the error property.
     * 
     */
    public boolean isError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     */
    public void setError(boolean value) {
        this.error = value;
    }

}
