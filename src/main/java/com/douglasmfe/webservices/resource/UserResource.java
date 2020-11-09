package com.douglasmfe.webservices.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.douglasmfe.webservices.model.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "John Carpenter", "john@hotmail.com", "55599999999", "1234");
		return ResponseEntity.ok().body(u);
	}
	
}
