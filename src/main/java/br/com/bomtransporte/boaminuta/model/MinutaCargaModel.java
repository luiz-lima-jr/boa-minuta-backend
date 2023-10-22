package br.com.bomtransporte.boaminuta.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class MinutaCargaModel {

    private Long numeroCarga;
    private String direto;
    private String placa;
    private String motorista;
    private String redespacho;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT")
    private LocalDateTime dataSaida;
    private Double pesoBruto;
    private Double valorTotal;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT")
    private LocalDateTime dataFatura;
    private Double totalVolumes;
    private Double icmsFrete;
    private Double pedagio;
    private Long cidades;
    private Double taxaEntrega;
    private Double volumeTotalCaminhao;
    private Double volumeTotalCarga;
    private Double valorFrete;
    private String observacoes;

    private List<PedidoModel> pedidos;
    private List<ClienteModel> clientes;
}
