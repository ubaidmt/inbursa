
package mx.com.inbursa.filenet.expediente.unico.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getExpedientePorIdPersonaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getExpedientePorIdPersonaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.unico.expediente.filenet.inbursa.com.mx/}responseExpedienteUnico" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExpedientePorIdPersonaResponse", propOrder = {
    "_return"
})
public class GetExpedientePorIdPersonaResponse {

    @XmlElement(name = "return")
    protected ResponseExpedienteUnico _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseExpedienteUnico }
     *     
     */
    public ResponseExpedienteUnico getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseExpedienteUnico }
     *     
     */
    public void setReturn(ResponseExpedienteUnico value) {
        this._return = value;
    }

}
