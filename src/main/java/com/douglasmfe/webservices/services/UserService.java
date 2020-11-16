package com.douglasmfe.webservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.douglasmfe.webservices.model.User;
import com.douglasmfe.webservices.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	@GetMapping
	public List<User> findAll(){
		return repo.findAll();
	}
	

	public User findById(Long id){
		Optional<User> obj = repo.findById(id);
		return obj.get();
	}	
	
	public User Insert(User obj) {
		return repo.save(obj);
	}
	
	public void delete(Long id){
		repo.deleteById(id);
	}
}
