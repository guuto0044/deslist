package com.guuto0044.deslist.dto;

import com.guuto0044.deslist.entities.GameList;
import org.springframework.beans.BeanUtils;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(){

    }

    public GameListDTO(GameList entity) {
//        BeanUtils.copyProperties(entity,this);
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

}
