package com.example.demo.controller;

import com.example.demo.database.BancoCompra;
import com.example.demo.database.BancoFornecedor;
import com.example.demo.model.Compra;

import java.util.List;

public class CompraController {
    BancoCompra bancoCompra = BancoCompra.getInstance();
    BancoFornecedor bancoFornecedor = BancoFornecedor.getInstance();

    public List<Compra> listarCompra() {
        return bancoCompra.findAllCompra();
    }

    public boolean postarCompra(Compra compra) {
        if(bancoFornecedor.findOneFornecedor(compra.getFornecedor().getId())==null){
            return false;
        }

        bancoCompra.insertCompra(compra);
        return true;
    }

    public boolean atualizarCompra(Compra compra) {
        return bancoCompra.updateCompra(compra);
    }

    public boolean deletarCompra(int id) {
        return bancoCompra.deleteCompra(id);
    }
}
