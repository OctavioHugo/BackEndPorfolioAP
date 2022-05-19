package com.example.porfolio.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.porfolio.entities.Mode;
import com.example.porfolio.services.ModeServieImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/modes")
public class ModeController extends BaseControllerImpl<Mode, ModeServieImpl>{

}
