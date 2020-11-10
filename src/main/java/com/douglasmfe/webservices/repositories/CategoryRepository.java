package com.douglasmfe.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglasmfe.webservices.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
