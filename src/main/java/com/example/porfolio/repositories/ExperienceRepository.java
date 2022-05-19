package com.example.porfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.porfolio.entities.Experience;

public interface ExperienceRepository extends BaseRepository<Experience, Long> {
	
	@Query(value = "SELECT * FROM Experience WHERE experience.fk_owner = :filtro ORDER BY experience.id",
			nativeQuery = true
			)
	List<Experience> search(@Param("filtro") Long filtro);

}
