package com.andreytech.teste_springboot.resources;

import com.andreytech.teste_springboot.entities.Category;
import com.andreytech.teste_springboot.entities.User;
import com.andreytech.teste_springboot.services.CategoryService;
import com.andreytech.teste_springboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    // endpoint para buscar por todas as categorias
    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    // endpoint para buscar um usuario por id
    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category object = service.findById(id);
        return ResponseEntity.ok().body(object);
    }
}
