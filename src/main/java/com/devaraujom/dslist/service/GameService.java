package com.devaraujom.dslist.service;

import com.devaraujom.dslist.DTO.GameDTO;
import com.devaraujom.dslist.DTO.GameMinDTO;
import com.devaraujom.dslist.entities.Game;
import com.devaraujom.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
    Game result = gameRepository.findById(id).get();
    GameDTO dto = new GameDTO(result);
    return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(g -> new GameMinDTO(g)).collect(Collectors.toList());
        return dto;
    }
}
