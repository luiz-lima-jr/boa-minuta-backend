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
 * <p>Classe Java de Carga complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Carga"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="caminhao" type="{http://entities.caminhao.efrotas.mili.com.br}Caminhao" minOccurs="0"/&gt;
 *         &lt;element name="clienteRetira" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cnpjRedespacho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codIbge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codMotorista" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="codTransp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="codTranspRedespacho" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dataAlteracao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataInicioTransmissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtCaminhaoPatio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtFaturamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtFinalExpedicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtHrFaturamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtLiberacaoFaturamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtLiberacaoTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtLiberadoExpedicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtSaidaCaminhao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtSolicitacaoExpedicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eftCodigo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="filial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="freteFob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="liberado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localCarregamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motorista" type="{http://entities.motorista.efrotas.mili.com.br}Motorista" minOccurs="0"/&gt;
 *         &lt;element name="notas" type="{http://entities.carga.efrotas.mili.com.br}ArrayOfNotaFiscal" minOccurs="0"/&gt;
 *         &lt;element name="nrCarga" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observacaoCarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pedidos" type="{http://entities.carga.efrotas.mili.com.br}ArrayOfPedido" minOccurs="0"/&gt;
 *         &lt;element name="pesoBruto" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="portaEmbarque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qde" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tipoCarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalEntrega" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="totalVolume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vlrConhecimento" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrFrete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrFreteCalculado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrFreteCarga" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrFreteCubico" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrMercadoria" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrPedagio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrRedespacho" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrTxEntrega" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrTxEntregaCalc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Carga", namespace = "http://entities.carga.efrotas.mili.com.br", propOrder = {
    "caminhao",
    "clienteRetira",
    "cnpjRedespacho",
    "codIbge",
    "codMotorista",
    "codTransp",
    "codTranspRedespacho",
    "dataAlteracao",
    "dataInicioTransmissao",
    "destino",
    "dtCaminhaoPatio",
    "dtFaturamento",
    "dtFinalExpedicao",
    "dtHrFaturamento",
    "dtLiberacaoFaturamento",
    "dtLiberacaoTransporte",
    "dtLiberadoExpedicao",
    "dtSaidaCaminhao",
    "dtSolicitacaoExpedicao",
    "eftCodigo",
    "filial",
    "freteFob",
    "liberado",
    "localCarregamento",
    "motorista",
    "notas",
    "nrCarga",
    "observacao",
    "observacaoCarga",
    "operacao",
    "pedidos",
    "pesoBruto",
    "portaEmbarque",
    "qde",
    "tipoCarga",
    "totalEntrega",
    "totalVolume",
    "uf",
    "vlrConhecimento",
    "vlrFrete",
    "vlrFreteCalculado",
    "vlrFreteCarga",
    "vlrFreteCubico",
    "vlrMercadoria",
    "vlrPedagio",
    "vlrRedespacho",
    "vlrTxEntrega",
    "vlrTxEntregaCalc"
})
public class Carga {

