package com.example.MyCloset.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MyCloset.model.Estado;

@Repository
public interface EstadoRespository extends JpaRepository<Estado, Integer> {
    
}
