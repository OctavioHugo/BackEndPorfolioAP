package com.example.porfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.porfolio.entities.Institution;
import com.example.porfolio.repositories.BaseRepository;
import com.example.porfolio.repositories.InstitutionRepository;

@Service
public class InstitutionServiceImpl extends BaseServiceImpl<Institution, Long> implements InstitutionService{

	@Autowired
	private InstitutionRepository institutionRepository;
	
	public InstitutionServiceImpl(BaseRepository<Institution, Long> baseRepository) {
		super(baseRepository);
	}
}
