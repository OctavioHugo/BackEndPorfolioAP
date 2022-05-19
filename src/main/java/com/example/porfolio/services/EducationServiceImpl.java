package com.example.porfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.porfolio.entities.City;
import com.example.porfolio.entities.Education;
import com.example.porfolio.repositories.BaseRepository;
import com.example.porfolio.repositories.EducationRepository;

@Service
public class EducationServiceImpl extends BaseServiceImpl<Education, Long> implements EducationService{
	
	@Autowired
	private EducationRepository educationRepository;
	
	public EducationServiceImpl(BaseRepository<Education, Long> baseRepository) {
		super(baseRepository);
	}
	
	@Override
	public List<Education> search(Long filtro) throws Exception {
		try {
			List<Education> educations = educationRepository.search(filtro);
			return educations;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
