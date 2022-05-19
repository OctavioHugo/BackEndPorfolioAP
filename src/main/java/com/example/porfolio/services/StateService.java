package com.example.porfolio.services;

import java.util.List;

import com.example.porfolio.entities.State;

public interface StateService extends BaseService<State, Long>{

	List<State> search(Long filtro) throws Exception;
}
