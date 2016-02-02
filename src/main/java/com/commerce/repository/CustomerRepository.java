package com.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commerce.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	Customer findByEmail(String email);

}
