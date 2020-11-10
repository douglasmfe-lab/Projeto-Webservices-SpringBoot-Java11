package com.douglasmfe.webservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.douglasmfe.webservices.model.Product;
import com.douglasmfe.webservices.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	@GetMapping
	public List<Product> findAll(){
		return repo.findAll();
	}
	

	public Product findById(Long id){
		Optional<Product> obj = repo.findById(id);
		return obj.get();
	}	

}
