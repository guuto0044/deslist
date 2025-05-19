package com.guuto0044.deslist.services;

import com.guuto0044.deslist.dto.GameMinDTO;
import com.guuto0044.deslist.entities.Game;
import com.guuto0044.deslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    public List<GameMinDTO>findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

}
