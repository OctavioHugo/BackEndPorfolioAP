package com.example.porfolio.services;

import java.util.List;

import com.example.porfolio.entities.Education;

public interface EducationService extends BaseService<Education, Long> {
	
	List<Education> search(Long filtro) throws Exception;
}
