package com.andreytech.teste_springboot.config;

import com.andreytech.teste_springboot.entities.Category;
import com.andreytech.teste_springboot.entities.Order;
import com.andreytech.teste_springboot.entities.Product;
import com.andreytech.teste_springboot.entities.User;
import com.andreytech.teste_springboot.entities.enums.OrderStatus;
import com.andreytech.teste_springboot.repositories.CategoryRepository;
import com.andreytech.teste_springboot.repositories.OrderRepository;
import com.andreytech.teste_springboot.repositories.ProductRepository;
import com.andreytech.teste_springboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        Category category1 = new Category(null, "Electronics");
        Category category2 = new Category(null, "Books");
        Category category3 = new Category(null, "Computers");

        // Salvando objetos no banco de dados
        categoryRepository.saveAll(Arrays.asList(category1, category2, category3));

        Product product1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product product2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product product3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product product4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product product5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        // Salvando objetos no banco de dados
        productRepository.saveAll(Arrays.asList(product1, product2, product3, product4, product5));

        // adicionando o produto1 dentro da categoria2 - associacao entre os objetos
        product1.getCategories().add(category2);
        product2.getCategories().add(category1);
        product2.getCategories().add(category3);
        product3.getCategories().add(category3);
        product4.getCategories().add(category3);
        product5.getCategories().add(category2);

        // Salvando os obj product com suas associacoes dentro de categoria
        productRepository.saveAll(Arrays.asList(product1, product2, product3,product4, product5));

        User user1 = new User(null, "Andrey Nicollas", "andrey@gmail.com", "11111", "12345");
        User user2 = new User(null, "Carlos Eduardo", "eduardo@gmail.com", "99999", "678910");

        // Salvando objetos no banco de dados
        userRepository.saveAll(Arrays.asList(user1, user2));

        Order order1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, user1);
        Order order2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, user2);
        Order order3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, user1);

        // Salvando objetos no banco de dados
        orderRepository.saveAll(Arrays.asList(order1, order2, order3));
    }
}
