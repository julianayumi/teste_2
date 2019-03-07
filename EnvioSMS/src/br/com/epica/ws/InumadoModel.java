
package br.com.epica.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de inumadoModel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="inumadoModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numGaveta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inumadoModel", propOrder = {
    "dataMov",
    "descrMov",
    "lugar",
    "nome",
    "numGaveta",
    "tipoMov"
})
public class InumadoModel {

    protected String dataMov;
    protected String descrMov;
    protected String lugar;
    protected String nome;
    protected String numGaveta;
    protected String tipoMov;

    /**
     * Obtém o valor da propriedade dataMov.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataMov() {
        return dataMov;
    }

    /**
     * Define o valor da propriedade dataMov.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataMov(String value) {
        this.dataMov = value;
    }

    /**
     * Obtém o valor da propriedade descrMov.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrMov() {
        return descrMov;
    }

    /**
     * Define o valor da propriedade descrMov.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrMov(String value) {
        this.descrMov = value;
    }

    /**
     * Obtém o valor da propriedade lugar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Define o valor da propriedade lugar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugar(String value) {
        this.lugar = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade numGaveta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumGaveta() {
        return numGaveta;
    }

    /**
     * Define o valor da propriedade numGaveta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumGaveta(String value) {
        this.numGaveta = value;
    }

    /**
     * Obtém o valor da propriedade tipoMov.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMov() {
        return tipoMov;
    }

    /**
     * Define o valor da propriedade tipoMov.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMov(String value) {
        this.tipoMov = value;
    }

}
