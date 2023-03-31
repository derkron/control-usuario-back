package com.evaluacion.evaluacion.habilidades.controller;

import com.evaluacion.evaluacion.habilidades.entity.Areas;
import com.evaluacion.evaluacion.habilidades.service.AreasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/areas")
public class AreasController {

    @Autowired
    AreasService areasService;

    @PostMapping
    public Areas crearArea(@RequestBody Areas areas){
        return areasService.crearArea(areas);
    }

    @PutMapping(path = {"/{id}"})
    public Areas actualizarArea(@PathVariable Integer id, @RequestBody Areas areas){
        areas.setId(id);
        return areasService.actualizarArea(areas,id);

    }

    @GetMapping
    public List<Areas> listarArea(){
        return areasService.listarArea();
    }

    @DeleteMapping
    public void eliminarArea(@PathVariable("id")Integer id){
        areasService.eliminarArea(id);
    }


}
