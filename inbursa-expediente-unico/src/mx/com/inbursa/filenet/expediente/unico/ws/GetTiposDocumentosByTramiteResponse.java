
package mx.com.inbursa.filenet.expediente.unico.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTiposDocumentosByTramiteResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTiposDocumentosByTramiteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.unico.expediente.filenet.inbursa.com.mx/}responseTiposDocumentosByTramiteVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTiposDocumentosByTramiteResponse", propOrder = {
    "_return"
})
public class GetTiposDocumentosByTramiteResponse {

    @XmlElement(name = "return")
    protected ResponseTiposDocumentosByTramiteVO _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseTiposDocumentosByTramiteVO }
     *     
     */
    public ResponseTiposDocumentosByTramiteVO getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseTiposDocumentosByTramiteVO }
     *     
     */
    public void setReturn(ResponseTiposDocumentosByTramiteVO value) {
        this._return = value;
    }

}
