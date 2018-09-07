
package mx.com.inbursa.filenet.expediente.unico.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentoAreplicarVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentoAreplicarVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idsDocumentoOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreDocumentoDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDocumentoDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentoAreplicarVo", propOrder = {
    "idsDocumentoOrigen",
    "nombreDocumentoDestino",
    "tipoDocumentoDestino"
})
public class DocumentoAreplicarVo {

    protected String idsDocumentoOrigen;
    protected String nombreDocumentoDestino;
    protected String tipoDocumentoDestino;

    /**
     * Gets the value of the idsDocumentoOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdsDocumentoOrigen() {
        return idsDocumentoOrigen;
    }

    /**
     * Sets the value of the idsDocumentoOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdsDocumentoOrigen(String value) {
        this.idsDocumentoOrigen = value;
    }

    /**
     * Gets the value of the nombreDocumentoDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDocumentoDestino() {
        return nombreDocumentoDestino;
    }

    /**
     * Sets the value of the nombreDocumentoDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDocumentoDestino(String value) {
        this.nombreDocumentoDestino = value;
    }

    /**
     * Gets the value of the tipoDocumentoDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumentoDestino() {
        return tipoDocumentoDestino;
    }

    /**
     * Sets the value of the tipoDocumentoDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumentoDestino(String value) {
        this.tipoDocumentoDestino = value;
    }

}
