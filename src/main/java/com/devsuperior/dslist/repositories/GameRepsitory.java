package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepsitory  extends JpaRepository <Game, Long> {


}
