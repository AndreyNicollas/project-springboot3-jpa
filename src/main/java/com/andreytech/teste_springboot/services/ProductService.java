package com.andreytech.teste_springboot.services;

import com.andreytech.teste_springboot.entities.Product;
import com.andreytech.teste_springboot.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> object = repository.findById(id);
        return object.get();
    }
}
