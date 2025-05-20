package com.guuto0044.deslist.repositorys;

import com.guuto0044.deslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRespository extends JpaRepository<GameList,Long> {
}
