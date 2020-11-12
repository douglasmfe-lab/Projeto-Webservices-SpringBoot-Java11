package com.douglasmfe.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglasmfe.webservices.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
