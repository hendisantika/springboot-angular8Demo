package com.hendisantika.springbootangular8demo;

import com.hendisantika.springbootangular8demo.entity.User;
import com.hendisantika.springbootangular8demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class SpringbootAngular8DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAngular8DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            Stream.of("Naruto", "Sasuke", "Sakura", "Kakashi", "Shino").forEach(name -> {
                User user = new User(name, name.toLowerCase() + "@konohagakure.com");
                userRepository.save(user);
            });
            userRepository.findAll().forEach(System.out::println);
        };
    }

}
