
package br.com.epica.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de enviaSMSModel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="enviaSMSModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataVencto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroFone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proposta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorTaxa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enviaSMSModel", propOrder = {
    "dataVencto",
    "numeroFone",
    "proposta",
    "senha",
    "usuario",
    "valorTaxa"
})
public class EnviaSMSModel {

    protected String dataVencto;
    protected String numeroFone;
    protected String proposta;
    protected String senha;
    protected String usuario;
    protected String valorTaxa;

    /**
     * Obtém o valor da propriedade dataVencto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataVencto() {
        return dataVencto;
    }

    /**
     * Define o valor da propriedade dataVencto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataVencto(String value) {
        this.dataVencto = value;
    }

    /**
     * Obtém o valor da propriedade numeroFone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFone() {
        return numeroFone;
    }

    /**
     * Define o valor da propriedade numeroFone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFone(String value) {
        this.numeroFone = value;
    }

    /**
     * Obtém o valor da propriedade proposta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProposta() {
        return proposta;
    }

    /**
     * Define o valor da propriedade proposta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProposta(String value) {
        this.proposta = value;
    }

    /**
     * Obtém o valor da propriedade senha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

    /**
     * Obtém o valor da propriedade usuario.
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
     * Define o valor da propriedade usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtém o valor da propriedade valorTaxa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorTaxa() {
        return valorTaxa;
    }

    /**
     * Define o valor da propriedade valorTaxa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorTaxa(String value) {
        this.valorTaxa = value;
    }

}
