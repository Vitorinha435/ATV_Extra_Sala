package com.example.demo.controller;

import com.example.demo.database.BancoFuncionario;
import com.example.demo.model.Funcionario;

import java.util.List;

public class FuncionarioController {
    BancoFuncionario banco = BancoFuncionario.getInstance();

    public List<Funcionario> listarFuncionario() {
        return banco.findAllFuncionario();
    }

    public void postarFuncionario(Funcionario funcionario) {
        banco.insertFuncionario(funcionario);
    }

    public boolean atualizarFuncionario(Funcionario funcionario) {
        return banco.updateFuncionario(funcionario);
    }

    public boolean deletarFuncionario(int id) {
        return banco.deleteFuncionario(id);
    }
}
