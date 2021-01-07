package com.altino.dsdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altino.dsdelivery.entities.Order;

public interface OrderRepository extends JpaRepository <Order, Long>{
	
}
