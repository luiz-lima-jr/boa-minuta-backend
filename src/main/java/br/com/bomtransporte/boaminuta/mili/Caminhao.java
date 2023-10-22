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
 * <p>Classe Java de Caminhao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Caminhao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="altura1M" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="altura2M" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aparenciaCabine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aparenciaExtCarroceria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aparenciaGeralVeiculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aparenciaIntCarroceria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aparenciaLimpeza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chassi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cnht" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codCaminhao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="codTransp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="codigoANTT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comprimento1M" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="comprimento2M" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="contaContabil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataAlteracao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataCadastro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataMedicao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="eftCodigo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entradaBloqueada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="largura1M" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="largura2M" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motorista" type="{http://entities.motorista.efrotas.mili.com.br}Motorista" minOccurs="0"/&gt;
 *         &lt;element name="municipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numCartaoPedagio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroEixo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="placaCarreta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proprietario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtMaxCarga" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="renavam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoCarroceria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ufPlaca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Caminhao", namespace = "http://entities.caminhao.efrotas.mili.com.br", propOrder = {
    "altura1M",
    "altura2M",
    "ano",
    "aparenciaCabine",
    "aparenciaExtCarroceria",
    "aparenciaGeralVeiculo",
    "aparenciaIntCarroceria",
    "aparenciaLimpeza",
    "ativo",
    "chassi",
    "cnht",
    "codCaminhao",
    "codTransp",
    "codigoANTT",
    "comprimento1M",
    "comprimento2M",
    "contaContabil",
    "cor",
    "cpf",
    "dataAlteracao",
    "dataCadastro",
    "dataMedicao",
    "eftCodigo",
    "endereco",
    "entradaBloqueada",
    "largura1M",
    "largura2M",
    "marca",
    "motorista",
    "municipio",
    "numCartaoPedagio",
    "numeroEixo",
    "observacao",
    "operacao",
    "peso",
    "placa",
    "placaCarreta",
    "proprietario",
    "qtMaxCarga",
    "renavam",
    "rg",
    "status",
    "telefone",
    "tipo",
    "tipoCarroceria",
    "ufPlaca"
})
public class Caminhao {

