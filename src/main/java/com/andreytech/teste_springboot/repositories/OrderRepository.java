package com.andreytech.teste_springboot.repositories;

import com.andreytech.teste_springboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
