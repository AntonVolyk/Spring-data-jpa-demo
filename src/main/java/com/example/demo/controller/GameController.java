package com.example.demo.controller;

import com.example.demo.model.Game;
import com.example.demo.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping("/games")
    public String getAllGames() {
        Iterable<Game> games = gameRepository.findAll();
        String html = "";
        for (Game game: games) {
            html += game + "<br>";
        }

        return html;
    }

    @GetMapping("/games/{id}")
    public List<Game> getGamesByCompanyId(@PathVariable(value = "id") Long id) {
        return gameRepository.findByCompanyId(id);
    }

    @PostMapping("/games/save")
    public Iterable<Game> createGames(@Valid @RequestBody Iterable<Game> games) {
        return gameRepository.saveAll(games);
    }
}
