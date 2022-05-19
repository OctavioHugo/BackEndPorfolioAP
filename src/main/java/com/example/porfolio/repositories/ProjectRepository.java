package com.example.porfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.porfolio.entities.Project;

public interface ProjectRepository extends BaseRepository<Project, Long> {
	
	@Query(value = "SELECT * FROM Project WHERE project.fk_owner = :filtro ORDER BY project.id",
			nativeQuery = true
			)
	List<Project> search(@Param("filtro") Long filtro);

}
