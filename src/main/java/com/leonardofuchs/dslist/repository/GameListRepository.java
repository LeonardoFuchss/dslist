package com.leonardofuchs.dslist.repository;

import com.leonardofuchs.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
