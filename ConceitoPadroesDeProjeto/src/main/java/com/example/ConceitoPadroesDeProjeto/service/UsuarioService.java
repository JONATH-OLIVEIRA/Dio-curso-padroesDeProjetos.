package com.example.ConceitoPadroesDeProjeto.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ConceitoPadroesDeProjeto.model.Usuario;
import com.example.ConceitoPadroesDeProjeto.repository.UsuarioRepository;
import com.example.ConceitoPadroesDeProjeto.service.strategy.SaveStrategy;
import com.example.ConceitoPadroesDeProjeto.service.strategy.UpdateStrategy;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private SaveStrategy saveStrategy;

    @Autowired
    private UpdateStrategy updateStrategy;

    public Usuario salvarUsuario(Usuario usuario) {
        return saveStrategy.save(usuario);
    }

    public Usuario atualizarUsuario(Usuario usuario) {
        return updateStrategy.update(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario buscarUsuario(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }
}
