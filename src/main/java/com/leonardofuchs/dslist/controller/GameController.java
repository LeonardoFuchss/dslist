package com.leonardofuchs.dslist.controller;

import com.leonardofuchs.dslist.dto.GameMinDto;
import com.leonardofuchs.dslist.entities.Game;
import com.leonardofuchs.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDto> findAll(){
        return gameService.findAll();
    }
}
