package com.evaluacion.evaluacion.habilidades.service;

import com.evaluacion.evaluacion.habilidades.entity.Usuarios;
import com.evaluacion.evaluacion.habilidades.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosService {

    @Autowired
    UsuariosRepository usuariosRepository;

    public Usuarios crearUsuario (Usuarios nuevoUsuario){
        return usuariosRepository.save(nuevoUsuario);
    }

    public List<Usuarios> listarUsuario(){
        return usuariosRepository.findAll();
    }
    public Usuarios actualizarUsuario(Usuarios usuarios, Integer id){
        Usuarios user=usuariosRepository.findById(id).get();
        user.setName(usuarios.getName());
        user.setLastName(usuarios.getLastName());
        user.setBirthdate(usuarios.getBirthdate());
        user.setEmail(usuarios.getEmail());
        user.setDocumentNumber(usuarios.getDocumentNumber());
        user.setSalary(usuarios.getSalary());
        user.setPosition(usuarios.getPosition());
        user.setState(usuarios.getState());
        return usuariosRepository.save(user);


    }
    public void eliminarUsuario(Integer id){
        usuariosRepository.deleteById(id);
    }

    public Usuarios verUsuario(Integer id){
        return usuariosRepository.findById(id).get();
    }


}
