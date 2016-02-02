package com.commerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	List<Product> findByCategoryId(Integer id);
}
