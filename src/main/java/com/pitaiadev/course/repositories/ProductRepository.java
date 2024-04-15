package com.pitaiadev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pitaiadev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
