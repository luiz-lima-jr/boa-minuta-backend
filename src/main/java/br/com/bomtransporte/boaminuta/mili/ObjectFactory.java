//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v3.0.0 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2023.07.12 às 11:54:22 AM GMT-03:00 
//


package br.com.bomtransporte.boaminuta.mili;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.bomtransporte.boaminuta.mili package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AuthorizationException_QNAME = new QName("http://controller.carga.efrotas.mili.com.br", "AuthorizationException");
    private final static QName _ReferenciaMotoristaData_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "data");
    private final static QName _ReferenciaMotoristaNome_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "nome");
    private final static QName _ReferenciaMotoristaObservacao_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "observacao");
    private final static QName _ReferenciaMotoristaTelefone_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "telefone");
    private final static QName _MotoristaAparecencia_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "aparecencia");
    private final static QName _MotoristaAtivo_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "ativo");
    private final static QName _MotoristaBairro_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "bairro");
    private final static QName _MotoristaCelular_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "celular");
    private final static QName _MotoristaCep_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "cep");
    private final static QName _MotoristaCidade_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "cidade");
    private final static QName _MotoristaCnh_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "cnh");
    private final static QName _MotoristaCpf_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "cpf");
    private final static QName _MotoristaCpfTitularConta_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "cpfTitularConta");
    private final static QName _MotoristaDataCadastro_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "dataCadastro");
    private final static QName _MotoristaDigitoCC_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "digitoCC");
    private final static QName _MotoristaDigitoCodAgencia_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "digitoCodAgencia");
    private final static QName _MotoristaDtNascimento_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "dtNascimento");
    private final static QName _MotoristaEducacao_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "educacao");
    private final static QName _MotoristaEndereco_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "endereco");
    private final static QName _MotoristaId_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "id");
    private final static QName _MotoristaNomeCompleto_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "nomeCompleto");
    private final static QName _MotoristaNomeTitularConta_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "nomeTitularConta");
    private final static QName _MotoristaNumeroCC_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "numeroCC");
    private final static QName _MotoristaObs_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "obs");
    private final static QName _MotoristaOperacao_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "operacao");
    private final static QName _MotoristaReferencias_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "referencias");
    private final static QName _MotoristaRg_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "rg");
    private final static QName _MotoristaUf_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "uf");
    private final static QName _MotoristaVestuario_QNAME = new QName("http://entities.motorista.efrotas.mili.com.br", "vestuario");
    private final static QName _CaminhaoAltura1M_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "altura1M");
    private final static QName _CaminhaoAltura2M_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "altura2M");
    private final static QName _CaminhaoAno_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "ano");
    private final static QName _CaminhaoAparenciaCabine_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "aparenciaCabine");
    private final static QName _CaminhaoAparenciaExtCarroceria_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "aparenciaExtCarroceria");
    private final static QName _CaminhaoAparenciaGeralVeiculo_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "aparenciaGeralVeiculo");
    private final static QName _CaminhaoAparenciaIntCarroceria_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "aparenciaIntCarroceria");
    private final static QName _CaminhaoAparenciaLimpeza_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "aparenciaLimpeza");
    private final static QName _CaminhaoAtivo_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "ativo");
    private final static QName _CaminhaoChassi_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "chassi");
    private final static QName _CaminhaoCnht_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "cnht");
    private final static QName _CaminhaoCodigoANTT_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "codigoANTT");
    private final static QName _CaminhaoComprimento1M_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "comprimento1M");
    private final static QName _CaminhaoComprimento2M_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "comprimento2M");
    private final static QName _CaminhaoContaContabil_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "contaContabil");
    private final static QName _CaminhaoCor_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "cor");
    private final static QName _CaminhaoCpf_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "cpf");
    private final static QName _CaminhaoDataAlteracao_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "dataAlteracao");
    private final static QName _CaminhaoDataCadastro_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "dataCadastro");
    private final static QName _CaminhaoDataMedicao_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "dataMedicao");
    private final static QName _CaminhaoEndereco_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "endereco");
    private final static QName _CaminhaoEntradaBloqueada_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "entradaBloqueada");
    private final static QName _CaminhaoLargura1M_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "largura1M");
    private final static QName _CaminhaoLargura2M_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "largura2M");
    private final static QName _CaminhaoMarca_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "marca");
    private final static QName _CaminhaoMotorista_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "motorista");
    private final static QName _CaminhaoMunicipio_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "municipio");
    private final static QName _CaminhaoNumCartaoPedagio_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "numCartaoPedagio");
    private final static QName _CaminhaoNumeroEixo_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "numeroEixo");
    private final static QName _CaminhaoObservacao_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "observacao");
    private final static QName _CaminhaoOperacao_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "operacao");
    private final static QName _CaminhaoPeso_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "peso");
    private final static QName _CaminhaoPlaca_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "placa");
    private final static QName _CaminhaoPlacaCarreta_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "placaCarreta");
    private final static QName _CaminhaoProprietario_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "proprietario");
    private final static QName _CaminhaoQtMaxCarga_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "qtMaxCarga");
    private final static QName _CaminhaoRenavam_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "renavam");
    private final static QName _CaminhaoRg_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "rg");
    private final static QName _CaminhaoStatus_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "status");
    private final static QName _CaminhaoTelefone_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "telefone");
    private final static QName _CaminhaoTipo_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "tipo");
    private final static QName _CaminhaoTipoCarroceria_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "tipoCarroceria");
    private final static QName _CaminhaoUfPlaca_QNAME = new QName("http://entities.caminhao.efrotas.mili.com.br", "ufPlaca");
    private final static QName _ItemProduto_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "produto");
    private final static QName _ItemSerie_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "serie");
    private final static QName _ItemStatus_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "status");
    private final static QName _ItemTabela_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "tabela");
    private final static QName _ItemVendaBonificacao_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "vendaBonificacao");
    private final static QName _NotaFiscalCaminhao_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "caminhao");
    private final static QName _NotaFiscalChaveAcesso_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "chaveAcesso");
    private final static QName _NotaFiscalCliente_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "cliente");
    private final static QName _NotaFiscalDataInicioTransmissao_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "dataInicioTransmissao");
    private final static QName _NotaFiscalDtAlteracao_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "dtAlteracao");
    private final static QName _NotaFiscalDtEmissao_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "dtEmissao");
    private final static QName _NotaFiscalDtSaida_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "dtSaida");
    private final static QName _NotaFiscalItens_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "itens");
    private final static QName _NotaFiscalOperacao_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "operacao");
    private final static QName _ProdutoCEan_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "cEan");
    private final static QName _ProdutoDescricao_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "descricao");
    private final static QName _ProdutoIdSetor_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "idSetor");
    private final static QName _ProdutoUnidade_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "unidade");
    private final static QName _ClienteBairro_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "bairro");
    private final static QName _ClienteCep_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "cep");
    private final static QName _ClienteCidade_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "cidade");
    private final static QName _ClienteCnpj_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "cnpj");
    private final static QName _ClienteEmailNfe_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "emailNfe");
    private final static QName _ClienteEndereco_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "endereco");
    private final static QName _ClienteIe_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "ie");
    private final static QName _ClienteNomeFantasia_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "nomeFantasia");
    private final static QName _ClienteObservacao_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "observacao");
    private final static QName _ClienteOrdem_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "ordem");
    private final static QName _ClienteRazaoSocial_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "razaoSocial");
    private final static QName _ClienteTelefone_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "telefone");
    private final static QName _ClienteUf_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "uf");
    private final static QName _PedidoItensPedidos_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "itensPedidos");
    private final static QName _PedidoNf_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "nf");
    private final static QName _PedidoNrPedido_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "nrPedido");
    private final static QName _CargaClienteRetira_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "clienteRetira");
    private final static QName _CargaCnpjRedespacho_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "cnpjRedespacho");
    private final static QName _CargaDataAlteracao_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "dataAlteracao");
    private final static QName _CargaDestino_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "destino");
    private final static QName _CargaDtCaminhaoPatio_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "dtCaminhaoPatio");
    private final static QName _CargaDtFaturamento_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "dtFaturamento");
    private final static QName _CargaDtFinalExpedicao_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "dtFinalExpedicao");
    private final static QName _CargaDtHrFaturamento_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "dtHrFaturamento");
    private final static QName _CargaDtLiberacaoFaturamento_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "dtLiberacaoFaturamento");
    private final static QName _CargaDtLiberacaoTransporte_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "dtLiberacaoTransporte");
    private final static QName _CargaDtLiberadoExpedicao_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "dtLiberadoExpedicao");
    private final static QName _CargaDtSaidaCaminhao_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "dtSaidaCaminhao");
    private final static QName _CargaDtSolicitacaoExpedicao_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "dtSolicitacaoExpedicao");
    private final static QName _CargaFreteFob_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "freteFob");
    private final static QName _CargaLiberado_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "liberado");
    private final static QName _CargaLocalCarregamento_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "localCarregamento");
    private final static QName _CargaMotorista_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "motorista");
    private final static QName _CargaNotas_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "notas");
    private final static QName _CargaObservacaoCarga_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "observacaoCarga");
    private final static QName _CargaPedidos_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "pedidos");
    private final static QName _CargaPortaEmbarque_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "portaEmbarque");
    private final static QName _CargaTipoCarga_QNAME = new QName("http://entities.carga.efrotas.mili.com.br", "tipoCarga");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.bomtransporte.boaminuta.mili
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarCargasDisponiveisRedespacho }
     * 
     */
    public ConsultarCargasDisponiveisRedespacho createConsultarCargasDisponiveisRedespacho() {
        return new ConsultarCargasDisponiveisRedespacho();
    }

    /**
     * Create an instance of {@link ConsultarCargasDisponiveisRedespachoResponse }
     * 
     */
    public ConsultarCargasDisponiveisRedespachoResponse createConsultarCargasDisponiveisRedespachoResponse() {
        return new ConsultarCargasDisponiveisRedespachoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCarga }
     * 
     */
    public ArrayOfCarga createArrayOfCarga() {
        return new ArrayOfCarga();
    }

    /**
     * Create an instance of {@link AuthorizationException }
     * 
     */
    public AuthorizationException createAuthorizationException() {
        return new AuthorizationException();
    }

    /**
     * Create an instance of {@link ReceberCargaRedespacho }
     * 
     */
    public ReceberCargaRedespacho createReceberCargaRedespacho() {
        return new ReceberCargaRedespacho();
    }

    /**
     * Create an instance of {@link ReceberCargaRedespachoResponse }
     * 
     */
    public ReceberCargaRedespachoResponse createReceberCargaRedespachoResponse() {
        return new ReceberCargaRedespachoResponse();
    }

    /**
     * Create an instance of {@link Carga }
     * 
     */
    public Carga createCarga() {
        return new Carga();
    }

    /**
     * Create an instance of {@link FinalizarTransmissaoDelete }
     * 
     */
    public FinalizarTransmissaoDelete createFinalizarTransmissaoDelete() {
        return new FinalizarTransmissaoDelete();
    }

    /**
     * Create an instance of {@link FinalizarTransmissaoDeleteResponse }
     * 
     */
    public FinalizarTransmissaoDeleteResponse createFinalizarTransmissaoDeleteResponse() {
        return new FinalizarTransmissaoDeleteResponse();
    }

    /**
     * Create an instance of {@link ConsultarCargasDisponiveis }
     * 
     */
    public ConsultarCargasDisponiveis createConsultarCargasDisponiveis() {
        return new ConsultarCargasDisponiveis();
    }

    /**
     * Create an instance of {@link ConsultarCargasDisponiveisResponse }
     * 
     */
    public ConsultarCargasDisponiveisResponse createConsultarCargasDisponiveisResponse() {
        return new ConsultarCargasDisponiveisResponse();
    }

    /**
     * Create an instance of {@link FinalizarTransmissaoRedespacho }
     * 
     */
    public FinalizarTransmissaoRedespacho createFinalizarTransmissaoRedespacho() {
        return new FinalizarTransmissaoRedespacho();
    }

    /**
     * Create an instance of {@link FinalizarTransmissaoRedespachoResponse }
     * 
     */
    public FinalizarTransmissaoRedespachoResponse createFinalizarTransmissaoRedespachoResponse() {
        return new FinalizarTransmissaoRedespachoResponse();
    }

    /**
     * Create an instance of {@link FinalizarTransmissao }
     * 
     */
    public FinalizarTransmissao createFinalizarTransmissao() {
        return new FinalizarTransmissao();
    }

    /**
     * Create an instance of {@link FinalizarTransmissaoResponse }
     * 
     */
    public FinalizarTransmissaoResponse createFinalizarTransmissaoResponse() {
        return new FinalizarTransmissaoResponse();
    }

    /**
     * Create an instance of {@link ReceberCargaResumido }
     * 
     */
    public ReceberCargaResumido createReceberCargaResumido() {
        return new ReceberCargaResumido();
    }

    /**
     * Create an instance of {@link ReceberCargaResumidoResponse }
     * 
     */
    public ReceberCargaResumidoResponse createReceberCargaResumidoResponse() {
        return new ReceberCargaResumidoResponse();
    }

    /**
     * Create an instance of {@link ReceberCarga }
     * 
     */
    public ReceberCarga createReceberCarga() {
        return new ReceberCarga();
    }

    /**
     * Create an instance of {@link ReceberCargaResponse }
     * 
     */
    public ReceberCargaResponse createReceberCargaResponse() {
        return new ReceberCargaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPedido }
     * 
     */
    public ArrayOfPedido createArrayOfPedido() {
        return new ArrayOfPedido();
    }

    /**
     * Create an instance of {@link Pedido }
     * 
     */
    public Pedido createPedido() {
        return new Pedido();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link ArrayOfItemPedido }
     * 
     */
    public ArrayOfItemPedido createArrayOfItemPedido() {
        return new ArrayOfItemPedido();
    }

    /**
     * Create an instance of {@link ItemPedido }
     * 
     */
    public ItemPedido createItemPedido() {
        return new ItemPedido();
    }

    /**
     * Create an instance of {@link Produto }
     * 
     */
    public Produto createProduto() {
        return new Produto();
    }

    /**
     * Create an instance of {@link NotaFiscal }
     * 
     */
    public NotaFiscal createNotaFiscal() {
        return new NotaFiscal();
    }

    /**
     * Create an instance of {@link ArrayOfItem }
     * 
     */
    public ArrayOfItem createArrayOfItem() {
        return new ArrayOfItem();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link ArrayOfNotaFiscal }
     * 
     */
    public ArrayOfNotaFiscal createArrayOfNotaFiscal() {
        return new ArrayOfNotaFiscal();
    }

    /**
     * Create an instance of {@link Caminhao }
     * 
     */
    public Caminhao createCaminhao() {
        return new Caminhao();
    }

    /**
     * Create an instance of {@link Motorista }
     * 
     */
    public Motorista createMotorista() {
        return new Motorista();
    }

    /**
     * Create an instance of {@link ArrayOfReferenciaMotorista }
     * 
     */
    public ArrayOfReferenciaMotorista createArrayOfReferenciaMotorista() {
        return new ArrayOfReferenciaMotorista();
    }

    /**
     * Create an instance of {@link ReferenciaMotorista }
     * 
     */
    public ReferenciaMotorista createReferenciaMotorista() {
        return new ReferenciaMotorista();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizationException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthorizationException }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.carga.efrotas.mili.com.br", name = "AuthorizationException")
    public JAXBElement<AuthorizationException> createAuthorizationException(AuthorizationException value) {
        return new JAXBElement<AuthorizationException>(_AuthorizationException_QNAME, AuthorizationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "data", scope = ReferenciaMotorista.class)
    public JAXBElement<String> createReferenciaMotoristaData(String value) {
        return new JAXBElement<String>(_ReferenciaMotoristaData_QNAME, String.class, ReferenciaMotorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "nome", scope = ReferenciaMotorista.class)
    public JAXBElement<String> createReferenciaMotoristaNome(String value) {
        return new JAXBElement<String>(_ReferenciaMotoristaNome_QNAME, String.class, ReferenciaMotorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "observacao", scope = ReferenciaMotorista.class)
    public JAXBElement<String> createReferenciaMotoristaObservacao(String value) {
        return new JAXBElement<String>(_ReferenciaMotoristaObservacao_QNAME, String.class, ReferenciaMotorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "telefone", scope = ReferenciaMotorista.class)
    public JAXBElement<String> createReferenciaMotoristaTelefone(String value) {
        return new JAXBElement<String>(_ReferenciaMotoristaTelefone_QNAME, String.class, ReferenciaMotorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "aparecencia", scope = Motorista.class)
    public JAXBElement<String> createMotoristaAparecencia(String value) {
        return new JAXBElement<String>(_MotoristaAparecencia_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "ativo", scope = Motorista.class)
    public JAXBElement<String> createMotoristaAtivo(String value) {
        return new JAXBElement<String>(_MotoristaAtivo_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "bairro", scope = Motorista.class)
    public JAXBElement<String> createMotoristaBairro(String value) {
        return new JAXBElement<String>(_MotoristaBairro_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "celular", scope = Motorista.class)
    public JAXBElement<String> createMotoristaCelular(String value) {
        return new JAXBElement<String>(_MotoristaCelular_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "cep", scope = Motorista.class)
    public JAXBElement<String> createMotoristaCep(String value) {
        return new JAXBElement<String>(_MotoristaCep_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "cidade", scope = Motorista.class)
    public JAXBElement<String> createMotoristaCidade(String value) {
        return new JAXBElement<String>(_MotoristaCidade_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "cnh", scope = Motorista.class)
    public JAXBElement<String> createMotoristaCnh(String value) {
        return new JAXBElement<String>(_MotoristaCnh_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "cpf", scope = Motorista.class)
    public JAXBElement<String> createMotoristaCpf(String value) {
        return new JAXBElement<String>(_MotoristaCpf_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "cpfTitularConta", scope = Motorista.class)
    public JAXBElement<String> createMotoristaCpfTitularConta(String value) {
        return new JAXBElement<String>(_MotoristaCpfTitularConta_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "dataCadastro", scope = Motorista.class)
    public JAXBElement<String> createMotoristaDataCadastro(String value) {
        return new JAXBElement<String>(_MotoristaDataCadastro_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "digitoCC", scope = Motorista.class)
    public JAXBElement<String> createMotoristaDigitoCC(String value) {
        return new JAXBElement<String>(_MotoristaDigitoCC_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "digitoCodAgencia", scope = Motorista.class)
    public JAXBElement<String> createMotoristaDigitoCodAgencia(String value) {
        return new JAXBElement<String>(_MotoristaDigitoCodAgencia_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "dtNascimento", scope = Motorista.class)
    public JAXBElement<String> createMotoristaDtNascimento(String value) {
        return new JAXBElement<String>(_MotoristaDtNascimento_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "educacao", scope = Motorista.class)
    public JAXBElement<String> createMotoristaEducacao(String value) {
        return new JAXBElement<String>(_MotoristaEducacao_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "endereco", scope = Motorista.class)
    public JAXBElement<String> createMotoristaEndereco(String value) {
        return new JAXBElement<String>(_MotoristaEndereco_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "id", scope = Motorista.class)
    public JAXBElement<Long> createMotoristaId(Long value) {
        return new JAXBElement<Long>(_MotoristaId_QNAME, Long.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "nomeCompleto", scope = Motorista.class)
    public JAXBElement<String> createMotoristaNomeCompleto(String value) {
        return new JAXBElement<String>(_MotoristaNomeCompleto_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "nomeTitularConta", scope = Motorista.class)
    public JAXBElement<String> createMotoristaNomeTitularConta(String value) {
        return new JAXBElement<String>(_MotoristaNomeTitularConta_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "numeroCC", scope = Motorista.class)
    public JAXBElement<String> createMotoristaNumeroCC(String value) {
        return new JAXBElement<String>(_MotoristaNumeroCC_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "obs", scope = Motorista.class)
    public JAXBElement<String> createMotoristaObs(String value) {
        return new JAXBElement<String>(_MotoristaObs_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "operacao", scope = Motorista.class)
    public JAXBElement<String> createMotoristaOperacao(String value) {
        return new JAXBElement<String>(_MotoristaOperacao_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReferenciaMotorista }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfReferenciaMotorista }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "referencias", scope = Motorista.class)
    public JAXBElement<ArrayOfReferenciaMotorista> createMotoristaReferencias(ArrayOfReferenciaMotorista value) {
        return new JAXBElement<ArrayOfReferenciaMotorista>(_MotoristaReferencias_QNAME, ArrayOfReferenciaMotorista.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "rg", scope = Motorista.class)
    public JAXBElement<String> createMotoristaRg(String value) {
        return new JAXBElement<String>(_MotoristaRg_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "telefone", scope = Motorista.class)
    public JAXBElement<String> createMotoristaTelefone(String value) {
        return new JAXBElement<String>(_ReferenciaMotoristaTelefone_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "uf", scope = Motorista.class)
    public JAXBElement<String> createMotoristaUf(String value) {
        return new JAXBElement<String>(_MotoristaUf_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.motorista.efrotas.mili.com.br", name = "vestuario", scope = Motorista.class)
    public JAXBElement<String> createMotoristaVestuario(String value) {
        return new JAXBElement<String>(_MotoristaVestuario_QNAME, String.class, Motorista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "altura1M", scope = Caminhao.class)
    public JAXBElement<Double> createCaminhaoAltura1M(Double value) {
        return new JAXBElement<Double>(_CaminhaoAltura1M_QNAME, Double.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "altura2M", scope = Caminhao.class)
    public JAXBElement<Double> createCaminhaoAltura2M(Double value) {
        return new JAXBElement<Double>(_CaminhaoAltura2M_QNAME, Double.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "ano", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoAno(String value) {
        return new JAXBElement<String>(_CaminhaoAno_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "aparenciaCabine", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoAparenciaCabine(String value) {
        return new JAXBElement<String>(_CaminhaoAparenciaCabine_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "aparenciaExtCarroceria", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoAparenciaExtCarroceria(String value) {
        return new JAXBElement<String>(_CaminhaoAparenciaExtCarroceria_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "aparenciaGeralVeiculo", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoAparenciaGeralVeiculo(String value) {
        return new JAXBElement<String>(_CaminhaoAparenciaGeralVeiculo_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "aparenciaIntCarroceria", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoAparenciaIntCarroceria(String value) {
        return new JAXBElement<String>(_CaminhaoAparenciaIntCarroceria_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "aparenciaLimpeza", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoAparenciaLimpeza(String value) {
        return new JAXBElement<String>(_CaminhaoAparenciaLimpeza_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "ativo", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoAtivo(String value) {
        return new JAXBElement<String>(_CaminhaoAtivo_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "chassi", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoChassi(String value) {
        return new JAXBElement<String>(_CaminhaoChassi_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "cnht", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoCnht(String value) {
        return new JAXBElement<String>(_CaminhaoCnht_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "codigoANTT", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoCodigoANTT(String value) {
        return new JAXBElement<String>(_CaminhaoCodigoANTT_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "comprimento1M", scope = Caminhao.class)
    public JAXBElement<Double> createCaminhaoComprimento1M(Double value) {
        return new JAXBElement<Double>(_CaminhaoComprimento1M_QNAME, Double.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "comprimento2M", scope = Caminhao.class)
    public JAXBElement<Double> createCaminhaoComprimento2M(Double value) {
        return new JAXBElement<Double>(_CaminhaoComprimento2M_QNAME, Double.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "contaContabil", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoContaContabil(String value) {
        return new JAXBElement<String>(_CaminhaoContaContabil_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "cor", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoCor(String value) {
        return new JAXBElement<String>(_CaminhaoCor_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "cpf", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoCpf(String value) {
        return new JAXBElement<String>(_CaminhaoCpf_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "dataAlteracao", scope = Caminhao.class)
    public JAXBElement<XMLGregorianCalendar> createCaminhaoDataAlteracao(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CaminhaoDataAlteracao_QNAME, XMLGregorianCalendar.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "dataCadastro", scope = Caminhao.class)
    public JAXBElement<XMLGregorianCalendar> createCaminhaoDataCadastro(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CaminhaoDataCadastro_QNAME, XMLGregorianCalendar.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "dataMedicao", scope = Caminhao.class)
    public JAXBElement<XMLGregorianCalendar> createCaminhaoDataMedicao(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CaminhaoDataMedicao_QNAME, XMLGregorianCalendar.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "endereco", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoEndereco(String value) {
        return new JAXBElement<String>(_CaminhaoEndereco_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "entradaBloqueada", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoEntradaBloqueada(String value) {
        return new JAXBElement<String>(_CaminhaoEntradaBloqueada_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "largura1M", scope = Caminhao.class)
    public JAXBElement<Double> createCaminhaoLargura1M(Double value) {
        return new JAXBElement<Double>(_CaminhaoLargura1M_QNAME, Double.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "largura2M", scope = Caminhao.class)
    public JAXBElement<Double> createCaminhaoLargura2M(Double value) {
        return new JAXBElement<Double>(_CaminhaoLargura2M_QNAME, Double.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "marca", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoMarca(String value) {
        return new JAXBElement<String>(_CaminhaoMarca_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Motorista }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Motorista }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "motorista", scope = Caminhao.class)
    public JAXBElement<Motorista> createCaminhaoMotorista(Motorista value) {
        return new JAXBElement<Motorista>(_CaminhaoMotorista_QNAME, Motorista.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "municipio", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoMunicipio(String value) {
        return new JAXBElement<String>(_CaminhaoMunicipio_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "numCartaoPedagio", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoNumCartaoPedagio(String value) {
        return new JAXBElement<String>(_CaminhaoNumCartaoPedagio_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "numeroEixo", scope = Caminhao.class)
    public JAXBElement<Integer> createCaminhaoNumeroEixo(Integer value) {
        return new JAXBElement<Integer>(_CaminhaoNumeroEixo_QNAME, Integer.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "observacao", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoObservacao(String value) {
        return new JAXBElement<String>(_CaminhaoObservacao_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "operacao", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoOperacao(String value) {
        return new JAXBElement<String>(_CaminhaoOperacao_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "peso", scope = Caminhao.class)
    public JAXBElement<Double> createCaminhaoPeso(Double value) {
        return new JAXBElement<Double>(_CaminhaoPeso_QNAME, Double.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "placa", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoPlaca(String value) {
        return new JAXBElement<String>(_CaminhaoPlaca_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "placaCarreta", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoPlacaCarreta(String value) {
        return new JAXBElement<String>(_CaminhaoPlacaCarreta_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "proprietario", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoProprietario(String value) {
        return new JAXBElement<String>(_CaminhaoProprietario_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "qtMaxCarga", scope = Caminhao.class)
    public JAXBElement<Double> createCaminhaoQtMaxCarga(Double value) {
        return new JAXBElement<Double>(_CaminhaoQtMaxCarga_QNAME, Double.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "renavam", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoRenavam(String value) {
        return new JAXBElement<String>(_CaminhaoRenavam_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "rg", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoRg(String value) {
        return new JAXBElement<String>(_CaminhaoRg_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "status", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoStatus(String value) {
        return new JAXBElement<String>(_CaminhaoStatus_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "telefone", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoTelefone(String value) {
        return new JAXBElement<String>(_CaminhaoTelefone_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "tipo", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoTipo(String value) {
        return new JAXBElement<String>(_CaminhaoTipo_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "tipoCarroceria", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoTipoCarroceria(String value) {
        return new JAXBElement<String>(_CaminhaoTipoCarroceria_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.caminhao.efrotas.mili.com.br", name = "ufPlaca", scope = Caminhao.class)
    public JAXBElement<String> createCaminhaoUfPlaca(String value) {
        return new JAXBElement<String>(_CaminhaoUfPlaca_QNAME, String.class, Caminhao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Produto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Produto }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "produto", scope = Item.class)
    public JAXBElement<Produto> createItemProduto(Produto value) {
        return new JAXBElement<Produto>(_ItemProduto_QNAME, Produto.class, Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "serie", scope = Item.class)
    public JAXBElement<String> createItemSerie(String value) {
        return new JAXBElement<String>(_ItemSerie_QNAME, String.class, Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "status", scope = Item.class)
    public JAXBElement<String> createItemStatus(String value) {
        return new JAXBElement<String>(_ItemStatus_QNAME, String.class, Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "tabela", scope = Item.class)
    public JAXBElement<String> createItemTabela(String value) {
        return new JAXBElement<String>(_ItemTabela_QNAME, String.class, Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "vendaBonificacao", scope = Item.class)
    public JAXBElement<String> createItemVendaBonificacao(String value) {
        return new JAXBElement<String>(_ItemVendaBonificacao_QNAME, String.class, Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Caminhao }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Caminhao }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "caminhao", scope = NotaFiscal.class)
    public JAXBElement<Caminhao> createNotaFiscalCaminhao(Caminhao value) {
        return new JAXBElement<Caminhao>(_NotaFiscalCaminhao_QNAME, Caminhao.class, NotaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "chaveAcesso", scope = NotaFiscal.class)
    public JAXBElement<String> createNotaFiscalChaveAcesso(String value) {
        return new JAXBElement<String>(_NotaFiscalChaveAcesso_QNAME, String.class, NotaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "cliente", scope = NotaFiscal.class)
    public JAXBElement<Cliente> createNotaFiscalCliente(Cliente value) {
        return new JAXBElement<Cliente>(_NotaFiscalCliente_QNAME, Cliente.class, NotaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "dataInicioTransmissao", scope = NotaFiscal.class)
    public JAXBElement<String> createNotaFiscalDataInicioTransmissao(String value) {
        return new JAXBElement<String>(_NotaFiscalDataInicioTransmissao_QNAME, String.class, NotaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "dtAlteracao", scope = NotaFiscal.class)
    public JAXBElement<XMLGregorianCalendar> createNotaFiscalDtAlteracao(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NotaFiscalDtAlteracao_QNAME, XMLGregorianCalendar.class, NotaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "dtEmissao", scope = NotaFiscal.class)
    public JAXBElement<XMLGregorianCalendar> createNotaFiscalDtEmissao(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NotaFiscalDtEmissao_QNAME, XMLGregorianCalendar.class, NotaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "dtSaida", scope = NotaFiscal.class)
    public JAXBElement<XMLGregorianCalendar> createNotaFiscalDtSaida(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NotaFiscalDtSaida_QNAME, XMLGregorianCalendar.class, NotaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "itens", scope = NotaFiscal.class)
    public JAXBElement<ArrayOfItem> createNotaFiscalItens(ArrayOfItem value) {
        return new JAXBElement<ArrayOfItem>(_NotaFiscalItens_QNAME, ArrayOfItem.class, NotaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "operacao", scope = NotaFiscal.class)
    public JAXBElement<String> createNotaFiscalOperacao(String value) {
        return new JAXBElement<String>(_NotaFiscalOperacao_QNAME, String.class, NotaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "serie", scope = NotaFiscal.class)
    public JAXBElement<String> createNotaFiscalSerie(String value) {
        return new JAXBElement<String>(_ItemSerie_QNAME, String.class, NotaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "status", scope = NotaFiscal.class)
    public JAXBElement<String> createNotaFiscalStatus(String value) {
        return new JAXBElement<String>(_ItemStatus_QNAME, String.class, NotaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "tabela", scope = NotaFiscal.class)
    public JAXBElement<String> createNotaFiscalTabela(String value) {
        return new JAXBElement<String>(_ItemTabela_QNAME, String.class, NotaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "cEan", scope = Produto.class)
    public JAXBElement<String> createProdutoCEan(String value) {
        return new JAXBElement<String>(_ProdutoCEan_QNAME, String.class, Produto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "descricao", scope = Produto.class)
    public JAXBElement<String> createProdutoDescricao(String value) {
        return new JAXBElement<String>(_ProdutoDescricao_QNAME, String.class, Produto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "idSetor", scope = Produto.class)
    public JAXBElement<String> createProdutoIdSetor(String value) {
        return new JAXBElement<String>(_ProdutoIdSetor_QNAME, String.class, Produto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "unidade", scope = Produto.class)
    public JAXBElement<String> createProdutoUnidade(String value) {
        return new JAXBElement<String>(_ProdutoUnidade_QNAME, String.class, Produto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Produto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Produto }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "produto", scope = ItemPedido.class)
    public JAXBElement<Produto> createItemPedidoProduto(Produto value) {
        return new JAXBElement<Produto>(_ItemProduto_QNAME, Produto.class, ItemPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "serie", scope = ItemPedido.class)
    public JAXBElement<String> createItemPedidoSerie(String value) {
        return new JAXBElement<String>(_ItemSerie_QNAME, String.class, ItemPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "status", scope = ItemPedido.class)
    public JAXBElement<String> createItemPedidoStatus(String value) {
        return new JAXBElement<String>(_ItemStatus_QNAME, String.class, ItemPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "vendaBonificacao", scope = ItemPedido.class)
    public JAXBElement<String> createItemPedidoVendaBonificacao(String value) {
        return new JAXBElement<String>(_ItemVendaBonificacao_QNAME, String.class, ItemPedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "bairro", scope = Cliente.class)
    public JAXBElement<String> createClienteBairro(String value) {
        return new JAXBElement<String>(_ClienteBairro_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "cep", scope = Cliente.class)
    public JAXBElement<String> createClienteCep(String value) {
        return new JAXBElement<String>(_ClienteCep_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "cidade", scope = Cliente.class)
    public JAXBElement<String> createClienteCidade(String value) {
        return new JAXBElement<String>(_ClienteCidade_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "cnpj", scope = Cliente.class)
    public JAXBElement<String> createClienteCnpj(String value) {
        return new JAXBElement<String>(_ClienteCnpj_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "emailNfe", scope = Cliente.class)
    public JAXBElement<String> createClienteEmailNfe(String value) {
        return new JAXBElement<String>(_ClienteEmailNfe_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "endereco", scope = Cliente.class)
    public JAXBElement<String> createClienteEndereco(String value) {
        return new JAXBElement<String>(_ClienteEndereco_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "ie", scope = Cliente.class)
    public JAXBElement<String> createClienteIe(String value) {
        return new JAXBElement<String>(_ClienteIe_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "nomeFantasia", scope = Cliente.class)
    public JAXBElement<String> createClienteNomeFantasia(String value) {
        return new JAXBElement<String>(_ClienteNomeFantasia_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "observacao", scope = Cliente.class)
    public JAXBElement<String> createClienteObservacao(String value) {
        return new JAXBElement<String>(_ClienteObservacao_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "ordem", scope = Cliente.class)
    public JAXBElement<String> createClienteOrdem(String value) {
        return new JAXBElement<String>(_ClienteOrdem_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "razaoSocial", scope = Cliente.class)
    public JAXBElement<String> createClienteRazaoSocial(String value) {
        return new JAXBElement<String>(_ClienteRazaoSocial_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "telefone", scope = Cliente.class)
    public JAXBElement<String> createClienteTelefone(String value) {
        return new JAXBElement<String>(_ClienteTelefone_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "uf", scope = Cliente.class)
    public JAXBElement<String> createClienteUf(String value) {
        return new JAXBElement<String>(_ClienteUf_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "cliente", scope = Pedido.class)
    public JAXBElement<Cliente> createPedidoCliente(Cliente value) {
        return new JAXBElement<Cliente>(_NotaFiscalCliente_QNAME, Cliente.class, Pedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfItemPedido }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfItemPedido }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "itensPedidos", scope = Pedido.class)
    public JAXBElement<ArrayOfItemPedido> createPedidoItensPedidos(ArrayOfItemPedido value) {
        return new JAXBElement<ArrayOfItemPedido>(_PedidoItensPedidos_QNAME, ArrayOfItemPedido.class, Pedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotaFiscal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotaFiscal }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "nf", scope = Pedido.class)
    public JAXBElement<NotaFiscal> createPedidoNf(NotaFiscal value) {
        return new JAXBElement<NotaFiscal>(_PedidoNf_QNAME, NotaFiscal.class, Pedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "nrPedido", scope = Pedido.class)
    public JAXBElement<String> createPedidoNrPedido(String value) {
        return new JAXBElement<String>(_PedidoNrPedido_QNAME, String.class, Pedido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Caminhao }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Caminhao }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "caminhao", scope = Carga.class)
    public JAXBElement<Caminhao> createCargaCaminhao(Caminhao value) {
        return new JAXBElement<Caminhao>(_NotaFiscalCaminhao_QNAME, Caminhao.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "clienteRetira", scope = Carga.class)
    public JAXBElement<String> createCargaClienteRetira(String value) {
        return new JAXBElement<String>(_CargaClienteRetira_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "cnpjRedespacho", scope = Carga.class)
    public JAXBElement<String> createCargaCnpjRedespacho(String value) {
        return new JAXBElement<String>(_CargaCnpjRedespacho_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "dataAlteracao", scope = Carga.class)
    public JAXBElement<XMLGregorianCalendar> createCargaDataAlteracao(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CargaDataAlteracao_QNAME, XMLGregorianCalendar.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "dataInicioTransmissao", scope = Carga.class)
    public JAXBElement<String> createCargaDataInicioTransmissao(String value) {
        return new JAXBElement<String>(_NotaFiscalDataInicioTransmissao_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "destino", scope = Carga.class)
    public JAXBElement<String> createCargaDestino(String value) {
        return new JAXBElement<String>(_CargaDestino_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "dtCaminhaoPatio", scope = Carga.class)
    public JAXBElement<String> createCargaDtCaminhaoPatio(String value) {
        return new JAXBElement<String>(_CargaDtCaminhaoPatio_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "dtFaturamento", scope = Carga.class)
    public JAXBElement<String> createCargaDtFaturamento(String value) {
        return new JAXBElement<String>(_CargaDtFaturamento_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "dtFinalExpedicao", scope = Carga.class)
    public JAXBElement<String> createCargaDtFinalExpedicao(String value) {
        return new JAXBElement<String>(_CargaDtFinalExpedicao_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "dtHrFaturamento", scope = Carga.class)
    public JAXBElement<String> createCargaDtHrFaturamento(String value) {
        return new JAXBElement<String>(_CargaDtHrFaturamento_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "dtLiberacaoFaturamento", scope = Carga.class)
    public JAXBElement<String> createCargaDtLiberacaoFaturamento(String value) {
        return new JAXBElement<String>(_CargaDtLiberacaoFaturamento_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "dtLiberacaoTransporte", scope = Carga.class)
    public JAXBElement<String> createCargaDtLiberacaoTransporte(String value) {
        return new JAXBElement<String>(_CargaDtLiberacaoTransporte_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "dtLiberadoExpedicao", scope = Carga.class)
    public JAXBElement<String> createCargaDtLiberadoExpedicao(String value) {
        return new JAXBElement<String>(_CargaDtLiberadoExpedicao_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "dtSaidaCaminhao", scope = Carga.class)
    public JAXBElement<String> createCargaDtSaidaCaminhao(String value) {
        return new JAXBElement<String>(_CargaDtSaidaCaminhao_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "dtSolicitacaoExpedicao", scope = Carga.class)
    public JAXBElement<String> createCargaDtSolicitacaoExpedicao(String value) {
        return new JAXBElement<String>(_CargaDtSolicitacaoExpedicao_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "freteFob", scope = Carga.class)
    public JAXBElement<String> createCargaFreteFob(String value) {
        return new JAXBElement<String>(_CargaFreteFob_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "liberado", scope = Carga.class)
    public JAXBElement<String> createCargaLiberado(String value) {
        return new JAXBElement<String>(_CargaLiberado_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "localCarregamento", scope = Carga.class)
    public JAXBElement<String> createCargaLocalCarregamento(String value) {
        return new JAXBElement<String>(_CargaLocalCarregamento_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Motorista }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Motorista }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "motorista", scope = Carga.class)
    public JAXBElement<Motorista> createCargaMotorista(Motorista value) {
        return new JAXBElement<Motorista>(_CargaMotorista_QNAME, Motorista.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscal }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "notas", scope = Carga.class)
    public JAXBElement<ArrayOfNotaFiscal> createCargaNotas(ArrayOfNotaFiscal value) {
        return new JAXBElement<ArrayOfNotaFiscal>(_CargaNotas_QNAME, ArrayOfNotaFiscal.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "observacao", scope = Carga.class)
    public JAXBElement<String> createCargaObservacao(String value) {
        return new JAXBElement<String>(_ClienteObservacao_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "observacaoCarga", scope = Carga.class)
    public JAXBElement<String> createCargaObservacaoCarga(String value) {
        return new JAXBElement<String>(_CargaObservacaoCarga_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "operacao", scope = Carga.class)
    public JAXBElement<String> createCargaOperacao(String value) {
        return new JAXBElement<String>(_NotaFiscalOperacao_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPedido }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPedido }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "pedidos", scope = Carga.class)
    public JAXBElement<ArrayOfPedido> createCargaPedidos(ArrayOfPedido value) {
        return new JAXBElement<ArrayOfPedido>(_CargaPedidos_QNAME, ArrayOfPedido.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "portaEmbarque", scope = Carga.class)
    public JAXBElement<String> createCargaPortaEmbarque(String value) {
        return new JAXBElement<String>(_CargaPortaEmbarque_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "tipoCarga", scope = Carga.class)
    public JAXBElement<String> createCargaTipoCarga(String value) {
        return new JAXBElement<String>(_CargaTipoCarga_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://entities.carga.efrotas.mili.com.br", name = "uf", scope = Carga.class)
    public JAXBElement<String> createCargaUf(String value) {
        return new JAXBElement<String>(_ClienteUf_QNAME, String.class, Carga.class, value);
    }

}
