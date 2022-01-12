package com.example.guustobackend.service.impl;

import com.example.guustobackend.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public abstract class GenericServiceImpl<T, K> implements GenericService<T, K> {

    @Autowired
    private CrudRepository<T, K> repository;

    @Override
    public List<T> findAll() {
        return (List<T>) repository.findAll();
    }

    @Override
    public T findById(K id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(K id) {
        repository.deleteById(id);
    }
}
