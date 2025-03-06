package com.example.demo.database;

import com.example.demo.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class BancoCliente {
    private static BancoCliente instance;
    private List<Cliente> clientes = new ArrayList<>();

    public static BancoCliente getInstance() {
        if (instance == null) {
            instance = new BancoCliente();
        }
        return instance;
    }
    public void insertCliente(Cliente c){
        clientes.add(c);
    }

    public Cliente findOneCliente(int id){
        for (Cliente c : clientes){
            if (c.getId() == id){
                return c;
            }
        }
        return null;
    }

    public List<Cliente> findAllCliente() {
        return new ArrayList<>(clientes);
    }

    public boolean updateCliente(Cliente c){
        for(int i = 0; i < clientes.size();i++){
            if(clientes.get(i).getId() == c.getId()){
                clientes.set(i,c);
                return true;
            }
        }
        return false;
    }

    public boolean deleteCliente(int id){
        return clientes.removeIf(c -> c.getId() == id);
    }
}

