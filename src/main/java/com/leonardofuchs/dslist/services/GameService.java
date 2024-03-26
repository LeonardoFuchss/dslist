package com.leonardofuchs.dslist.services;

import com.leonardofuchs.dslist.dto.GameMinDto;
import com.leonardofuchs.dslist.entities.Game;
import com.leonardofuchs.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
public List<GameMinDto> findAll() {
    List<Game> result = gameRepository.findAll(); // Retorna todos os dados buscados pelo repository no banco de dados da entidade definida.
    return result.stream().map(x -> new GameMinDto(x)).toList(); // Transformando a variável result em um DTO (GameMinDto, apenas os dados necessários!)
}
}
