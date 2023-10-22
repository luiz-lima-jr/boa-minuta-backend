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
 * <p>Classe Java de Pedido complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Pedido"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cliente" type="{http://entities.carga.efrotas.mili.com.br}Cliente" minOccurs="0"/&gt;
 *         &lt;element name="codVendedor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="itensPedidos" type="{http://entities.carga.efrotas.mili.com.br}ArrayOfItemPedido" minOccurs="0"/&gt;
 *         &lt;element name="nf" type="{http://entities.carga.efrotas.mili.com.br}NotaFiscal" minOccurs="0"/&gt;
 *         &lt;element name="nrCarga" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nrPedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoFrete" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pedido", namespace = "http://entities.carga.efrotas.mili.com.br", propOrder = {
    "cliente",
    "codVendedor",
    "itensPedidos",
    "nf",
    "nrCarga",
    "nrPedido",
    "tipoFrete"
})
public class Pedido {

    @XmlElementRef(name = "cliente", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<Cliente> cliente;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Integer codVendedor;
    @XmlElementRef(name = "itensPedidos", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfItemPedido> itensPedidos;
    @XmlElementRef(name = "nf", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<NotaFiscal> nf;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Long nrCarga;
    @XmlElementRef(name = "nrPedido", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nrPedido;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Integer tipoFrete;

    /**
     * Obtém o valor da propriedade cliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Cliente }{@code >}
     *     
     */
    public JAXBElement<Cliente> getCliente() {
        return cliente;
    }

    /**
     * Define o valor da propriedade cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Cliente }{@code >}
     *     
     */
    public void setCliente(JAXBElement<Cliente> value) {
        this.cliente = value;
    }

    /**
     * Obtém o valor da propriedade codVendedor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodVendedor() {
        return codVendedor;
    }

    /**
     * Define o valor da propriedade codVendedor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodVendedor(Integer value) {
        this.codVendedor = value;
    }

    /**
     * Obtém o valor da propriedade itensPedidos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfItemPedido }{@code >}
     *     
     */
    public JAXBElement<ArrayOfItemPedido> getItensPedidos() {
        return itensPedidos;
    }

    /**
     * Define o valor da propriedade itensPedidos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfItemPedido }{@code >}
     *     
     */
    public void setItensPedidos(JAXBElement<ArrayOfItemPedido> value) {
        this.itensPedidos = value;
    }

    /**
     * Obtém o valor da propriedade nf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NotaFiscal }{@code >}
     *     
     */
    public JAXBElement<NotaFiscal> getNf() {
        return nf;
    }

    /**
     * Define o valor da propriedade nf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NotaFiscal }{@code >}
     *     
     */
    public void setNf(JAXBElement<NotaFiscal> value) {
        this.nf = value;
    }

    /**
     * Obtém o valor da propriedade nrCarga.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNrCarga() {
        return nrCarga;
    }

    /**
     * Define o valor da propriedade nrCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNrCarga(Long value) {
        this.nrCarga = value;
    }

    /**
     * Obtém o valor da propriedade nrPedido.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNrPedido() {
        return nrPedido;
    }

    /**
     * Define o valor da propriedade nrPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNrPedido(JAXBElement<String> value) {
        this.nrPedido = value;
    }

    /**
     * Obtém o valor da propriedade tipoFrete.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoFrete() {
        return tipoFrete;
    }

    /**
     * Define o valor da propriedade tipoFrete.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoFrete(Integer value) {
        this.tipoFrete = value;
    }

}
