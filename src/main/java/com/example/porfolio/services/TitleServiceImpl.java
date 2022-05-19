package com.example.porfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.porfolio.entities.Title;
import com.example.porfolio.repositories.BaseRepository;
import com.example.porfolio.repositories.TitleRepository;

@Service
public class TitleServiceImpl extends BaseServiceImpl<Title, Long>{

	@Autowired
	private TitleRepository titleRepository;
	
	public TitleServiceImpl(BaseRepository<Title, Long> baseRepository) {
		super(baseRepository);
	}
}
