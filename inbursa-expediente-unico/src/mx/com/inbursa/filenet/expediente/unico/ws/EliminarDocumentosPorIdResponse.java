
package mx.com.inbursa.filenet.expediente.unico.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eliminarDocumentosPorIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eliminarDocumentosPorIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.unico.expediente.filenet.inbursa.com.mx/}responseDocumentoEliminadoVo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarDocumentosPorIdResponse", propOrder = {
    "_return"
})
public class EliminarDocumentosPorIdResponse {

    @XmlElement(name = "return")
    protected ResponseDocumentoEliminadoVo _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseDocumentoEliminadoVo }
     *     
     */
    public ResponseDocumentoEliminadoVo getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDocumentoEliminadoVo }
     *     
     */
    public void setReturn(ResponseDocumentoEliminadoVo value) {
        this._return = value;
    }

}
