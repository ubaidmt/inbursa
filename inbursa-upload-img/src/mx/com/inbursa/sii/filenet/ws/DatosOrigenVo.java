
package mx.com.inbursa.sii.filenet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosOrigenVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datosOrigenVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sistemaOrigen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosOrigenVo", propOrder = {
    "sistemaOrigen",
    "usuario"
})
public class DatosOrigenVo {

    protected int sistemaOrigen;
    protected String usuario;

    /**
     * Gets the value of the sistemaOrigen property.
     * 
     */
    public int getSistemaOrigen() {
        return sistemaOrigen;
    }

    /**
     * Sets the value of the sistemaOrigen property.
     * 
     */
    public void setSistemaOrigen(int value) {
        this.sistemaOrigen = value;
    }

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

}
