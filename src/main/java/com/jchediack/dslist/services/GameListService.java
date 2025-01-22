package com.jchediack.dslist.services;

import com.jchediack.dslist.dto.GameDTO;
import com.jchediack.dslist.dto.GameListDTO;
import com.jchediack.dslist.dto.GameMinDTO;
import com.jchediack.dslist.entities.Game;
import com.jchediack.dslist.entities.GameList;
import com.jchediack.dslist.repositories.GameListRepository;
import com.jchediack.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
