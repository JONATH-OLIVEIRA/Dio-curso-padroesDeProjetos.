package com.example.ConceitoPadroesDeProjeto.facade;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.ConceitoPadroesDeProjeto.model.Usuario;
import com.example.ConceitoPadroesDeProjeto.service.UsuarioService;

@Component
public class UsuarioFacade {

    @Autowired
    private UsuarioService usuarioService;

    public Usuario criarUsuario(Usuario usuario) {
        return usuarioService.salvarUsuario(usuario);
    }

    public Usuario atualizarUsuario(Long id, Usuario usuario) {
        usuario.setId(id);
        return usuarioService.atualizarUsuario(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    public Usuario buscarUsuario(Long id) {
        return usuarioService.buscarUsuario(id);
    }
}
