package com.andreytech.teste_springboot.services;

import com.andreytech.teste_springboot.entities.User;
import com.andreytech.teste_springboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> object = repository.findById(id);
        return object.get();
    }

    public User insert(User obj) {
        return repository.save(obj);
    }

}