    @XmlElementRef(name = "caminhao", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<Caminhao> caminhao;
    @XmlElementRef(name = "clienteRetira", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clienteRetira;
    @XmlElementRef(name = "cnpjRedespacho", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cnpjRedespacho;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Integer codIbge;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Long codMotorista;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Long codTransp;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Long codTranspRedespacho;
    @XmlElementRef(name = "dataAlteracao", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataAlteracao;
    @XmlElementRef(name = "dataInicioTransmissao", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataInicioTransmissao;
    @XmlElementRef(name = "destino", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destino;
    @XmlElementRef(name = "dtCaminhaoPatio", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dtCaminhaoPatio;
    @XmlElementRef(name = "dtFaturamento", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dtFaturamento;
    @XmlElementRef(name = "dtFinalExpedicao", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dtFinalExpedicao;
    @XmlElementRef(name = "dtHrFaturamento", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dtHrFaturamento;
    @XmlElementRef(name = "dtLiberacaoFaturamento", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dtLiberacaoFaturamento;
    @XmlElementRef(name = "dtLiberacaoTransporte", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dtLiberacaoTransporte;
    @XmlElementRef(name = "dtLiberadoExpedicao", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dtLiberadoExpedicao;
    @XmlElementRef(name = "dtSaidaCaminhao", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dtSaidaCaminhao;
    @XmlElementRef(name = "dtSolicitacaoExpedicao", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dtSolicitacaoExpedicao;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Long eftCodigo;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Integer filial;
    @XmlElementRef(name = "freteFob", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> freteFob;
    @XmlElementRef(name = "liberado", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> liberado;
    @XmlElementRef(name = "localCarregamento", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localCarregamento;
    @XmlElementRef(name = "motorista", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<Motorista> motorista;
    @XmlElementRef(name = "notas", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNotaFiscal> notas;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Long nrCarga;
    @XmlElementRef(name = "observacao", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observacao;
    @XmlElementRef(name = "observacaoCarga", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observacaoCarga;
    @XmlElementRef(name = "operacao", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operacao;
    @XmlElementRef(name = "pedidos", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPedido> pedidos;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Double pesoBruto;
    @XmlElementRef(name = "portaEmbarque", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> portaEmbarque;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Integer qde;
    @XmlElementRef(name = "tipoCarga", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCarga;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Integer totalEntrega;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Double totalVolume;
    @XmlElementRef(name = "uf", namespace = "http://entities.carga.efrotas.mili.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uf;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Double vlrConhecimento;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Double vlrFrete;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Double vlrFreteCalculado;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Double vlrFreteCarga;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Double vlrFreteCubico;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Double vlrMercadoria;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Double vlrPedagio;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Double vlrRedespacho;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Double vlrTxEntrega;
    @XmlElement(namespace = "http://entities.carga.efrotas.mili.com.br")
    protected Double vlrTxEntregaCalc;

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
     * Obtém o valor da propriedade clienteRetira.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClienteRetira() {
        return clienteRetira;
    }

    /**
     * Define o valor da propriedade clienteRetira.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClienteRetira(JAXBElement<String> value) {
        this.clienteRetira = value;
    }

    /**
     * Obtém o valor da propriedade cnpjRedespacho.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCnpjRedespacho() {
        return cnpjRedespacho;
    }

    /**
     * Define o valor da propriedade cnpjRedespacho.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCnpjRedespacho(JAXBElement<String> value) {
        this.cnpjRedespacho = value;
    }

    /**
     * Obtém o valor da propriedade codIbge.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodIbge() {
        return codIbge;
    }

    /**
     * Define o valor da propriedade codIbge.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodIbge(Integer value) {
        this.codIbge = value;
    }

    /**
     * Obtém o valor da propriedade codMotorista.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodMotorista() {
        return codMotorista;
    }

    /**
     * Define o valor da propriedade codMotorista.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodMotorista(Long value) {
        this.codMotorista = value;
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
     * Obtém o valor da propriedade codTranspRedespacho.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodTranspRedespacho() {
        return codTranspRedespacho;
    }

    /**
     * Define o valor da propriedade codTranspRedespacho.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodTranspRedespacho(Long value) {
        this.codTranspRedespacho = value;
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
     * Obtém o valor da propriedade destino.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestino() {
        return destino;
    }

    /**
     * Define o valor da propriedade destino.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestino(JAXBElement<String> value) {
        this.destino = value;
    }

    /**
     * Obtém o valor da propriedade dtCaminhaoPatio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDtCaminhaoPatio() {
        return dtCaminhaoPatio;
    }

    /**
     * Define o valor da propriedade dtCaminhaoPatio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDtCaminhaoPatio(JAXBElement<String> value) {
        this.dtCaminhaoPatio = value;
    }

    /**
     * Obtém o valor da propriedade dtFaturamento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDtFaturamento() {
        return dtFaturamento;
    }

    /**
     * Define o valor da propriedade dtFaturamento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDtFaturamento(JAXBElement<String> value) {
        this.dtFaturamento = value;
    }

    /**
     * Obtém o valor da propriedade dtFinalExpedicao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDtFinalExpedicao() {
        return dtFinalExpedicao;
    }

    /**
     * Define o valor da propriedade dtFinalExpedicao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDtFinalExpedicao(JAXBElement<String> value) {
        this.dtFinalExpedicao = value;
    }

    /**
     * Obtém o valor da propriedade dtHrFaturamento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDtHrFaturamento() {
        return dtHrFaturamento;
    }

    /**
     * Define o valor da propriedade dtHrFaturamento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDtHrFaturamento(JAXBElement<String> value) {
        this.dtHrFaturamento = value;
    }

    /**
     * Obtém o valor da propriedade dtLiberacaoFaturamento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDtLiberacaoFaturamento() {
        return dtLiberacaoFaturamento;
    }

    /**
     * Define o valor da propriedade dtLiberacaoFaturamento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDtLiberacaoFaturamento(JAXBElement<String> value) {
        this.dtLiberacaoFaturamento = value;
    }

    /**
     * Obtém o valor da propriedade dtLiberacaoTransporte.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDtLiberacaoTransporte() {
        return dtLiberacaoTransporte;
    }

    /**
     * Define o valor da propriedade dtLiberacaoTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDtLiberacaoTransporte(JAXBElement<String> value) {
        this.dtLiberacaoTransporte = value;
    }

    /**
     * Obtém o valor da propriedade dtLiberadoExpedicao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDtLiberadoExpedicao() {
        return dtLiberadoExpedicao;
    }

    /**
     * Define o valor da propriedade dtLiberadoExpedicao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDtLiberadoExpedicao(JAXBElement<String> value) {
        this.dtLiberadoExpedicao = value;
    }

    /**
     * Obtém o valor da propriedade dtSaidaCaminhao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDtSaidaCaminhao() {
        return dtSaidaCaminhao;
    }

    /**
     * Define o valor da propriedade dtSaidaCaminhao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDtSaidaCaminhao(JAXBElement<String> value) {
        this.dtSaidaCaminhao = value;
    }

    /**
     * Obtém o valor da propriedade dtSolicitacaoExpedicao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDtSolicitacaoExpedicao() {
        return dtSolicitacaoExpedicao;
    }

    /**
     * Define o valor da propriedade dtSolicitacaoExpedicao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDtSolicitacaoExpedicao(JAXBElement<String> value) {
        this.dtSolicitacaoExpedicao = value;
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
     * Obtém o valor da propriedade filial.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFilial() {
        return filial;
    }

    /**
     * Define o valor da propriedade filial.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFilial(Integer value) {
        this.filial = value;
    }

    /**
     * Obtém o valor da propriedade freteFob.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFreteFob() {
        return freteFob;
    }

    /**
     * Define o valor da propriedade freteFob.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFreteFob(JAXBElement<String> value) {
        this.freteFob = value;
    }

    /**
     * Obtém o valor da propriedade liberado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLiberado() {
        return liberado;
    }

    /**
     * Define o valor da propriedade liberado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLiberado(JAXBElement<String> value) {
        this.liberado = value;
    }

    /**
     * Obtém o valor da propriedade localCarregamento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalCarregamento() {
        return localCarregamento;
    }

    /**
     * Define o valor da propriedade localCarregamento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalCarregamento(JAXBElement<String> value) {
        this.localCarregamento = value;
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
     * Obtém o valor da propriedade notas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscal }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNotaFiscal> getNotas() {
        return notas;
    }

    /**
     * Define o valor da propriedade notas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscal }{@code >}
     *     
     */
    public void setNotas(JAXBElement<ArrayOfNotaFiscal> value) {
        this.notas = value;
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
     * Obtém o valor da propriedade observacaoCarga.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObservacaoCarga() {
        return observacaoCarga;
    }

    /**
     * Define o valor da propriedade observacaoCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObservacaoCarga(JAXBElement<String> value) {
        this.observacaoCarga = value;
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
     * Obtém o valor da propriedade pedidos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPedido }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPedido> getPedidos() {
        return pedidos;
    }

    /**
     * Define o valor da propriedade pedidos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPedido }{@code >}
     *     
     */
    public void setPedidos(JAXBElement<ArrayOfPedido> value) {
        this.pedidos = value;
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
     * Obtém o valor da propriedade portaEmbarque.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPortaEmbarque() {
        return portaEmbarque;
    }

    /**
     * Define o valor da propriedade portaEmbarque.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPortaEmbarque(JAXBElement<String> value) {
        this.portaEmbarque = value;
    }

    /**
     * Obtém o valor da propriedade qde.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQde() {
        return qde;
    }

    /**
     * Define o valor da propriedade qde.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQde(Integer value) {
        this.qde = value;
    }

    /**
     * Obtém o valor da propriedade tipoCarga.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCarga() {
        return tipoCarga;
    }

    /**
     * Define o valor da propriedade tipoCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCarga(JAXBElement<String> value) {
        this.tipoCarga = value;
    }

    /**
     * Obtém o valor da propriedade totalEntrega.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalEntrega() {
        return totalEntrega;
    }

    /**
     * Define o valor da propriedade totalEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalEntrega(Integer value) {
        this.totalEntrega = value;
    }

    /**
     * Obtém o valor da propriedade totalVolume.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalVolume() {
        return totalVolume;
    }

    /**
     * Define o valor da propriedade totalVolume.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalVolume(Double value) {
        this.totalVolume = value;
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
     * Obtém o valor da propriedade vlrConhecimento.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVlrConhecimento() {
        return vlrConhecimento;
    }

    /**
     * Define o valor da propriedade vlrConhecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVlrConhecimento(Double value) {
        this.vlrConhecimento = value;
    }

    /**
     * Obtém o valor da propriedade vlrFrete.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVlrFrete() {
        return vlrFrete;
    }

    /**
     * Define o valor da propriedade vlrFrete.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVlrFrete(Double value) {
        this.vlrFrete = value;
    }

    /**
     * Obtém o valor da propriedade vlrFreteCalculado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVlrFreteCalculado() {
        return vlrFreteCalculado;
    }

    /**
     * Define o valor da propriedade vlrFreteCalculado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVlrFreteCalculado(Double value) {
        this.vlrFreteCalculado = value;
    }

    /**
     * Obtém o valor da propriedade vlrFreteCarga.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVlrFreteCarga() {
        return vlrFreteCarga;
    }

    /**
     * Define o valor da propriedade vlrFreteCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVlrFreteCarga(Double value) {
        this.vlrFreteCarga = value;
    }

    /**
     * Obtém o valor da propriedade vlrFreteCubico.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVlrFreteCubico() {
        return vlrFreteCubico;
    }

    /**
     * Define o valor da propriedade vlrFreteCubico.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVlrFreteCubico(Double value) {
        this.vlrFreteCubico = value;
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

    /**
     * Obtém o valor da propriedade vlrPedagio.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVlrPedagio() {
        return vlrPedagio;
    }

    /**
     * Define o valor da propriedade vlrPedagio.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVlrPedagio(Double value) {
        this.vlrPedagio = value;
    }

    /**
     * Obtém o valor da propriedade vlrRedespacho.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVlrRedespacho() {
        return vlrRedespacho;
    }

    /**
     * Define o valor da propriedade vlrRedespacho.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVlrRedespacho(Double value) {
        this.vlrRedespacho = value;
    }

    /**
     * Obtém o valor da propriedade vlrTxEntrega.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVlrTxEntrega() {
        return vlrTxEntrega;
    }

    /**
     * Define o valor da propriedade vlrTxEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVlrTxEntrega(Double value) {
        this.vlrTxEntrega = value;
    }

    /**
     * Obtém o valor da propriedade vlrTxEntregaCalc.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVlrTxEntregaCalc() {
        return vlrTxEntregaCalc;
    }

    /**
     * Define o valor da propriedade vlrTxEntregaCalc.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVlrTxEntregaCalc(Double value) {
        this.vlrTxEntregaCalc = value;
    }

}
