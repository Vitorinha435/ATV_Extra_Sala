package com.example.demo.controller;

import com.example.demo.database.BancoFornecedor;
import com.example.demo.model.Fornecedor;

import java.util.List;

public class FornecedorController {
    BancoFornecedor banco = BancoFornecedor.getInstance();

    public List<Fornecedor> listarFornecedor() {
        return banco.findAllFornecedor();
    }

    public void postarFornecedor(Fornecedor fornecedor) {
        banco.insertFornecedor(fornecedor);
    }

    public boolean atualizarFornecedor(Fornecedor fornecedor) {
        return banco.updateFornecedor(fornecedor);
    }

    public boolean deletarFornecedor(int id) {
        return banco.deleteFornecedor(id);
    }
}
