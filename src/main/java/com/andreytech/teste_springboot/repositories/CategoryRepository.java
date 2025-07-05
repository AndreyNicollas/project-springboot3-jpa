package com.andreytech.teste_springboot.repositories;

import com.andreytech.teste_springboot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
