package com.example.porfolio.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.porfolio.entities.Owner;
import com.example.porfolio.services.OwnerServiceImpl;

@RestController
@CrossOrigin (origins = "*")
@RequestMapping (path = "api/v1/owners")
public class OwnerController extends BaseControllerImpl<Owner, OwnerServiceImpl> {
/*Preguntar Dudas*/
}
