package com.andreytech.teste_springboot.repositories;

import com.andreytech.teste_springboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
