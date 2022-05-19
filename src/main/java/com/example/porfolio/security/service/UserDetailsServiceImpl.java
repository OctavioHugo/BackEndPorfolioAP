package com.example.porfolio.security.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.porfolio.security.entity.User;
import com.example.porfolio.security.entity.UserMain;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

    	User user;
    	
    	// Modificado para logear por email  o username
    	
    	/* Before
    	User user = userService.getByUserName(userName).get();
    	*/
    	
    	// After
    	Optional<User> userEmail = userService.getByEmail(userName);
    	
    	if  (userEmail.isPresent()) {
    		user = userEmail.get();
    	}  else {
    		user = userService.getByUserName(userName).get();
    	}
  
  
    	//

 
        return UserMain.build(user);
    }
}
