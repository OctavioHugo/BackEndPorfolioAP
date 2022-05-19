package com.example.porfolio.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.porfolio.entities.Institution;
import com.example.porfolio.services.InstitutionServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/intitutions")
public class InstitutionController extends BaseControllerImpl<Institution, InstitutionServiceImpl>{

}
