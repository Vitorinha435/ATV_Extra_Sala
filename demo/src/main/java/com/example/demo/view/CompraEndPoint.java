package com.example.demo.view;

import com.example.demo.controller.CompraController;
import com.example.demo.model.Compra;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compras")
public class CompraEndPoint {
    CompraController cc = new CompraController();

    @GetMapping
    public List<Compra> getInformationsCompras() {
        return cc.listarCompra();
    }

    @PostMapping
    public boolean postInformationsCompras(@RequestBody Compra compra) {
        return cc.postarCompra(compra);
    }

    @PutMapping
    public String putInformationsCompras(@RequestBody Compra compra) {
        if (cc.atualizarCompra(compra)) {
            return "Sucesso ao atualizar o cliente!";
        } else {
            return "Falha ao atualizar o cliente...";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteInformationsCompras(@PathVariable int id) {
        if (cc.deletarCompra(id)) {
            return "Deletado com sucesso";
        } else {
            return "Falha ao deletar...";
        }
    }
}
