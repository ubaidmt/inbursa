
package mx.com.inbursa.filenet.expediente.unico.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseExpedienteUnico complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseExpedienteUnico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripcionError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="jsonExpedienteUnico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseExpedienteUnico", propOrder = {
    "descripcionError",
    "error",
    "jsonExpedienteUnico"
})
public class ResponseExpedienteUnico {

    protected String descripcionError;
    protected boolean error;
    protected String jsonExpedienteUnico;

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
     * Gets the value of the jsonExpedienteUnico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJsonExpedienteUnico() {
        return jsonExpedienteUnico;
    }

    /**
     * Sets the value of the jsonExpedienteUnico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJsonExpedienteUnico(String value) {
        this.jsonExpedienteUnico = value;
    }

}
