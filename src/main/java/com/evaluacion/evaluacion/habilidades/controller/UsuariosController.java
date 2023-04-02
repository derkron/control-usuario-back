package com.evaluacion.evaluacion.habilidades.controller;

import com.evaluacion.evaluacion.habilidades.entity.Usuarios;
import com.evaluacion.evaluacion.habilidades.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    UsuariosService usuariosService;

    @PostMapping
    public Usuarios crearUsuarios(@RequestBody Usuarios usuarios){
        return usuariosService.crearUsuario(usuarios);
    }

    @PutMapping(path ={"/{id}"})
    public Usuarios actualizarUser(@PathVariable Integer id,@RequestBody Usuarios usuarios){
        usuarios.setId(id);
        return usuariosService.actualizarUsuario(usuarios,id);
    }

    @GetMapping
    public List<Usuarios> listarUser(){
        return usuariosService.listarUsuario();
    }

    @GetMapping(path = {"/{id}"})
    public Usuarios verUser(@PathVariable("id")Integer id){
        return usuariosService.verUsuario(id);
    }
    @DeleteMapping(path = {"/{id}"})
    public void eliminarUsuario(@PathVariable("id") Integer id){
        usuariosService.eliminarUsuario(id);
    }

}
