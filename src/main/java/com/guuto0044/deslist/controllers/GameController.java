package com.guuto0044.deslist.controllers;

import com.guuto0044.deslist.dto.GameMinDTO;

import com.guuto0044.deslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/all")
    public List<GameMinDTO>findAll(){
        return gameService.findAll();
    }
}
