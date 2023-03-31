package com.evaluacion.evaluacion.habilidades.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuarios {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuarioId")
    private Integer id;

    @Column(length =50 )
    private String name;

    @Column(length =50 )
    private String lastName;

    private Date birthdate;

    @Column(length =50 )
    private String email;

    @Column(length =10 )
    private Integer documentNumber;

    @Column(length =10 )
    private Float salary;

    @Column(length =50 )
    private String position;

    @Column(name = "stateUsuario")
    private  int state;

    @ManyToOne
    @JoinColumn(name = "areaId")
    private Areas areas;





}
