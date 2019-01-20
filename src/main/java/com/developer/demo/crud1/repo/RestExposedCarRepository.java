package com.developer.demo.crud1.repo;

import com.developer.demo.crud1.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public interface RestExposedCarRepository extends JpaRepository<Car, Long> {

}
