package com.example.demo.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

public abstract class BaseRestController<T, Long> {
    private CrudRepository<T, Long> repo;

    public BaseRestController(CrudRepository<T, Long> repo) {
        this.repo = repo;
    }

    @GetMapping
    public Iterable<T> getAll() {
        return this.repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<T> findById(@PathVariable(value = "id") Long id) {
        return this.repo.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Iterable<T> items) {
        this.repo.saveAll(items);
    }
}
