package com.douglasmfe.webservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.douglasmfe.webservices.model.Category;
import com.douglasmfe.webservices.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repo;
	
	@GetMapping
	public List<Category> findAll(){
		return repo.findAll();
	}
	

	public Category findById(Long id){
		Optional<Category> obj = repo.findById(id);
		return obj.get();
	}	

}
