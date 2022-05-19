package com.example.porfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.porfolio.entities.Experience;
import com.example.porfolio.entities.State;

public interface StateRepository extends BaseRepository<State, Long>{

	@Query(value = "SELECT * FROM State WHERE state.fk_country = :filtro ORDER BY state.name",
			nativeQuery = true
			)
	List<State> search(@Param("filtro") Long filtro);
}
