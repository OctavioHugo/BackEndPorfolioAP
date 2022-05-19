package com.example.porfolio.services;

import java.util.List;

import com.example.porfolio.entities.Project;

public interface ProjectService extends BaseService<Project, Long>{
	
	List<Project> search(Long filtro) throws Exception;
}
