package com.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commerce.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByName(String name);

}
