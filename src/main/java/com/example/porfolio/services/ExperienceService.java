package com.example.porfolio.services;

import java.util.List;

import com.example.porfolio.entities.Experience;

public interface ExperienceService extends BaseService<Experience, Long> {

	List<Experience> search(Long filtro) throws Exception;
}
