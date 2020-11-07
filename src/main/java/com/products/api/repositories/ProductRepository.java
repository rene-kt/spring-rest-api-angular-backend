package com.products.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.api.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	Product findById(long id);
}
