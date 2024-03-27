package com.leonardofuchs.dslist.dto;

import com.leonardofuchs.dslist.entities.GameList;
import org.springframework.beans.BeanUtils;

public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(GameList gameList) {
        BeanUtils.copyProperties(gameList, this);
    }

    public GameListDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
