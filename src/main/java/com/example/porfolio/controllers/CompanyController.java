package com.example.porfolio.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.porfolio.entities.Company;
import com.example.porfolio.services.CompanyServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/companies")
public class CompanyController extends BaseControllerImpl<Company, CompanyServiceImpl>{

}
