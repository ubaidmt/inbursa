
package mx.com.inbursa.filenet.expediente.unico.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentoReplicadoVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentoReplicadoVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="idDocumentoOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentoReplicadoVo", propOrder = {
    "descError",
    "error",
    "idDocumentoOrigen"
})
public class DocumentoReplicadoVo {

    protected String descError;
    protected boolean error;
    protected String idDocumentoOrigen;

    /**
     * Gets the value of the descError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescError() {
        return descError;
    }

    /**
     * Sets the value of the descError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescError(String value) {
        this.descError = value;
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
     * Gets the value of the idDocumentoOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocumentoOrigen() {
        return idDocumentoOrigen;
    }

    /**
     * Sets the value of the idDocumentoOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocumentoOrigen(String value) {
        this.idDocumentoOrigen = value;
    }

}
