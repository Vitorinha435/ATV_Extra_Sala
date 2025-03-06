package com.example.demo.controller;

import com.example.demo.database.BancoCliente;
import com.example.demo.model.Cliente;

import java.util.List;

public class ClienteController {
    BancoCliente banco = BancoCliente.getInstance();

    public List<Cliente> listarClientes() {
        return banco.findAllCliente();
    }

    public void postarCliente(Cliente cliente) {
        banco.insertCliente(cliente);
    }

    public boolean atualizarCliente(Cliente cliente) {
        return banco.updateCliente(cliente);
    }

    public boolean deletarCliente(int id) {
        return banco.deleteCliente(id);
    }
}

