package com.example.porfolio.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.porfolio.entities.Title;
import com.example.porfolio.services.TitleServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/titles")
public class TitleController extends BaseControllerImpl<Title, TitleServiceImpl>{

}
