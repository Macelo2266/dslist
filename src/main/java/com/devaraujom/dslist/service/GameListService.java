package com.devaraujom.dslist.service;


import com.devaraujom.dslist.DTO.GameListDTO;
import com.devaraujom.dslist.DTO.GameMinDTO;
import com.devaraujom.dslist.entities.Game;
import com.devaraujom.dslist.entities.GameList;
import com.devaraujom.dslist.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;



    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(g -> new GameListDTO(g)).collect(Collectors.toList()).reversed();
    }
}
