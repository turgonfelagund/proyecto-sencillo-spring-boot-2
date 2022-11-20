package com.example.MyCloset.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.example.MyCloset.model.Estado;
import com.example.MyCloset.repository.EstadoRespository;

@Service
public class EstadoService implements EstadoRespository {
    
    @Autowired
    private EstadoRespository estadoRespository;

    @Override
    public List<Estado> findAll() {
        
        return estadoRespository.findAll();
    }

    public List<Estado> findAllByCountryId(int id){
        List<Estado> estados = estadoRespository.findAll();
        List<Estado> estadosResponse = new ArrayList<>(); //si se usa null, falla debido a un null pointer exception 

        for (int i = 0; i < estados.size(); i++) {
            if (estados.get(i).getPais().getId() == id) {
                estadosResponse.add(estados.get(i));
            }
        }

        return estadosResponse;
    }

    @Override
    public List<Estado> findAll(Sort sort) {
        
        return estadoRespository.findAll(sort);
    }

    @Override
    public List<Estado> findAllById(Iterable<Integer> ids) {
        
        return null;
    }

    @Override
    public <S extends Estado> List<S> saveAll(Iterable<S> entities) {
        
        return null;
    }

    @Override
    public void flush() {
        
        
    }

    @Override
    public <S extends Estado> S saveAndFlush(S entity) {
        
        return null;
    }

    @Override
    public <S extends Estado> List<S> saveAllAndFlush(Iterable<S> entities) {
        
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Estado> entities) {
        
        
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> ids) {
        
        
    }

    @Override
    public void deleteAllInBatch() {
        
        
    }

    @Override
    public Estado getOne(Integer id) {
        
        return null;
    }

    @Override
    public Estado getById(Integer id) {
        
        return null;
    }

    @Override
    public Estado getReferenceById(Integer id) {
        
        return null;
    }

    @Override
    public <S extends Estado> List<S> findAll(Example<S> example) {
        
        return null;
    }

    @Override
    public <S extends Estado> List<S> findAll(Example<S> example, Sort sort) {
        
        return null;
    }

    @Override
    public Page<Estado> findAll(Pageable pageable) {
        
        return null;
    }

    @Override
    public <S extends Estado> S save(S entity) {
        
        return null;
    }

    @Override
    public Optional<Estado> findById(Integer id) {
        
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer id) {
        
        return false;
    }

    @Override
    public long count() {
        
        return 0;
    }

    @Override
    public void deleteById(Integer id) {
        
        
    }

    @Override
    public void delete(Estado entity) {
        
        
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> ids) {
        
        
    }

    @Override
    public void deleteAll(Iterable<? extends Estado> entities) {
        
        
    }

    @Override
    public void deleteAll() {
        
        
    }

    @Override
    public <S extends Estado> Optional<S> findOne(Example<S> example) {
        
        return Optional.empty();
    }

    @Override
    public <S extends Estado> Page<S> findAll(Example<S> example, Pageable pageable) {
        
        return null;
    }

    @Override
    public <S extends Estado> long count(Example<S> example) {
        
        return 0;
    }

    @Override
    public <S extends Estado> boolean exists(Example<S> example) {
        
        return false;
    }

    @Override
    public <S extends Estado, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
        
        return null;
    }


}
