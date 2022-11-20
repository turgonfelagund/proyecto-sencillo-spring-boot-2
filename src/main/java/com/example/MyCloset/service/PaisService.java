package com.example.MyCloset.service;

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

import com.example.MyCloset.model.Pais;
import com.example.MyCloset.repository.PaisRepository;

@Service
public class PaisService implements PaisRepository {
    
    @Autowired
    private PaisRepository paisRepository;

    @Override
    public List<Pais> findAll() {
        
        return paisRepository.findAll();
    }

    @Override
    public List<Pais> findAll(Sort sort) {
        
        return paisRepository.findAll(sort);
    }

    @Override
    public List<Pais> findAllById(Iterable<Integer> ids) {
        
        return null;
    }

    @Override
    public <S extends Pais> List<S> saveAll(Iterable<S> entities) {
        
        return null;
    }

    @Override
    public void flush() {
        
        
    }

    @Override
    public <S extends Pais> S saveAndFlush(S entity) {
        
        return null;
    }

    @Override
    public <S extends Pais> List<S> saveAllAndFlush(Iterable<S> entities) {
        
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Pais> entities) {
        
        
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> ids) {
        
        
    }

    @Override
    public void deleteAllInBatch() {
        
        
    }

    @Override
    public Pais getOne(Integer id) {
        
        return null;
    }

    @Override
    public Pais getById(Integer id) {
        
        return null;
    }

    @Override
    public Pais getReferenceById(Integer id) {
        
        return null;
    }

    @Override
    public <S extends Pais> List<S> findAll(Example<S> example) {
        
        return null;
    }

    @Override
    public <S extends Pais> List<S> findAll(Example<S> example, Sort sort) {
        
        return null;
    }

    @Override
    public Page<Pais> findAll(Pageable pageable) {
        
        return null;
    }

    @Override
    public <S extends Pais> S save(S entity) {
        
        return null;
    }

    @Override
    public Optional<Pais> findById(Integer id) {
        
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
    public void delete(Pais entity) {
        
        
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> ids) {
        
        
    }

    @Override
    public void deleteAll(Iterable<? extends Pais> entities) {
        
        
    }

    @Override
    public void deleteAll() {
        
        
    }

    @Override
    public <S extends Pais> Optional<S> findOne(Example<S> example) {
        
        return Optional.empty();
    }

    @Override
    public <S extends Pais> Page<S> findAll(Example<S> example, Pageable pageable) {
        
        return null;
    }

    @Override
    public <S extends Pais> long count(Example<S> example) {
        
        return 0;
    }

    @Override
    public <S extends Pais> boolean exists(Example<S> example) {
        
        return false;
    }

    @Override
    public <S extends Pais, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
        
        return null;
    }
}
