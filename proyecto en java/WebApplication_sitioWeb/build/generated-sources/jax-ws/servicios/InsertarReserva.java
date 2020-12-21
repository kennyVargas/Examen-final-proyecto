
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InsertarReserva complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InsertarReserva"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idpaciente" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idmedico" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="hora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertarReserva", propOrder = {
    "idpaciente",
    "idmedico",
    "hora",
    "fecha"
})
public class InsertarReserva {

    protected int idpaciente;
    protected int idmedico;
    protected String hora;
    protected String fecha;

    /**
     * Obtiene el valor de la propiedad idpaciente.
     * 
     */
    public int getIdpaciente() {
        return idpaciente;
    }

    /**
     * Define el valor de la propiedad idpaciente.
     * 
     */
    public void setIdpaciente(int value) {
        this.idpaciente = value;
    }

    /**
     * Obtiene el valor de la propiedad idmedico.
     * 
     */
    public int getIdmedico() {
        return idmedico;
    }

    /**
     * Define el valor de la propiedad idmedico.
     * 
     */
    public void setIdmedico(int value) {
        this.idmedico = value;
    }

    /**
     * Obtiene el valor de la propiedad hora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHora() {
        return hora;
    }

    /**
     * Define el valor de la propiedad hora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHora(String value) {
        this.hora = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

}
