package com.example.porfolio.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.porfolio.security.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByUserName(String userName);
	
	boolean existsByUserName(String userName);
	
	
	// Agreagado para logear por email  o username
	
	Optional<User> findByEmail(String email);
    
	//

	boolean existsByEmail(String email);
	

}
