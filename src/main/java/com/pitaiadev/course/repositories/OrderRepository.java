package com.pitaiadev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pitaiadev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
