package com.douglasmfe.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglasmfe.webservices.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
