package com.leonardofuchs.dslist.services;

import com.leonardofuchs.dslist.dto.GameListDTO;
import com.leonardofuchs.dslist.entities.GameList;
import com.leonardofuchs.dslist.repository.GameListRepository;
import com.leonardofuchs.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
