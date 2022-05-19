package com.example.porfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.porfolio.entities.Country;
import com.example.porfolio.repositories.BaseRepository;
import com.example.porfolio.repositories.CountryRepository;

@Service
public class CountryServiceImpl extends BaseServiceImpl<Country, Long> implements CountryService{
	
	@Autowired
	private CountryRepository countryRepository;
	
	public CountryServiceImpl(BaseRepository<Country, Long> baseRepository) {
		super(baseRepository);
	}

}
