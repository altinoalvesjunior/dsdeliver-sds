package com.altino.dsdelivery.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altino.dsdelivery.entities.Product;

public interface ProductRepository extends JpaRepository <Product, Long>{
	
	List<Product> findAllByOrderByNameAsc();
}
