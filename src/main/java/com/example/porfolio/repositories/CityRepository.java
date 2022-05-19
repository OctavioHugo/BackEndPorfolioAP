package com.example.porfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.porfolio.entities.City;

public interface CityRepository extends BaseRepository<City, Long>{

	@Query(value = "SELECT * FROM City WHERE city.fk_state = :filtro ORDER BY city.name",
			nativeQuery = true
			)
	List<City> search(@Param("filtro") Long filtro);
}
