package com.example.porfolio.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.porfolio.security.entity.Role;
import com.example.porfolio.security.enums.RoleName;
import com.example.porfolio.security.service.RoleService;


/**
 * MUY IMPORTANTE: ESTA CLASE SÓLO SE EJECUTARÁ UNA VEZ PARA CREAR LOS ROLES.
 * UNA VEZ CREADOS SE DEBERÁ ELIMINAR O BIEN COMENTAR EL CÓDIGO
 *
 */

@Component
public class CreateRoles implements CommandLineRunner {

    @Autowired
    RoleService roleService;

    @Override
    public void run(String... args) throws Exception {
    	
      // Descomentar para usar sólo la primera vez
      /*  
      Role roleAdmin = new Role(RoleName.ROLE_ADMIN);
      Role roleUser = new Role(RoleName.ROLE_USER);
      roleService.save(roleAdmin);
      roleService.save(roleUser);
      */  
    }
}