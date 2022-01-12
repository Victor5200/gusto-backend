package com.example.guustobackend.controller;

import com.example.guustobackend.service.GenericService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.Objects.isNull;

public abstract class GenericRestController<T, K> {

    private Logger logger = LoggerFactory.getLogger(GenericRestController.class);

    private GenericService<T, K> service;

    public GenericRestController(GenericService<T, K> service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<T>> findAll() {
        return new ResponseEntity<>(this.service.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<T> findById(@PathVariable("id") K id) {
        T entity = this.service.findById(id);

        if (isNull(entity)) {
            return ResponseEntity.noContent().build();
        }

        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<T> save(@RequestBody T entityRequest) {
        T entity = this.service.save(entityRequest);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<T> delete(@PathVariable("id") K id) {
        this.service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
