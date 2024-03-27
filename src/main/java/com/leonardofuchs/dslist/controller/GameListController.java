package com.leonardofuchs.dslist.controller;

import com.leonardofuchs.dslist.dto.GameListDTO;
import com.leonardofuchs.dslist.dto.GameMinDto;
import com.leonardofuchs.dslist.entities.Game;
import com.leonardofuchs.dslist.entities.GameList;
import com.leonardofuchs.dslist.services.GameListService;
import com.leonardofuchs.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
       return gameListService.findAll();
    }
    @GetMapping(value = "/{listId}" )
    public List<GameMinDto> findByList(@PathVariable Long listId){
        return gameService.findByList(listId);
    }
}
