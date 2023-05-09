package com.devsuperior.dslist.sevices;

import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;


@Service
public class GameService {
    @Autowired
    private GameRepository repository;
    public List<GameMinDto> findAll() {
        List<Game> result = repository.findAll();
        return result.stream().map(GameMinDto::new).toList();
    }
}
