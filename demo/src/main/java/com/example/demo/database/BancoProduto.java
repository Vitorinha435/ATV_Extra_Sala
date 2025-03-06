package com.example.demo.database;

import com.example.demo.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class BancoProduto {
    private static BancoProduto instance;
    private List<Produto> produtos = new ArrayList<>();

    public static BancoProduto getInstance() {
        if (instance == null) {
            instance = new BancoProduto();
        }
        return instance;
    }

    public void insertProduto(Produto p) {
        produtos.add(p);
    }

    public Produto findOneProduto(int id) {
        for (Produto p : produtos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public List<Produto> findAllProduto() {
        return new ArrayList<>(produtos);
    }

    public boolean updateProduto(Produto p) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == p.getId()) {
                produtos.set(i, p);
                return true;
            }
        }
        return false;
    }

    public boolean deleteProduto(int id) {
        return produtos.removeIf(p -> p.getId() == id);
    }

}

