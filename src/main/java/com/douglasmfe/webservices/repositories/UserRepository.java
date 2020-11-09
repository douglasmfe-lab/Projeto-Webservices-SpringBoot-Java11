package com.douglasmfe.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglasmfe.webservices.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
