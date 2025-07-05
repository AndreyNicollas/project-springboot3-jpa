package com.andreytech.teste_springboot.repositories;

import com.andreytech.teste_springboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
