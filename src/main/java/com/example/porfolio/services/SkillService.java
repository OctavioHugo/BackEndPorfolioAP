package com.example.porfolio.services;

import java.util.List;

import com.example.porfolio.entities.Skill;

public interface SkillService extends BaseService<Skill, Long>{
	List<Skill> search(Long filtro) throws Exception;
}
