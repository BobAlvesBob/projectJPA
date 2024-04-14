package com.pitaiadev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pitaiadev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
