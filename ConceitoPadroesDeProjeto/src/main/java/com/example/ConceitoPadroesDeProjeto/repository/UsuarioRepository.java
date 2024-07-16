package com.example.ConceitoPadroesDeProjeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ConceitoPadroesDeProjeto.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
