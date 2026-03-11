package com.alurachallenge.forohub.controller;

import com.alurachallenge.forohub.domain.topico.Topico;
import com.alurachallenge.forohub.service.TopicoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    private final TopicoService service;

    public TopicoController(TopicoService service) {
        this.service = service;
    }

    @PostMapping
    public Topico crear(@RequestBody Topico topico) {
        return service.crear(topico);
    }

    @GetMapping
    public List<Topico> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Topico obtener(@PathVariable Long id) {
        return service.obtener(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}