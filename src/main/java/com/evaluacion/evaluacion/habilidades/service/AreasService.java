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

    public Areas crearArea(Areas area){
        area.setStateArea("activo");
        return areasRepository.save(area);
    }


    public List<Areas> traerAreas() {
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

    public Areas verArea(Integer id){
        return areasRepository.findById(id).get();
    }
}
