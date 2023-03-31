package com.evaluacion.evaluacion.habilidades.service;


import com.evaluacion.evaluacion.habilidades.entity.Areas;
import com.evaluacion.evaluacion.habilidades.repository.AreasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreasService {

    @Autowired
    AreasRepository areasRepository;

    public Areas crearArea(Areas nArea){
        return areasRepository.save(nArea);
    }
    public List<Areas> listarArea(){
        return areasRepository.findAll();
    }

    public Areas actualizarArea(Areas areas, Integer id){
        Areas are=areasRepository.findById(id).get();
        are.setNameArea(areas.getNameArea());
        are.setCodeArea(areas.getCodeArea());
        are.setStateArea(areas.getStateArea());
        return areasRepository.save(are);
    }

    public void eliminarArea(Integer id){
        areasRepository.deleteById(id);
    }
}
