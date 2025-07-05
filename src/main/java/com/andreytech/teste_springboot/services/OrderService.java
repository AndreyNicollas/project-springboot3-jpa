package com.andreytech.teste_springboot.services;

import com.andreytech.teste_springboot.entities.Order;
import com.andreytech.teste_springboot.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> object = repository.findById(id);
        return object.get();
    }
}
