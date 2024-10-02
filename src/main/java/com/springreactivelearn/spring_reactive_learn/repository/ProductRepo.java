package com.springreactivelearn.spring_reactive_learn.repository;

import com.springreactivelearn.spring_reactive_learn.entity.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepo extends ReactiveCrudRepository<Product, Integer> {
}
