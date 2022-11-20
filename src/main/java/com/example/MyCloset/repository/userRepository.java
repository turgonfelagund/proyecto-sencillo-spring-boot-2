package com.example.MyCloset.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MyCloset.model.User;

@Repository
public interface userRepository extends JpaRepository<User, Integer>  {
    
}
