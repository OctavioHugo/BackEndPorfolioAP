package com.example.porfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.porfolio.entities.Mode;
import com.example.porfolio.repositories.BaseRepository;
import com.example.porfolio.repositories.ModeRepository;

@Service
public class ModeServieImpl extends BaseServiceImpl<Mode, Long> {
	
	@Autowired
	private ModeRepository modeRepository;
	
	public ModeServieImpl(BaseRepository<Mode, Long> baseRepository) {
		super(baseRepository);
	}

}
