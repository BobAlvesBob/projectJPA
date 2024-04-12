package com.pitaiadev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pitaiadev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
