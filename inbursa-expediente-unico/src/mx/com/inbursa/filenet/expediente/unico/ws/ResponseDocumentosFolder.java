
package mx.com.inbursa.filenet.expediente.unico.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseDocumentosFolder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseDocumentosFolder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="errorDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jsonDocumentosFolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseDocumentosFolder", propOrder = {
    "error",
    "errorDescripcion",
    "jsonDocumentosFolder"
})
public class ResponseDocumentosFolder {

    protected boolean error;
    protected String errorDescripcion;
    protected String jsonDocumentosFolder;

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

    /**
     * Gets the value of the errorDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescripcion() {
        return errorDescripcion;
    }

    /**
     * Sets the value of the errorDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescripcion(String value) {
        this.errorDescripcion = value;
    }

    /**
     * Gets the value of the jsonDocumentosFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJsonDocumentosFolder() {
        return jsonDocumentosFolder;
    }

    /**
     * Sets the value of the jsonDocumentosFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJsonDocumentosFolder(String value) {
        this.jsonDocumentosFolder = value;
    }

}
