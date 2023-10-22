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
 * <p>Classe Java de Produto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Produto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cEan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codArea" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codLinha" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codProduto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idSetor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pesoBruto" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="pesoLiquido" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="unidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="volume_m3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Produto", namespace = "http://entities.carga.efrotas.mili.com.br", propOrder = {
    "cEan",
    "codArea",
    "codLinha",
    "codProduto",
    "descricao",
    "idSetor",
    "pesoBruto",
    "pesoLiquido",
    "unidade",
    "volumeM3"
})
public class Produto {

    @XmlElementRef(name = "cEan", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cEan;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Integer codArea;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Integer codLinha;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Integer codProduto;
    @XmlElementRef(name = "descricao", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descricao;
    @XmlElementRef(name = "idSetor", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idSetor;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Double pesoBruto;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Double pesoLiquido;
    @XmlElementRef(name = "unidade", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unidade;
    @XmlElement(name = "volume_m3", namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Double volumeM3;

    /**
     * Obtém o valor da propriedade cEan.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCEan() {
        return cEan;
    }

    /**
     * Define o valor da propriedade cEan.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCEan(JAXBElement<String> value) {
        this.cEan = value;
    }

    /**
     * Obtém o valor da propriedade codArea.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodArea() {
        return codArea;
    }

    /**
     * Define o valor da propriedade codArea.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodArea(Integer value) {
        this.codArea = value;
    }

    /**
     * Obtém o valor da propriedade codLinha.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodLinha() {
        return codLinha;
    }

    /**
     * Define o valor da propriedade codLinha.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodLinha(Integer value) {
        this.codLinha = value;
    }

    /**
     * Obtém o valor da propriedade codProduto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodProduto() {
        return codProduto;
    }

    /**
     * Define o valor da propriedade codProduto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodProduto(Integer value) {
        this.codProduto = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescricao(JAXBElement<String> value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade idSetor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdSetor() {
        return idSetor;
    }

    /**
     * Define o valor da propriedade idSetor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdSetor(JAXBElement<String> value) {
        this.idSetor = value;
    }

    /**
     * Obtém o valor da propriedade pesoBruto.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPesoBruto() {
        return pesoBruto;
    }

    /**
     * Define o valor da propriedade pesoBruto.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPesoBruto(Double value) {
        this.pesoBruto = value;
    }

    /**
     * Obtém o valor da propriedade pesoLiquido.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPesoLiquido() {
        return pesoLiquido;
    }

    /**
     * Define o valor da propriedade pesoLiquido.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPesoLiquido(Double value) {
        this.pesoLiquido = value;
    }

    /**
     * Obtém o valor da propriedade unidade.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnidade() {
        return unidade;
    }

    /**
     * Define o valor da propriedade unidade.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnidade(JAXBElement<String> value) {
        this.unidade = value;
    }

    /**
     * Obtém o valor da propriedade volumeM3.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVolumeM3() {
        return volumeM3;
    }

    /**
     * Define o valor da propriedade volumeM3.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVolumeM3(Double value) {
        this.volumeM3 = value;
    }

}
