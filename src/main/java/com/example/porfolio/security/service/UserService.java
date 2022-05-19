package com.example.porfolio.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.porfolio.security.entity.User;
import com.example.porfolio.security.repository.UserRepository;


@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Optional<User> getByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}
	
	public boolean existsByUserName(String userName) {
		return userRepository.existsByUserName(userName);
	}
	
	
	// Agreagado para logear por email  o username
	
	public Optional<User> getByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	//
	
	
	public boolean existsByEmail(String email)  {
		return userRepository.existsByEmail(email);
	}
	
	public void save(User user) {
		userRepository.save(user);
	}

}

