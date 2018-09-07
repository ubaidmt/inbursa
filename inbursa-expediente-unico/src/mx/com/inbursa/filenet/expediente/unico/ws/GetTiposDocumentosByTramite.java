
package mx.com.inbursa.filenet.expediente.unico.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTiposDocumentosByTramite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTiposDocumentosByTramite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claveTramite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTiposDocumentosByTramite", propOrder = {
    "claveTramite"
})
public class GetTiposDocumentosByTramite {

    protected String claveTramite;

    /**
     * Gets the value of the claveTramite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveTramite() {
        return claveTramite;
    }

    /**
     * Sets the value of the claveTramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveTramite(String value) {
        this.claveTramite = value;
    }

}
