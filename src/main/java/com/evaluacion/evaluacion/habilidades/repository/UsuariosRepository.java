package com.evaluacion.evaluacion.habilidades.repository;

import com.evaluacion.evaluacion.habilidades.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios,Integer> {
}
