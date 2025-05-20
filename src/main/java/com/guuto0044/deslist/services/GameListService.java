package com.guuto0044.deslist.services;


import com.guuto0044.deslist.dto.GameListDTO;


import com.guuto0044.deslist.entities.GameList;
import com.guuto0044.deslist.repositorys.GameListRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GameListService {

    @Autowired
    private GameListRespository gameListRespository;

    @Transactional(readOnly = true)
    public List<GameListDTO>findAll(){
       List<GameList> result = gameListRespository.findAll();
        return result.stream().map(GameListDTO::new).toList();
   }

}
