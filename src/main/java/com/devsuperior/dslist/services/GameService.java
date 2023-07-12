package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepsitory gameRepsitory;

    public List<GameMinDTO> findAll(){
        List<Game> resultado = gameRepsitory.findAll();
        return resultado.stream().map(x -> new GameMinDTO(x)).toList();
    }




}
