package com.example.porfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.porfolio.entities.City;
import com.example.porfolio.entities.Experience;
import com.example.porfolio.repositories.BaseRepository;
import com.example.porfolio.repositories.ExperienceRepository;

@Service
public class ExperienceServiceImpl extends BaseServiceImpl<Experience, Long> implements ExperienceService{

	@Autowired
	private ExperienceRepository experienceRepository;
	
	public ExperienceServiceImpl(BaseRepository<Experience, Long> baseRepository) {
		super(baseRepository);
	}
	
	@Override
	public List<Experience> search(Long filtro) throws Exception {
		try {
			List<Experience> experiences = experienceRepository.search(filtro);
			return experiences;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
