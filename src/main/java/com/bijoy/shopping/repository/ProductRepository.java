package com.bijoy.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bijoy.shopping.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product findByName(String name);

}
