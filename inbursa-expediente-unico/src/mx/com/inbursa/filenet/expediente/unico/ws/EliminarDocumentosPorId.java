
package mx.com.inbursa.filenet.expediente.unico.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eliminarDocumentosPorId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eliminarDocumentosPorId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idsDocumento" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "eliminarDocumentosPorId", propOrder = {
    "idsDocumento",
    "datosOrigen"
})
public class EliminarDocumentosPorId {

    protected List<String> idsDocumento;
    protected DatosOrigenVo datosOrigen;

    /**
     * Gets the value of the idsDocumento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idsDocumento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdsDocumento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdsDocumento() {
        if (idsDocumento == null) {
            idsDocumento = new ArrayList<String>();
        }
        return this.idsDocumento;
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
