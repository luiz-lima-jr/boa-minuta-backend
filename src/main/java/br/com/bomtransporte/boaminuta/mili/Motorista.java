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
 * <p>Classe Java de Motorista complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Motorista"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aparecencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="celular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cnh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codAgencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codBanco" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cpfTitularConta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataCadastro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="digitoCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="digitoCodAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtNascimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="educacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nomeCompleto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeTitularConta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="obs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referencias" type="{http://entities.motorista.efrotas.mili.com.br}ArrayOfReferenciaMotorista" minOccurs="0"/&gt;
 *         &lt;element name="rg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vestuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Motorista", namespace = "http://entities.motorista.efrotas.mili.com.br", propOrder = {
    "aparecencia",
    "ativo",
    "bairro",
    "celular",
    "cep",
    "cidade",
    "cnh",
    "codAgencia",
    "codBanco",
    "cpf",
    "cpfTitularConta",
    "dataCadastro",
    "digitoCC",
    "digitoCodAgencia",
    "dtNascimento",
    "educacao",
    "endereco",
    "id",
    "nomeCompleto",
    "nomeTitularConta",
    "numeroCC",
    "obs",
    "operacao",
    "referencias",
    "rg",
    "telefone",
    "uf",
    "vestuario"
})
public class Motorista {

