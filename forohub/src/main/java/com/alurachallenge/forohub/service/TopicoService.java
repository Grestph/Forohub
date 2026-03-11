package com.alurachallenge.forohub.service;

import com.alurachallenge.forohub.domain.topico.Topico;
import com.alurachallenge.forohub.repository.TopicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoService {

    private final TopicoRepository repository;

    public TopicoService(TopicoRepository repository) {
        this.repository = repository;
    }

    public Topico crear(Topico topico) {
        return repository.save(topico);
    }

    public List<Topico> listar() {
        return repository.findAll();
    }

    public Topico obtener(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}