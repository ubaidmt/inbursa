
package mx.com.inbursa.filenet.expediente.unico.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for replicarExpediente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="replicarExpediente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="replicarExpedienteVo" type="{http://ws.unico.expediente.filenet.inbursa.com.mx/}replicarExpedienteRequestVo" minOccurs="0"/>
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
@XmlType(name = "replicarExpediente", propOrder = {
    "replicarExpedienteVo",
    "datosOrigen"
})
public class ReplicarExpediente {

    protected ReplicarExpedienteRequestVo replicarExpedienteVo;
    protected DatosOrigenVo datosOrigen;

    /**
     * Gets the value of the replicarExpedienteVo property.
     * 
     * @return
     *     possible object is
     *     {@link ReplicarExpedienteRequestVo }
     *     
     */
    public ReplicarExpedienteRequestVo getReplicarExpedienteVo() {
        return replicarExpedienteVo;
    }

    /**
     * Sets the value of the replicarExpedienteVo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplicarExpedienteRequestVo }
     *     
     */
    public void setReplicarExpedienteVo(ReplicarExpedienteRequestVo value) {
        this.replicarExpedienteVo = value;
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
