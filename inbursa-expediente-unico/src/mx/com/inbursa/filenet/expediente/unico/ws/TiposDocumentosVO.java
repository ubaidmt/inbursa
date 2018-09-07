
package mx.com.inbursa.filenet.expediente.unico.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tiposDocumentosVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tiposDocumentosVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claseDocumental" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claveTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idTramite" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tiposDocumentosVO", propOrder = {
    "claseDocumental",
    "claveTipoDocumento",
    "descripcionTipoDocumento",
    "idTipoDocumento",
    "idTramite"
})
public class TiposDocumentosVO {

    protected String claseDocumental;
    protected String claveTipoDocumento;
    protected String descripcionTipoDocumento;
    protected Long idTipoDocumento;
    protected Long idTramite;

    /**
     * Gets the value of the claseDocumental property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaseDocumental() {
        return claseDocumental;
    }

    /**
     * Sets the value of the claseDocumental property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaseDocumental(String value) {
        this.claseDocumental = value;
    }

    /**
     * Gets the value of the claveTipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveTipoDocumento() {
        return claveTipoDocumento;
    }

    /**
     * Sets the value of the claveTipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveTipoDocumento(String value) {
        this.claveTipoDocumento = value;
    }

    /**
     * Gets the value of the descripcionTipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionTipoDocumento() {
        return descripcionTipoDocumento;
    }

    /**
     * Sets the value of the descripcionTipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionTipoDocumento(String value) {
        this.descripcionTipoDocumento = value;
    }

    /**
     * Gets the value of the idTipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTipoDocumento() {
        return idTipoDocumento;
    }

    /**
     * Sets the value of the idTipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTipoDocumento(Long value) {
        this.idTipoDocumento = value;
    }

    /**
     * Gets the value of the idTramite property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTramite() {
        return idTramite;
    }

    /**
     * Sets the value of the idTramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTramite(Long value) {
        this.idTramite = value;
    }

}
