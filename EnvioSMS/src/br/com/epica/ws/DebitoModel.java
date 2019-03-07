
package br.com.epica.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de debitoModel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="debitoModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codempresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datavencto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nossoNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numparc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiporec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorparc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "debitoModel", propOrder = {
    "codempresa",
    "codigo",
    "datavencto",
    "nossoNumero",
    "numparc",
    "tiporec",
    "valorparc"
})
public class DebitoModel {

    protected String codempresa;
    protected String codigo;
    protected String datavencto;
    protected String nossoNumero;
    protected String numparc;
    protected String tiporec;
    protected String valorparc;

    /**
     * Obtém o valor da propriedade codempresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodempresa() {
        return codempresa;
    }

    /**
     * Define o valor da propriedade codempresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodempresa(String value) {
        this.codempresa = value;
    }

    /**
     * Obtém o valor da propriedade codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtém o valor da propriedade datavencto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatavencto() {
        return datavencto;
    }

    /**
     * Define o valor da propriedade datavencto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatavencto(String value) {
        this.datavencto = value;
    }

    /**
     * Obtém o valor da propriedade nossoNumero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNossoNumero() {
        return nossoNumero;
    }

    /**
     * Define o valor da propriedade nossoNumero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNossoNumero(String value) {
        this.nossoNumero = value;
    }

    /**
     * Obtém o valor da propriedade numparc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumparc() {
        return numparc;
    }

    /**
     * Define o valor da propriedade numparc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumparc(String value) {
        this.numparc = value;
    }

    /**
     * Obtém o valor da propriedade tiporec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiporec() {
        return tiporec;
    }

    /**
     * Define o valor da propriedade tiporec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiporec(String value) {
        this.tiporec = value;
    }

    /**
     * Obtém o valor da propriedade valorparc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorparc() {
        return valorparc;
    }

    /**
     * Define o valor da propriedade valorparc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorparc(String value) {
        this.valorparc = value;
    }

}
