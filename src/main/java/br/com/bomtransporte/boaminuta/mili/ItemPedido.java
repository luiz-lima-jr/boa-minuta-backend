//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v3.0.0 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2023.07.12 às 11:54:22 AM GMT-03:00 
//


package br.com.bomtransporte.boaminuta.mili;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ItemPedido complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ItemPedido"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aliqIPI" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="codFiscal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="nrNFiscal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="precoUnitario" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="produto" type="{http://entities.carga.efrotas.mili.com.br}Produto" minOccurs="0"/&gt;
 *         &lt;element name="qtde" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vendaBonificacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vlrContabil" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrMercadoria" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemPedido", namespace = "http://entities.carga.efrotas.mili.com.br", propOrder = {
    "aliqIPI",
    "codFiscal",
    "nrNFiscal",
    "precoUnitario",
    "produto",
    "qtde",
    "serie",
    "status",
    "vendaBonificacao",
    "vlrContabil",
    "vlrMercadoria"
})
public class ItemPedido {

    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Double aliqIPI;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Double codFiscal;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Long nrNFiscal;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Double precoUnitario;
    @XmlElementRef(name = "produto", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<Produto> produto;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Double qtde;
    @XmlElementRef(name = "serie", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serie;
    @XmlElementRef(name = "status", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "vendaBonificacao", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendaBonificacao;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Double vlrContabil;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Double vlrMercadoria;

    /**
     * Obtém o valor da propriedade aliqIPI.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAliqIPI() {
        return aliqIPI;
    }

    /**
     * Define o valor da propriedade aliqIPI.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAliqIPI(Double value) {
        this.aliqIPI = value;
    }

    /**
     * Obtém o valor da propriedade codFiscal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCodFiscal() {
        return codFiscal;
    }

    /**
     * Define o valor da propriedade codFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCodFiscal(Double value) {
        this.codFiscal = value;
    }

    /**
     * Obtém o valor da propriedade nrNFiscal.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNrNFiscal() {
        return nrNFiscal;
    }

    /**
     * Define o valor da propriedade nrNFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNrNFiscal(Long value) {
        this.nrNFiscal = value;
    }

    /**
     * Obtém o valor da propriedade precoUnitario.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    /**
     * Define o valor da propriedade precoUnitario.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrecoUnitario(Double value) {
        this.precoUnitario = value;
    }

    /**
     * Obtém o valor da propriedade produto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Produto }{@code >}
     *     
     */
    public JAXBElement<Produto> getProduto() {
        return produto;
    }

    /**
     * Define o valor da propriedade produto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Produto }{@code >}
     *     
     */
    public void setProduto(JAXBElement<Produto> value) {
        this.produto = value;
    }

    /**
     * Obtém o valor da propriedade qtde.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQtde() {
        return qtde;
    }

    /**
     * Define o valor da propriedade qtde.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQtde(Double value) {
        this.qtde = value;
    }

    /**
     * Obtém o valor da propriedade serie.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerie() {
        return serie;
    }

    /**
     * Define o valor da propriedade serie.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerie(JAXBElement<String> value) {
        this.serie = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade vendaBonificacao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendaBonificacao() {
        return vendaBonificacao;
    }

    /**
     * Define o valor da propriedade vendaBonificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendaBonificacao(JAXBElement<String> value) {
        this.vendaBonificacao = value;
    }

    /**
     * Obtém o valor da propriedade vlrContabil.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVlrContabil() {
        return vlrContabil;
    }

    /**
     * Define o valor da propriedade vlrContabil.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVlrContabil(Double value) {
        this.vlrContabil = value;
    }

    /**
     * Obtém o valor da propriedade vlrMercadoria.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVlrMercadoria() {
        return vlrMercadoria;
    }

    /**
     * Define o valor da propriedade vlrMercadoria.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVlrMercadoria(Double value) {
        this.vlrMercadoria = value;
    }

}
