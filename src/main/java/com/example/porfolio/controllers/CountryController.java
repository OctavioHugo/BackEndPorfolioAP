package com.example.porfolio.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.porfolio.entities.Country;
import com.example.porfolio.services.CountryServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/countries")
public class CountryController extends BaseControllerImpl<Country, CountryServiceImpl>{

}
