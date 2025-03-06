package com.example.demo.controller;

import com.example.demo.database.BancoCliente;
import com.example.demo.database.BancoProduto;
import com.example.demo.database.BancoVenda;
import com.example.demo.model.Produto;
import com.example.demo.model.Venda;
import com.example.demo.model.VendaProduto;

import java.util.List;

public class VendaController {
    BancoVenda bancoVenda = BancoVenda.getInstance();
    BancoCliente bancoCliente = BancoCliente.getInstance();
    BancoProduto bancoProduto = BancoProduto.getInstance();

    public List<Venda> listarVenda() {
        return bancoVenda.findAllVenda();
    }

    public boolean postarVenda(Venda venda) {
        List<VendaProduto> listaProdutoVendido = venda.getProdutos();
        double valor = 0.0;
        int quantidadeatualizada;
        Produto produtonobanco;

        if(bancoCliente.findOneCliente(venda.getCliente().getId()) == null){
            return false;
        }

        for(VendaProduto p : listaProdutoVendido){
            if(bancoProduto.findOneProduto(p.getProduto().getId())==null){
                return false;
            } else {
                produtonobanco = bancoProduto.findOneProduto(p.getProduto().getId());
                if (produtonobanco.getQuantidade_estoque() < p.getQuantidadeComprada()) {
                    return false;
                }

                valor = valor + (produtonobanco.getPreco() * p.getQuantidadeComprada());
                quantidadeatualizada = produtonobanco.getQuantidade_estoque() - p.getQuantidadeComprada();
                produtonobanco.setQuantidade_estoque(quantidadeatualizada);
                bancoProduto.updateProduto(produtonobanco);
            }
        }
        venda.setValor_final_venda(valor);
        bancoVenda.insertVenda(venda);
        return true;
    }

    public boolean atualizarVenda(Venda venda) {
        List<VendaProduto> listaProdutoVendido = venda.getProdutos();
        double valor = 0.0;
        int quantidadeatualizada;
        Produto produtonobanco;

        for(VendaProduto p : listaProdutoVendido){
            produtonobanco = bancoProduto.findOneProduto(p.getProduto().getId());
            if (produtonobanco.getQuantidade_estoque() < p.getQuantidadeComprada()) {
                return false;
            }

            valor = valor + (produtonobanco.getPreco() * p.getQuantidadeComprada());
            quantidadeatualizada = produtonobanco.getQuantidade_estoque() - p.getQuantidadeComprada();
            produtonobanco.setQuantidade_estoque(quantidadeatualizada);
            bancoProduto.updateProduto(produtonobanco);
        }
        venda.setValor_final_venda(valor);
        return bancoVenda.updateVenda(venda);
    }

    public boolean deletarVenda(int id) {
        return bancoVenda.deleteVenda(id);
    }
}
