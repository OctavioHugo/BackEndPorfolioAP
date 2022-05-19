package com.example.porfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.porfolio.entities.Owner;
import com.example.porfolio.repositories.BaseRepository;
import com.example.porfolio.repositories.OwnerRepository;

@Service
public class OwnerServiceImpl extends BaseServiceImpl<Owner, Long> implements OwnerService{
	
	@Autowired
	private OwnerRepository profileRepository;
	
	public OwnerServiceImpl (BaseRepository<Owner, Long> baseRepository) {
	super (baseRepository);
	}
/*No entiendo que hace el constructor*/
}
