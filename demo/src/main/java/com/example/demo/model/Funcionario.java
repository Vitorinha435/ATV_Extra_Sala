package com.example.demo.model;

public class Funcionario {
    private Integer id;
    private String nome;
    private String cpf;
    private Double comissao_por_venda;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getComissao_por_venda() {
        return comissao_por_venda;
    }

    public void setComissao_por_venda(Double comissao_por_venda) {
        this.comissao_por_venda = comissao_por_venda;
    }
}
