//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v3.0.0 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2023.07.12 às 11:54:22 AM GMT-03:00 
//


package br.com.bomtransporte.boaminuta.mili;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NotaFiscal complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NotaFiscal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="caminhao" type="{http://entities.caminhao.efrotas.mili.com.br}Caminhao" minOccurs="0"/&gt;
 *         &lt;element name="chaveAcesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cliente" type="{http://entities.carga.efrotas.mili.com.br}Cliente" minOccurs="0"/&gt;
 *         &lt;element name="dataInicioTransmissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtAlteracao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dtEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dtSaida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="itens" type="{http://entities.carga.efrotas.mili.com.br}ArrayOfItem" minOccurs="0"/&gt;
 *         &lt;element name="nrNFiscal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="operacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="origemDados" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tabela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotaFiscal", namespace = "http://entities.carga.efrotas.mili.com.br", propOrder = {
    "caminhao",
    "chaveAcesso",
    "cliente",
    "dataInicioTransmissao",
    "dtAlteracao",
    "dtEmissao",
    "dtSaida",
    "itens",
    "nrNFiscal",
    "operacao",
    "origemDados",
    "serie",
    "status",
    "tabela"
})
public class NotaFiscal {

    @XmlElementRef(name = "caminhao", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<Caminhao> caminhao;
    @XmlElementRef(name = "chaveAcesso", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chaveAcesso;
    @XmlElementRef(name = "cliente", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<Cliente> cliente;
    @XmlElementRef(name = "dataInicioTransmissao", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataInicioTransmissao;
    @XmlElementRef(name = "dtAlteracao", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dtAlteracao;
    @XmlElementRef(name = "dtEmissao", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dtEmissao;
    @XmlElementRef(name = "dtSaida", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dtSaida;
    @XmlElementRef(name = "itens", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfItem> itens;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Long nrNFiscal;
    @XmlElementRef(name = "operacao", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operacao;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Integer origemDados;
    @XmlElementRef(name = "serie", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serie;
    @XmlElementRef(name = "status", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "tabela", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tabela;

    /**
     * Obtém o valor da propriedade caminhao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Caminhao }{@code >}
     *     
     */
    public JAXBElement<Caminhao> getCaminhao() {
        return caminhao;
    }

    /**
     * Define o valor da propriedade caminhao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Caminhao }{@code >}
     *     
     */
    public void setCaminhao(JAXBElement<Caminhao> value) {
        this.caminhao = value;
    }

    /**
     * Obtém o valor da propriedade chaveAcesso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChaveAcesso() {
        return chaveAcesso;
    }

    /**
     * Define o valor da propriedade chaveAcesso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChaveAcesso(JAXBElement<String> value) {
        this.chaveAcesso = value;
    }

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
     * Obtém o valor da propriedade dataInicioTransmissao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataInicioTransmissao() {
        return dataInicioTransmissao;
    }

    /**
     * Define o valor da propriedade dataInicioTransmissao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataInicioTransmissao(JAXBElement<String> value) {
        this.dataInicioTransmissao = value;
    }

    /**
     * Obtém o valor da propriedade dtAlteracao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDtAlteracao() {
        return dtAlteracao;
    }

    /**
     * Define o valor da propriedade dtAlteracao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDtAlteracao(JAXBElement<XMLGregorianCalendar> value) {
        this.dtAlteracao = value;
    }

    /**
     * Obtém o valor da propriedade dtEmissao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDtEmissao() {
        return dtEmissao;
    }

    /**
     * Define o valor da propriedade dtEmissao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDtEmissao(JAXBElement<XMLGregorianCalendar> value) {
        this.dtEmissao = value;
    }

    /**
     * Obtém o valor da propriedade dtSaida.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDtSaida() {
        return dtSaida;
    }

    /**
     * Define o valor da propriedade dtSaida.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDtSaida(JAXBElement<XMLGregorianCalendar> value) {
        this.dtSaida = value;
    }

    /**
     * Obtém o valor da propriedade itens.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfItem> getItens() {
        return itens;
    }

    /**
     * Define o valor da propriedade itens.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfItem }{@code >}
     *     
     */
    public void setItens(JAXBElement<ArrayOfItem> value) {
        this.itens = value;
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
     * Obtém o valor da propriedade operacao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperacao() {
        return operacao;
    }

    /**
     * Define o valor da propriedade operacao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperacao(JAXBElement<String> value) {
        this.operacao = value;
    }

    /**
     * Obtém o valor da propriedade origemDados.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrigemDados() {
        return origemDados;
    }

    /**
     * Define o valor da propriedade origemDados.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrigemDados(Integer value) {
        this.origemDados = value;
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
     * Obtém o valor da propriedade tabela.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTabela() {
        return tabela;
    }

    /**
     * Define o valor da propriedade tabela.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTabela(JAXBElement<String> value) {
        this.tabela = value;
    }

}
