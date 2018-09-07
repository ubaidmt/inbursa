
package mx.com.inbursa.sii.filenet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datosOrigen" type="{http://ws.filenet.sii.inbursa.com.mx/}datosOrigenVo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteDocument", propOrder = {
    "idDocumento",
    "datosOrigen"
})
public class DeleteDocument {

    protected String idDocumento;
    protected DatosOrigenVo datosOrigen;

    /**
     * Gets the value of the idDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocumento() {
        return idDocumento;
    }

    /**
     * Sets the value of the idDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocumento(String value) {
        this.idDocumento = value;
    }

    /**
     * Gets the value of the datosOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link DatosOrigenVo }
     *     
     */
    public DatosOrigenVo getDatosOrigen() {
        return datosOrigen;
    }

    /**
     * Sets the value of the datosOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosOrigenVo }
     *     
     */
    public void setDatosOrigen(DatosOrigenVo value) {
        this.datosOrigen = value;
    }

}
