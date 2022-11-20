package com.example.MyCloset.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyCloset.model.Estado;
import com.example.MyCloset.service.EstadoService;

@RestController
@RequestMapping( value = "/estado/")
public class EstadoController {
    
    @Autowired
    private EstadoService estadoService;

    @GetMapping(value = "listar")
    public ResponseEntity<List<Estado>> getAllEstados(){

        return ResponseEntity.ok(estadoService.findAll());
    }

    @GetMapping(value = "{idPais}")
    private ResponseEntity<List<Estado>> getEstadosByPaisId(@PathVariable("idPais") int pais){

        return ResponseEntity.status(HttpStatus.OK).body(estadoService.findAllByCountryId(pais));
    }

}
