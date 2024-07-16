package com.example.ConceitoPadroesDeProjeto.service.strategy;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.ConceitoPadroesDeProjeto.model.Usuario;
import com.example.ConceitoPadroesDeProjeto.repository.UsuarioRepository;

@Component
public class SaveStrategy {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
