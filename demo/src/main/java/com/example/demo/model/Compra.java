package com.example.demo.model;

import java.time.ZonedDateTime;

public class Compra {
    private Integer id;
    private Fornecedor fornecedor;
    private Double valor;
    private ZonedDateTime data_compra;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public ZonedDateTime getData_compra() {
        return data_compra;
    }

    public void setData_compra(ZonedDateTime data_compra) {
        this.data_compra = data_compra;
    }
}
