package com.douglasmfe.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglasmfe.webservices.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
