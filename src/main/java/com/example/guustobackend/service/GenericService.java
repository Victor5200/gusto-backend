package com.example.guustobackend.service;

import java.util.List;

public interface GenericService<T, Key> {

    List<T> findAll();
    T findById(Key id);
    T save(T entity);
    void delete(Key id);

}
