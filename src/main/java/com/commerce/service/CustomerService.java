package com.commerce.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.commerce.entity.Customer;
import com.commerce.entity.Role;
import com.commerce.repository.CustomerRepository;
import com.commerce.repository.RoleRepository;

@Service
@Transactional
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private RoleRepository roleRepository;

	public Customer findOne(String email) {
		return customerRepository.findByEmail(email);
	}

	public void save(Customer customer) {
		customer.setEnabled(true);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		customer.setPassword(encoder.encode(customer.getPassword()));

		List<Role> roles = new ArrayList<>();
		roles.add(roleRepository.findByName("ROLE_USER"));
		customer.setRoles(roles);

		customerRepository.save(customer);
	}

}
