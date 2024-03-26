package com.leonardofuchs.dslist.repository;

import com.leonardofuchs.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
