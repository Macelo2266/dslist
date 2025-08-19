package com.devaraujom.dslist.repository;

import com.devaraujom.dslist.entities.Game;
import com.devaraujom.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
