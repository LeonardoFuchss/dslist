package com.leonardofuchs.dslist.dto;

import com.leonardofuchs.dslist.entities.Game;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameMinDto {
    private Long id;
    private String title;
    private String genre;
    private String platforms;
    private String shortDescription;

    public GameMinDto() {
    }

    public GameMinDto(Game entity) { // O QUE ESTAMOS FAZENDO: Pegando os dados da ENTIDADE e salvando no DTO.
        id = entity.getId();
        title = entity.getTitle();
        genre = entity.getGenre();
        platforms = entity.getPlatforms();
        shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public String getPlatforms() {
        return platforms;
    }
    public String getShortDescription() {
        return shortDescription;
    }
}
