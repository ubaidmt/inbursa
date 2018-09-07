
package mx.com.inbursa.filenet.expediente.unico.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDocumentosFolder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDocumentosFolder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idFolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datosOrigen" type="{http://ws.unico.expediente.filenet.inbursa.com.mx/}datosOrigenVo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDocumentosFolder", propOrder = {
    "idFolder",
    "datosOrigen"
})
public class GetDocumentosFolder {

    protected String idFolder;
    protected DatosOrigenVo datosOrigen;

    /**
     * Gets the value of the idFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFolder() {
        return idFolder;
    }

    /**
     * Sets the value of the idFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFolder(String value) {
        this.idFolder = value;
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
