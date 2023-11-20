
package pe.mijael.autosservice.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autos" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "autos"
})
@XmlRootElement(name = "AutosResponse")
public class AutosResponse {

    protected List<AutosResponse.Autos> autos;

    /**
     * Gets the value of the autos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the autos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutosResponse.Autos }
     * 
     * 
     */
    public List<AutosResponse.Autos> getAutos() {
        if (autos == null) {
            autos = new ArrayList<AutosResponse.Autos>();
        }
        return this.autos;
    }

    public void setAutos(List<AutosResponse.Autos> autos){
        this.autos = autos;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "marca",
        "modelo",
        "placa",
        "precio"
    })
    public static class Autos {

        protected int id;
        @XmlElement(required = true)
        protected String marca;
        @XmlElement(required = true)
        protected String modelo;
        @XmlElement(required = true)
        protected String placa;
        protected float precio;

        /**
         * Obtiene el valor de la propiedad id.
         * 
         */
        public int getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         */
        public void setId(int value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad marca.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMarca() {
            return marca;
        }

        /**
         * Define el valor de la propiedad marca.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMarca(String value) {
            this.marca = value;
        }

        /**
         * Obtiene el valor de la propiedad modelo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModelo() {
            return modelo;
        }

        /**
         * Define el valor de la propiedad modelo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModelo(String value) {
            this.modelo = value;
        }

        /**
         * Obtiene el valor de la propiedad placa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaca() {
            return placa;
        }

        /**
         * Define el valor de la propiedad placa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaca(String value) {
            this.placa = value;
        }

        /**
         * Obtiene el valor de la propiedad precio.
         * 
         */
        public float getPrecio() {
            return precio;
        }

        /**
         * Define el valor de la propiedad precio.
         * 
         */
        public void setPrecio(float value) {
            this.precio = value;
        }

    }

}
