package com.andreytech.teste_springboot.config;

import com.andreytech.teste_springboot.entities.User;
import com.andreytech.teste_springboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "Andrey Nicollas", "andrey@gmail.com", "11111", "12345");
        User user2 = new User(null, "Carlos Eduardo", "eduardo@gmail.com", "99999", "678910");

        // salvando os dois objetos no banco de dados
        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
