package com.example.porfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.porfolio.entities.Position;
import com.example.porfolio.repositories.BaseRepository;
import com.example.porfolio.repositories.PositionRepository;

@Service
public class PositionServiceImpl extends BaseServiceImpl<Position, Long>{

	@Autowired
	private PositionRepository positionRepository;
	
	public PositionServiceImpl(BaseRepository<Position, Long> baseRepository) {
	super(baseRepository);
	}
}
