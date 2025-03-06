package com.example.demo.model;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Integer id;
    private Cliente cliente;
    private List<VendaProduto> produtos = new ArrayList<>();
    private Double valor_final_venda;
    private ZonedDateTime data_venda;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<VendaProduto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<VendaProduto> produtos) {
        this.produtos = produtos;
    }

    public Double getValor_final_venda() {
        return valor_final_venda;
    }

    public void setValor_final_venda(Double valor_final_venda) {
        this.valor_final_venda = valor_final_venda;
    }

    public ZonedDateTime getData_venda() {
        return data_venda;
    }

    public void setData_venda(ZonedDateTime data_venda) {
        this.data_venda = data_venda;
    }
}
