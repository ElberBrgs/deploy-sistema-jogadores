package com.example.aula.service;

import com.example.aula.exception.CamisaJaExistenteException;
import com.example.aula.model.Jogador;
import com.example.aula.repository.JogadorRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class JogadorService {
    private JogadorRepository jogadorRepository;

    public JogadorService(JogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }

    public List <Jogador> listarTodos() {
        return jogadorRepository.findAll();
    }

    public Jogador salvar(@Valid Jogador jogador) {
        if (jogadorRepository.findByNumeroCamisa(jogador.getNumeroCamisa()).isPresent()) {
            throw new CamisaJaExistenteException("Camisa já cadastrada.");
        }

        return jogadorRepository.save(jogador);
    }

}
