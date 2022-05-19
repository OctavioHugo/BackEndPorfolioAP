package com.example.porfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.porfolio.entities.Education;

public interface EducationRepository extends BaseRepository<Education, Long>{

	@Query(value = "SELECT * FROM Education WHERE education.fk_owner = :filtro ORDER BY education.id",
			nativeQuery = true
			)
	List<Education> search(@Param("filtro") Long filtro);
}
