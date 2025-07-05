package com.andreytech.teste_springboot.resources;

import com.andreytech.teste_springboot.entities.Product;
import com.andreytech.teste_springboot.entities.User;
import com.andreytech.teste_springboot.services.ProductService;
import com.andreytech.teste_springboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    // endpoint para buscar um usuario por id
    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product object = service.findById(id);
        return ResponseEntity.ok().body(object);
    }
}
