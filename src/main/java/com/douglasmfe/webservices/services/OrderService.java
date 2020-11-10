package com.douglasmfe.webservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.douglasmfe.webservices.model.Order;
import com.douglasmfe.webservices.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repo;
	
	@GetMapping
	public List<Order> findAll(){
		return repo.findAll();
	}
	

	public Order findById(Long id){
		Optional<Order> obj = repo.findById(id);
		return obj.get();
	}	

}
