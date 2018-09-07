
package mx.com.inbursa.filenet.expediente.unico.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseTiposDocumentosByTramiteVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseTiposDocumentosByTramiteVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="errorDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listaTiposDocumentos" type="{http://ws.unico.expediente.filenet.inbursa.com.mx/}tiposDocumentosVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseTiposDocumentosByTramiteVO", propOrder = {
    "error",
    "errorDescripcion",
    "listaTiposDocumentos"
})
public class ResponseTiposDocumentosByTramiteVO {

    protected boolean error;
    protected String errorDescripcion;
    @XmlElement(nillable = true)
    protected List<TiposDocumentosVO> listaTiposDocumentos;

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
     * Gets the value of the errorDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescripcion() {
        return errorDescripcion;
    }

    /**
     * Sets the value of the errorDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescripcion(String value) {
        this.errorDescripcion = value;
    }

    /**
     * Gets the value of the listaTiposDocumentos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaTiposDocumentos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaTiposDocumentos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TiposDocumentosVO }
     * 
     * 
     */
    public List<TiposDocumentosVO> getListaTiposDocumentos() {
        if (listaTiposDocumentos == null) {
            listaTiposDocumentos = new ArrayList<TiposDocumentosVO>();
        }
        return this.listaTiposDocumentos;
    }

}