    @XmlElementRef(name = "altura1M", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> altura1M;
    @XmlElementRef(name = "altura2M", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> altura2M;
    @XmlElementRef(name = "ano", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ano;
    @XmlElementRef(name = "aparenciaCabine", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aparenciaCabine;
    @XmlElementRef(name = "aparenciaExtCarroceria", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aparenciaExtCarroceria;
    @XmlElementRef(name = "aparenciaGeralVeiculo", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aparenciaGeralVeiculo;
    @XmlElementRef(name = "aparenciaIntCarroceria", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aparenciaIntCarroceria;
    @XmlElementRef(name = "aparenciaLimpeza", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aparenciaLimpeza;
    @XmlElementRef(name = "ativo", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ativo;
    @XmlElementRef(name = "chassi", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chassi;
    @XmlElementRef(name = "cnht", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cnht;
    @XmlElement(namespace = "http://entities.caminhao.efrotas.mili.com.br")
    protected Long codCaminhao;
    @XmlElement(namespace = "http://entities.caminhao.efrotas.mili.com.br")
    protected Long codTransp;
    @XmlElementRef(name = "codigoANTT", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoANTT;
    @XmlElementRef(name = "comprimento1M", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> comprimento1M;
    @XmlElementRef(name = "comprimento2M", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> comprimento2M;
    @XmlElementRef(name = "contaContabil", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contaContabil;
    @XmlElementRef(name = "cor", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cor;
    @XmlElementRef(name = "cpf", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cpf;
    @XmlElementRef(name = "dataAlteracao", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataAlteracao;
    @XmlElementRef(name = "dataCadastro", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataCadastro;
    @XmlElementRef(name = "dataMedicao", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataMedicao;
    @XmlElement(namespace = "http://entities.caminhao.efrotas.mili.com.br")
    protected Long eftCodigo;
    @XmlElementRef(name = "endereco", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endereco;
    @XmlElementRef(name = "entradaBloqueada", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entradaBloqueada;
    @XmlElementRef(name = "largura1M", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> largura1M;
    @XmlElementRef(name = "largura2M", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> largura2M;
    @XmlElementRef(name = "marca", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marca;
    @XmlElementRef(name = "motorista", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<Motorista> motorista;
    @XmlElementRef(name = "municipio", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> municipio;
    @XmlElementRef(name = "numCartaoPedagio", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numCartaoPedagio;
    @XmlElementRef(name = "numeroEixo", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numeroEixo;
    @XmlElementRef(name = "observacao", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observacao;
    @XmlElementRef(name = "operacao", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operacao;
    @XmlElementRef(name = "peso", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> peso;
    @XmlElementRef(name = "placa", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> placa;
    @XmlElementRef(name = "placaCarreta", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> placaCarreta;
    @XmlElementRef(name = "proprietario", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> proprietario;
    @XmlElementRef(name = "qtMaxCarga", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qtMaxCarga;
    @XmlElementRef(name = "renavam", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> renavam;
    @XmlElementRef(name = "rg", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rg;
    @XmlElementRef(name = "status", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "telefone", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefone;
    @XmlElementRef(name = "tipo", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipo;
    @XmlElementRef(name = "tipoCarroceria", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCarroceria;
    @XmlElementRef(name = "ufPlaca", namespace = "http://entities.caminhao.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ufPlaca;

    /**
     * Obtém o valor da propriedade altura1M.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAltura1M() {
        return altura1M;
    }

    /**
     * Define o valor da propriedade altura1M.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAltura1M(JAXBElement<Double> value) {
        this.altura1M = value;
    }

    /**
     * Obtém o valor da propriedade altura2M.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAltura2M() {
        return altura2M;
    }

    /**
     * Define o valor da propriedade altura2M.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAltura2M(JAXBElement<Double> value) {
        this.altura2M = value;
    }

    /**
     * Obtém o valor da propriedade ano.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAno() {
        return ano;
    }

    /**
     * Define o valor da propriedade ano.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAno(JAXBElement<String> value) {
        this.ano = value;
    }

    /**
     * Obtém o valor da propriedade aparenciaCabine.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAparenciaCabine() {
        return aparenciaCabine;
    }

    /**
     * Define o valor da propriedade aparenciaCabine.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAparenciaCabine(JAXBElement<String> value) {
        this.aparenciaCabine = value;
    }

    /**
     * Obtém o valor da propriedade aparenciaExtCarroceria.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAparenciaExtCarroceria() {
        return aparenciaExtCarroceria;
    }

    /**
     * Define o valor da propriedade aparenciaExtCarroceria.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAparenciaExtCarroceria(JAXBElement<String> value) {
        this.aparenciaExtCarroceria = value;
    }

    /**
     * Obtém o valor da propriedade aparenciaGeralVeiculo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAparenciaGeralVeiculo() {
        return aparenciaGeralVeiculo;
    }

    /**
     * Define o valor da propriedade aparenciaGeralVeiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAparenciaGeralVeiculo(JAXBElement<String> value) {
        this.aparenciaGeralVeiculo = value;
    }

    /**
     * Obtém o valor da propriedade aparenciaIntCarroceria.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAparenciaIntCarroceria() {
        return aparenciaIntCarroceria;
    }

    /**
     * Define o valor da propriedade aparenciaIntCarroceria.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAparenciaIntCarroceria(JAXBElement<String> value) {
        this.aparenciaIntCarroceria = value;
    }

    /**
     * Obtém o valor da propriedade aparenciaLimpeza.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAparenciaLimpeza() {
        return aparenciaLimpeza;
    }

    /**
     * Define o valor da propriedade aparenciaLimpeza.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAparenciaLimpeza(JAXBElement<String> value) {
        this.aparenciaLimpeza = value;
    }

    /**
     * Obtém o valor da propriedade ativo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtivo() {
        return ativo;
    }

    /**
     * Define o valor da propriedade ativo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtivo(JAXBElement<String> value) {
        this.ativo = value;
    }

    /**
     * Obtém o valor da propriedade chassi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChassi() {
        return chassi;
    }

    /**
     * Define o valor da propriedade chassi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChassi(JAXBElement<String> value) {
        this.chassi = value;
    }

    /**
     * Obtém o valor da propriedade cnht.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCnht() {
        return cnht;
    }

    /**
     * Define o valor da propriedade cnht.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCnht(JAXBElement<String> value) {
        this.cnht = value;
    }

    /**
     * Obtém o valor da propriedade codCaminhao.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodCaminhao() {
        return codCaminhao;
    }

    /**
     * Define o valor da propriedade codCaminhao.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodCaminhao(Long value) {
        this.codCaminhao = value;
    }

    /**
     * Obtém o valor da propriedade codTransp.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodTransp() {
        return codTransp;
    }

    /**
     * Define o valor da propriedade codTransp.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodTransp(Long value) {
        this.codTransp = value;
    }

    /**
     * Obtém o valor da propriedade codigoANTT.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoANTT() {
        return codigoANTT;
    }

    /**
     * Define o valor da propriedade codigoANTT.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoANTT(JAXBElement<String> value) {
        this.codigoANTT = value;
    }

    /**
     * Obtém o valor da propriedade comprimento1M.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getComprimento1M() {
        return comprimento1M;
    }

    /**
     * Define o valor da propriedade comprimento1M.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setComprimento1M(JAXBElement<Double> value) {
        this.comprimento1M = value;
    }

    /**
     * Obtém o valor da propriedade comprimento2M.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getComprimento2M() {
        return comprimento2M;
    }

    /**
     * Define o valor da propriedade comprimento2M.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setComprimento2M(JAXBElement<Double> value) {
        this.comprimento2M = value;
    }

    /**
     * Obtém o valor da propriedade contaContabil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContaContabil() {
        return contaContabil;
    }

    /**
     * Define o valor da propriedade contaContabil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContaContabil(JAXBElement<String> value) {
        this.contaContabil = value;
    }

    /**
     * Obtém o valor da propriedade cor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCor() {
        return cor;
    }

    /**
     * Define o valor da propriedade cor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCor(JAXBElement<String> value) {
        this.cor = value;
    }

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpf() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpf(JAXBElement<String> value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade dataAlteracao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataAlteracao() {
        return dataAlteracao;
    }

    /**
     * Define o valor da propriedade dataAlteracao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataAlteracao(JAXBElement<XMLGregorianCalendar> value) {
        this.dataAlteracao = value;
    }

    /**
     * Obtém o valor da propriedade dataCadastro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataCadastro() {
        return dataCadastro;
    }

    /**
     * Define o valor da propriedade dataCadastro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataCadastro(JAXBElement<XMLGregorianCalendar> value) {
        this.dataCadastro = value;
    }

    /**
     * Obtém o valor da propriedade dataMedicao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataMedicao() {
        return dataMedicao;
    }

    /**
     * Define o valor da propriedade dataMedicao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataMedicao(JAXBElement<XMLGregorianCalendar> value) {
        this.dataMedicao = value;
    }

    /**
     * Obtém o valor da propriedade eftCodigo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEftCodigo() {
        return eftCodigo;
    }

    /**
     * Define o valor da propriedade eftCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEftCodigo(Long value) {
        this.eftCodigo = value;
    }

    /**
     * Obtém o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndereco(JAXBElement<String> value) {
        this.endereco = value;
    }

    /**
     * Obtém o valor da propriedade entradaBloqueada.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntradaBloqueada() {
        return entradaBloqueada;
    }

    /**
     * Define o valor da propriedade entradaBloqueada.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntradaBloqueada(JAXBElement<String> value) {
        this.entradaBloqueada = value;
    }

    /**
     * Obtém o valor da propriedade largura1M.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLargura1M() {
        return largura1M;
    }

    /**
     * Define o valor da propriedade largura1M.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLargura1M(JAXBElement<Double> value) {
        this.largura1M = value;
    }

    /**
     * Obtém o valor da propriedade largura2M.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLargura2M() {
        return largura2M;
    }

    /**
     * Define o valor da propriedade largura2M.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLargura2M(JAXBElement<Double> value) {
        this.largura2M = value;
    }

    /**
     * Obtém o valor da propriedade marca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarca() {
        return marca;
    }

    /**
     * Define o valor da propriedade marca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarca(JAXBElement<String> value) {
        this.marca = value;
    }

    /**
     * Obtém o valor da propriedade motorista.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Motorista }{@code >}
     *     
     */
    public JAXBElement<Motorista> getMotorista() {
        return motorista;
    }

    /**
     * Define o valor da propriedade motorista.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Motorista }{@code >}
     *     
     */
    public void setMotorista(JAXBElement<Motorista> value) {
        this.motorista = value;
    }

    /**
     * Obtém o valor da propriedade municipio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMunicipio() {
        return municipio;
    }

    /**
     * Define o valor da propriedade municipio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMunicipio(JAXBElement<String> value) {
        this.municipio = value;
    }

    /**
     * Obtém o valor da propriedade numCartaoPedagio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumCartaoPedagio() {
        return numCartaoPedagio;
    }

    /**
     * Define o valor da propriedade numCartaoPedagio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumCartaoPedagio(JAXBElement<String> value) {
        this.numCartaoPedagio = value;
    }

    /**
     * Obtém o valor da propriedade numeroEixo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumeroEixo() {
        return numeroEixo;
    }

    /**
     * Define o valor da propriedade numeroEixo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumeroEixo(JAXBElement<Integer> value) {
        this.numeroEixo = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObservacao(JAXBElement<String> value) {
        this.observacao = value;
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
     * Obtém o valor da propriedade peso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPeso() {
        return peso;
    }

    /**
     * Define o valor da propriedade peso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPeso(JAXBElement<Double> value) {
        this.peso = value;
    }

    /**
     * Obtém o valor da propriedade placa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlaca() {
        return placa;
    }

    /**
     * Define o valor da propriedade placa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlaca(JAXBElement<String> value) {
        this.placa = value;
    }

    /**
     * Obtém o valor da propriedade placaCarreta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlacaCarreta() {
        return placaCarreta;
    }

    /**
     * Define o valor da propriedade placaCarreta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlacaCarreta(JAXBElement<String> value) {
        this.placaCarreta = value;
    }

    /**
     * Obtém o valor da propriedade proprietario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProprietario() {
        return proprietario;
    }

    /**
     * Define o valor da propriedade proprietario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProprietario(JAXBElement<String> value) {
        this.proprietario = value;
    }

    /**
     * Obtém o valor da propriedade qtMaxCarga.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQtMaxCarga() {
        return qtMaxCarga;
    }

    /**
     * Define o valor da propriedade qtMaxCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQtMaxCarga(JAXBElement<Double> value) {
        this.qtMaxCarga = value;
    }

    /**
     * Obtém o valor da propriedade renavam.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRenavam() {
        return renavam;
    }

    /**
     * Define o valor da propriedade renavam.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRenavam(JAXBElement<String> value) {
        this.renavam = value;
    }

    /**
     * Obtém o valor da propriedade rg.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg() {
        return rg;
    }

    /**
     * Define o valor da propriedade rg.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg(JAXBElement<String> value) {
        this.rg = value;
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
     * Obtém o valor da propriedade telefone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefone() {
        return telefone;
    }

    /**
     * Define o valor da propriedade telefone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefone(JAXBElement<String> value) {
        this.telefone = value;
    }

    /**
     * Obtém o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipo(JAXBElement<String> value) {
        this.tipo = value;
    }

    /**
     * Obtém o valor da propriedade tipoCarroceria.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCarroceria() {
        return tipoCarroceria;
    }

    /**
     * Define o valor da propriedade tipoCarroceria.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCarroceria(JAXBElement<String> value) {
        this.tipoCarroceria = value;
    }

    /**
     * Obtém o valor da propriedade ufPlaca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUfPlaca() {
        return ufPlaca;
    }

    /**
     * Define o valor da propriedade ufPlaca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUfPlaca(JAXBElement<String> value) {
        this.ufPlaca = value;
    }

}
