package com.example.porfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.porfolio.entities.Project;
import com.example.porfolio.entities.State;
import com.example.porfolio.repositories.BaseRepository;
import com.example.porfolio.repositories.StateRepository;

@Service
public class StateServiceImpl extends BaseServiceImpl<State, Long> implements StateService{
	
	@Autowired
	public StateRepository stateRepository;
	
	public StateServiceImpl(BaseRepository<State, Long> baseRepository) {
		super(baseRepository);
	}
	
	@Override
	public List<State> search(Long filtro) throws Exception {
		try {
			List<State> states = stateRepository.search(filtro);
			return states;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
