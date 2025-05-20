package com.guuto0044.deslist.service;

import com.guuto0044.deslist.dto.GameDTO;
import com.guuto0044.deslist.dto.GameMinDTO;
import com.guuto0044.deslist.entities.Game;
import com.guuto0044.deslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    @Transactional(readOnly = true)
    public List<GameMinDTO>findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findbyId(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);

    }




}
