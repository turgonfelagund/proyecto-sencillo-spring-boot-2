package com.example.MyCloset.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MyCloset.model.User;
import com.example.MyCloset.repository.userRepository;

@Service
public class UserService {
 
    @Autowired
    private userRepository userRepository;

    public User create(User theUser){
        return userRepository.save(theUser);
    }

    public List<User> listUsers(){
        return (List<User>)userRepository.findAll();
    }

    public Optional<User> getById(int id){ //Con opcional se pueden evitar errores de null pointer exception en caso de que no se encuentren usuarios
        return userRepository.findById(id);
    }

    public boolean deleteUserById(int id){
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
