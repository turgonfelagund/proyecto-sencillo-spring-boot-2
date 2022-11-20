package com.example.MyCloset.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MyCloset.model.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Integer> {
    
}
