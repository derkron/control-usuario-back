package com.evaluacion.evaluacion.habilidades.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Areas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "areaId")
    private Integer id;

    private Integer codeArea;

    @Column(length =50 )
    private String nameArea;



    private int stateArea;


    @OneToMany(mappedBy = "areas")
    private List<Usuarios> usuarios;


}
