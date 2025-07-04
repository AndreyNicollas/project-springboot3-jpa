package com.andreytech.teste_springboot.resources;

import com.andreytech.teste_springboot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L , "Andrey Nicollas", "andrey@gmail.com", "99999", "12345");
        return ResponseEntity.ok().body(user);
    }
}
