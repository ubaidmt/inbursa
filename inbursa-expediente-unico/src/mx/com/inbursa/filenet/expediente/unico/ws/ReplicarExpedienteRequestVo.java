
package mx.com.inbursa.filenet.expediente.unico.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for replicarExpedienteRequestVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="replicarExpedienteRequestVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentosAreplicar" type="{http://ws.unico.expediente.filenet.inbursa.com.mx/}documentoAreplicarVo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="folioTysDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="llavesNegocio" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tramiteDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "replicarExpedienteRequestVo", propOrder = {
    "documentosAreplicar",
    "folioTysDestino",
    "llavesNegocio",
    "tramiteDestino"
})
public class ReplicarExpedienteRequestVo {

    @XmlElement(nillable = true)
    protected List<DocumentoAreplicarVo> documentosAreplicar;
    protected String folioTysDestino;
    @XmlElement(nillable = true)
    protected List<String> llavesNegocio;
    protected String tramiteDestino;

    /**
     * Gets the value of the documentosAreplicar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentosAreplicar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentosAreplicar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentoAreplicarVo }
     * 
     * 
     */
    public List<DocumentoAreplicarVo> getDocumentosAreplicar() {
        if (documentosAreplicar == null) {
            documentosAreplicar = new ArrayList<DocumentoAreplicarVo>();
        }
        return this.documentosAreplicar;
    }

    /**
     * Gets the value of the folioTysDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioTysDestino() {
        return folioTysDestino;
    }

    /**
     * Sets the value of the folioTysDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioTysDestino(String value) {
        this.folioTysDestino = value;
    }

    /**
     * Gets the value of the llavesNegocio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the llavesNegocio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLlavesNegocio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLlavesNegocio() {
        if (llavesNegocio == null) {
            llavesNegocio = new ArrayList<String>();
        }
        return this.llavesNegocio;
    }

    /**
     * Gets the value of the tramiteDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTramiteDestino() {
        return tramiteDestino;
    }

    /**
     * Sets the value of the tramiteDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTramiteDestino(String value) {
        this.tramiteDestino = value;
    }

}
