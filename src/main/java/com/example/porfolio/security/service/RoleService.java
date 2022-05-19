package com.example.porfolio.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.porfolio.security.entity.Role;
import com.example.porfolio.security.enums.RoleName;
import com.example.porfolio.security.repository.RoleRepository;


@Service
@Transactional
public class RoleService {
	
	@Autowired
	private RoleRepository roleRepository;
	
	public Optional<Role> getByRoleName(RoleName roleName) {
		return roleRepository.findByRoleName(roleName);
	}
	
	public void save(Role role){
        roleRepository.save(role);
    }
	
}