    @XmlElementRef(name = "aparecencia", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aparecencia;
    @XmlElementRef(name = "ativo", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ativo;
    @XmlElementRef(name = "bairro", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bairro;
    @XmlElementRef(name = "celular", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> celular;
    @XmlElementRef(name = "cep", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cep;
    @XmlElementRef(name = "cidade", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cidade;
    @XmlElementRef(name = "cnh", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cnh;
    @XmlElement(namespace = "http://entities.motorista.efrotas.mili.com.br")
    protected Integer codAgencia;
    @XmlElement(namespace = "http://entities.motorista.efrotas.mili.com.br")
    protected Integer codBanco;
    @XmlElementRef(name = "cpf", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cpf;
    @XmlElementRef(name = "cpfTitularConta", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cpfTitularConta;
    @XmlElementRef(name = "dataCadastro", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataCadastro;
    @XmlElementRef(name = "digitoCC", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> digitoCC;
    @XmlElementRef(name = "digitoCodAgencia", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> digitoCodAgencia;
    @XmlElementRef(name = "dtNascimento", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dtNascimento;
    @XmlElementRef(name = "educacao", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> educacao;
    @XmlElementRef(name = "endereco", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endereco;
    @XmlElementRef(name = "id", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> id;
    @XmlElementRef(name = "nomeCompleto", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeCompleto;
    @XmlElementRef(name = "nomeTitularConta", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeTitularConta;
    @XmlElementRef(name = "numeroCC", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroCC;
    @XmlElementRef(name = "obs", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> obs;
    @XmlElementRef(name = "operacao", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operacao;
    @XmlElementRef(name = "referencias", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReferenciaMotorista> referencias;
    @XmlElementRef(name = "rg", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rg;
    @XmlElementRef(name = "telefone", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefone;
    @XmlElementRef(name = "uf", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uf;
    @XmlElementRef(name = "vestuario", namespace = "http://entities.motorista.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vestuario;

    /**
     * Obtém o valor da propriedade aparecencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAparecencia() {
        return aparecencia;
    }

    /**
     * Define o valor da propriedade aparecencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAparecencia(JAXBElement<String> value) {
        this.aparecencia = value;
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
     * Obtém o valor da propriedade bairro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBairro() {
        return bairro;
    }

    /**
     * Define o valor da propriedade bairro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBairro(JAXBElement<String> value) {
        this.bairro = value;
    }

    /**
     * Obtém o valor da propriedade celular.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelular() {
        return celular;
    }

    /**
     * Define o valor da propriedade celular.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelular(JAXBElement<String> value) {
        this.celular = value;
    }

    /**
     * Obtém o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCep() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCep(JAXBElement<String> value) {
        this.cep = value;
    }

    /**
     * Obtém o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCidade() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCidade(JAXBElement<String> value) {
        this.cidade = value;
    }

    /**
     * Obtém o valor da propriedade cnh.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCnh() {
        return cnh;
    }

    /**
     * Define o valor da propriedade cnh.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCnh(JAXBElement<String> value) {
        this.cnh = value;
    }

    /**
     * Obtém o valor da propriedade codAgencia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodAgencia() {
        return codAgencia;
    }

    /**
     * Define o valor da propriedade codAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodAgencia(Integer value) {
        this.codAgencia = value;
    }

    /**
     * Obtém o valor da propriedade codBanco.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodBanco() {
        return codBanco;
    }

    /**
     * Define o valor da propriedade codBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodBanco(Integer value) {
        this.codBanco = value;
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
     * Obtém o valor da propriedade cpfTitularConta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpfTitularConta() {
        return cpfTitularConta;
    }

    /**
     * Define o valor da propriedade cpfTitularConta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpfTitularConta(JAXBElement<String> value) {
        this.cpfTitularConta = value;
    }

    /**
     * Obtém o valor da propriedade dataCadastro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataCadastro() {
        return dataCadastro;
    }

    /**
     * Define o valor da propriedade dataCadastro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataCadastro(JAXBElement<String> value) {
        this.dataCadastro = value;
    }

    /**
     * Obtém o valor da propriedade digitoCC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDigitoCC() {
        return digitoCC;
    }

    /**
     * Define o valor da propriedade digitoCC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDigitoCC(JAXBElement<String> value) {
        this.digitoCC = value;
    }

    /**
     * Obtém o valor da propriedade digitoCodAgencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDigitoCodAgencia() {
        return digitoCodAgencia;
    }

    /**
     * Define o valor da propriedade digitoCodAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDigitoCodAgencia(JAXBElement<String> value) {
        this.digitoCodAgencia = value;
    }

    /**
     * Obtém o valor da propriedade dtNascimento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDtNascimento() {
        return dtNascimento;
    }

    /**
     * Define o valor da propriedade dtNascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDtNascimento(JAXBElement<String> value) {
        this.dtNascimento = value;
    }

    /**
     * Obtém o valor da propriedade educacao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEducacao() {
        return educacao;
    }

    /**
     * Define o valor da propriedade educacao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEducacao(JAXBElement<String> value) {
        this.educacao = value;
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
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setId(JAXBElement<Long> value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade nomeCompleto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * Define o valor da propriedade nomeCompleto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeCompleto(JAXBElement<String> value) {
        this.nomeCompleto = value;
    }

    /**
     * Obtém o valor da propriedade nomeTitularConta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeTitularConta() {
        return nomeTitularConta;
    }

    /**
     * Define o valor da propriedade nomeTitularConta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeTitularConta(JAXBElement<String> value) {
        this.nomeTitularConta = value;
    }

    /**
     * Obtém o valor da propriedade numeroCC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroCC() {
        return numeroCC;
    }

    /**
     * Define o valor da propriedade numeroCC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroCC(JAXBElement<String> value) {
        this.numeroCC = value;
    }

    /**
     * Obtém o valor da propriedade obs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObs() {
        return obs;
    }

    /**
     * Define o valor da propriedade obs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObs(JAXBElement<String> value) {
        this.obs = value;
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
     * Obtém o valor da propriedade referencias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReferenciaMotorista }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReferenciaMotorista> getReferencias() {
        return referencias;
    }

    /**
     * Define o valor da propriedade referencias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReferenciaMotorista }{@code >}
     *     
     */
    public void setReferencias(JAXBElement<ArrayOfReferenciaMotorista> value) {
        this.referencias = value;
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
     * Obtém o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUf() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUf(JAXBElement<String> value) {
        this.uf = value;
    }

    /**
     * Obtém o valor da propriedade vestuario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVestuario() {
        return vestuario;
    }

    /**
     * Define o valor da propriedade vestuario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVestuario(JAXBElement<String> value) {
        this.vestuario = value;
    }

}
