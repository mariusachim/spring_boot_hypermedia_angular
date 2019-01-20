package com.developer.demo.crud1;

import com.developer.demo.crud1.model.Car;
import com.developer.demo.crud1.repo.RestExposedCarRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class Crud1Application {

    public static void main(String[] args) {
        SpringApplication.run(Crud1Application.class, args);
    }

    @Bean
    ApplicationRunner init(RestExposedCarRepository repo) {
        return args -> {
            Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti",
                    "AMC Gremlin", "Triumph Stag", "Ford Pinto", "Yugo GV").forEach(name -> {
                Car c = new Car();
                c.setName(name);
                repo.save(c);
            });
            repo.findAll().forEach(System.out::println);
        };
    }

}

