package com.example.porfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.porfolio.entities.City;
import com.example.porfolio.repositories.BaseRepository;
import com.example.porfolio.repositories.CityRepository;

@Service
public class CityServiceImpl extends BaseServiceImpl<City, Long> implements CityService{
	
	@Autowired
	private CityRepository cityRepository;
	
	public CityServiceImpl(BaseRepository<City, Long> baseRepository) {
	super(baseRepository);
	}

	@Override
	public List<City> search(Long filtro) throws Exception {
		try {
			List<City> cities = cityRepository.search(filtro);
			return cities;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
