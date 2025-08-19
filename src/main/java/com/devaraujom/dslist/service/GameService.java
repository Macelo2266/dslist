package com.devaraujom.dslist.service;

import com.devaraujom.dslist.DTO.GameDTO;
import com.devaraujom.dslist.entities.Game;
import com.devaraujom.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameDTO> dto = result.stream().map(g -> new GameDTO(g)).collect(Collectors.toList());
        return dto;
    }
}
