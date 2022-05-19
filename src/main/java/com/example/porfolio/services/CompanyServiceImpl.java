package com.example.porfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.porfolio.entities.Company;
import com.example.porfolio.repositories.BaseRepository;
import com.example.porfolio.repositories.CompanyRepository;

@Service
public class CompanyServiceImpl extends BaseServiceImpl<Company, Long> implements CompanyService{
	
	@Autowired
	private CompanyRepository companyRepository;
	
	public CompanyServiceImpl(BaseRepository<Company, Long> baseRepository) {
		super(baseRepository);
	}

}
