package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.User;

public interface IUserDAO extends JpaRepository<User, Integer> {
	List<User> findAll();
	User findById (int userId);
	User findByEmail (String email);
	User findByScreenName(String name);
	
	
}
