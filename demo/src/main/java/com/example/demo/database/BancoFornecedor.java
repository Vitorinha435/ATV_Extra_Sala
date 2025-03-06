package com.example.demo.database;

import com.example.demo.model.Fornecedor;

import java.util.ArrayList;
import java.util.List;

public class BancoFornecedor {
    private static BancoFornecedor instance;
    private List<Fornecedor> fornecedores = new ArrayList<>();

    public static BancoFornecedor getInstance() {
        if (instance == null) {
            instance = new BancoFornecedor();
        }
        return instance;
    }
    public void insertFornecedor(Fornecedor f){
        fornecedores.add(f);
    }

    public Fornecedor findOneFornecedor(int id){
        for (Fornecedor f : fornecedores){
            if (f.getId() == id){
                return f;
            }
        }
        return null;
    }

    public List<Fornecedor> findAllFornecedor() {
        return new ArrayList<>(fornecedores);
    }

    public boolean updateFornecedor(Fornecedor f){
        for(int i = 0; i < fornecedores.size();i++){
            if(fornecedores.get(i).getId() == f.getId()){
                fornecedores.set(i,f);
                return true;
            }
        }
        return false;
    }

    public boolean deleteFornecedor(int id){
        return fornecedores.removeIf(f -> f.getId() == id);
    }
}
