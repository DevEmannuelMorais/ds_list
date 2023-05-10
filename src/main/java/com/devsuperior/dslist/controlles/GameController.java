package com.devsuperior.dslist.controlles;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repository.GameRepository;
import com.devsuperior.dslist.sevices.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService service;
    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {
        return service.findbyId(id);
    }
    @GetMapping
    public List<GameMinDto> findAll() {
        return service.findAll();
    }
}
