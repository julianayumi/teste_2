
package br.com.epica.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de debAcordoModel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="debAcordoModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="libera_boleto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nosso_numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parcela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor_parcela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vencimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "debAcordoModel", propOrder = {
    "ativo",
    "codigo",
    "liberaBoleto",
    "nossoNumero",
    "parcela",
    "referencia",
    "valorParcela",
    "vencimento"
})
public class DebAcordoModel {

    protected String ativo;
    protected String codigo;
    @XmlElement(name = "libera_boleto")
    protected String liberaBoleto;
    @XmlElement(name = "nosso_numero")
    protected String nossoNumero;
    protected String parcela;
    protected String referencia;
    @XmlElement(name = "valor_parcela")
    protected String valorParcela;
    protected String vencimento;

    /**
     * Obtém o valor da propriedade ativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtivo() {
        return ativo;
    }

    /**
     * Define o valor da propriedade ativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtivo(String value) {
        this.ativo = value;
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
     * Obtém o valor da propriedade liberaBoleto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiberaBoleto() {
        return liberaBoleto;
    }

    /**
     * Define o valor da propriedade liberaBoleto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiberaBoleto(String value) {
        this.liberaBoleto = value;
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
     * Obtém o valor da propriedade parcela.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcela() {
        return parcela;
    }

    /**
     * Define o valor da propriedade parcela.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcela(String value) {
        this.parcela = value;
    }

    /**
     * Obtém o valor da propriedade referencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Define o valor da propriedade referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia(String value) {
        this.referencia = value;
    }

    /**
     * Obtém o valor da propriedade valorParcela.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorParcela() {
        return valorParcela;
    }

    /**
     * Define o valor da propriedade valorParcela.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorParcela(String value) {
        this.valorParcela = value;
    }

    /**
     * Obtém o valor da propriedade vencimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVencimento() {
        return vencimento;
    }

    /**
     * Define o valor da propriedade vencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVencimento(String value) {
        this.vencimento = value;
    }

}
