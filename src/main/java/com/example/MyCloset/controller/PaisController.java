package com.example.MyCloset.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyCloset.model.Pais;
import com.example.MyCloset.service.PaisService;

@RestController
@RequestMapping(value = "/pais/")
public class PaisController {
    
    @Autowired
    private PaisService paisService;

    @GetMapping(value = "listar")
    public ResponseEntity<List<Pais>> getAllPaises(){

        return ResponseEntity.status(HttpStatus.OK).body(paisService.findAll());
    }
}
