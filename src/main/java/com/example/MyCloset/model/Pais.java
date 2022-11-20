package com.example.MyCloset.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table( name = "pais")
public class Pais {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;

    public Pais(String nombre) {
        super();
        this.nombre = nombre;
    }


}
