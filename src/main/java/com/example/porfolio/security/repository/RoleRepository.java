package com.example.porfolio.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.porfolio.security.entity.Role;
import com.example.porfolio.security.enums.RoleName;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	
	Optional<Role> findByRoleName(RoleName roleName);
}
