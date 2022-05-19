package com.example.porfolio.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.porfolio.entities.Position;
import com.example.porfolio.services.PositionServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/positions")
public class PositionController extends BaseControllerImpl<Position, PositionServiceImpl>{
/*Por que consume la implementacion del servicio*/
}
