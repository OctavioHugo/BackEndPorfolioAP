package com.example.porfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.porfolio.entities.Skill;

public interface SkillRepository extends BaseRepository<Skill, Long> {
	
	@Query(value = "SELECT * FROM Skill WHERE skill.fk_owner = :filtro ORDER BY skill.id",
			nativeQuery = true
			)
	List<Skill> search(@Param("filtro") Long filtro);

}
