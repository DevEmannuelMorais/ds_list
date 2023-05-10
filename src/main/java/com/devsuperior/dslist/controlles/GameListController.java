package com.devsuperior.dslist.controlles;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.sevices.GameListSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListSevice gameListSevice;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListSevice.findAll();
    }
}
