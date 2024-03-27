package com.leonardofuchs.dslist.controller;

import com.leonardofuchs.dslist.dto.GameDto;
import com.leonardofuchs.dslist.dto.GameMinDto;
import com.leonardofuchs.dslist.entities.Game;
import com.leonardofuchs.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(value = "/{id}")
    public GameDto findById(@PathVariable Long id){ // O corpo da requisição receberá um id!
        return gameService.findById(id); // Chama o método findById do gameService passando o id da requisição por parâmetro!
    }
}
