package com.andreytech.teste_springboot.services;

import com.andreytech.teste_springboot.entities.Category;
import com.andreytech.teste_springboot.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> object = repository.findById(id);
        return object.get();
    }
}
