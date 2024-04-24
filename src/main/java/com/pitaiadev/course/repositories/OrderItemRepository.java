package com.pitaiadev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pitaiadev.course.entities.OrderItem;
import com.pitaiadev.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	

}
