package com.example.demo.database;

import com.example.demo.model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class BancoFuncionario {
    private static BancoFuncionario instance;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public static BancoFuncionario getInstance() {
        if (instance == null) {
            instance = new BancoFuncionario();
        }
        return instance;
    }

    public void insertFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public Funcionario findOneFuncionario(int id) {
        for (Funcionario f : funcionarios) {
            if (f.getId() == id) {
                return f;
            }
        }
        return null;
    }

    public List<Funcionario> findAllFuncionario() {
        return new ArrayList<>(funcionarios);
    }

    public boolean updateFuncionario(Funcionario f) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getId() == f.getId()) {
                funcionarios.set(i, f);
                return true;
            }
        }
        return false;
    }

    public boolean deleteFuncionario(int id) {
        return funcionarios.removeIf(f -> f.getId() == id);
    }
}
