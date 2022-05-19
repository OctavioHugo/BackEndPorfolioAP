package com.example.porfolio.services;

import java.util.List;

import com.example.porfolio.entities.City;

public interface CityService extends BaseService<City, Long> {
	
	List<City> search(Long filtro) throws Exception;
}
