
package mx.com.inbursa.sii.filenet.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documento" type="{http://ws.filenet.sii.inbursa.com.mx/}documentoVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="negocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tramite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "uploadDocument", propOrder = {
    "documento",
    "negocio",
    "producto",
    "tramite",
    "datosOrigen"
})
public class UploadDocument {

    protected List<DocumentoVO> documento;
    protected String negocio;
    protected String producto;
    protected String tramite;
    protected DatosOrigenVo datosOrigen;

    /**
     * Gets the value of the documento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentoVO }
     * 
     * 
     */
    public List<DocumentoVO> getDocumento() {
        if (documento == null) {
            documento = new ArrayList<DocumentoVO>();
        }
        return this.documento;
    }

    /**
     * Gets the value of the negocio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegocio() {
        return negocio;
    }

    /**
     * Sets the value of the negocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegocio(String value) {
        this.negocio = value;
    }

    /**
     * Gets the value of the producto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Sets the value of the producto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducto(String value) {
        this.producto = value;
    }

    /**
     * Gets the value of the tramite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTramite() {
        return tramite;
    }

    /**
     * Sets the value of the tramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTramite(String value) {
        this.tramite = value;
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
