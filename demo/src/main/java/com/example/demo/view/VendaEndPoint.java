package com.example.demo.view;


import com.example.demo.controller.VendaController;
import com.example.demo.model.Venda;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendaEndPoint {

    VendaController cv = new VendaController();

    @GetMapping
    public List<Venda> getInformationsVendas() {
        return cv.listarVenda();
    }

    @PostMapping
    public boolean postInformationsVendas(@RequestBody Venda venda) {
        return cv.postarVenda(venda);
    }

    @PutMapping
    public String putInformationsVendas(@RequestBody Venda venda) {
        if (cv.atualizarVenda(venda)) {
            return "Sucesso ao atualizar a venda!";
        } else {
            return "Falha ao atualizar a venda...";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteInformationsVendas(@PathVariable int id) {
        if (cv.deletarVenda(id)) {
            return "Deletado com sucesso!";
        } else {
            return "Falha ao deletar...";
        }
    }
}

