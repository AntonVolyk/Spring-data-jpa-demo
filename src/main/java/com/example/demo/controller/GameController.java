package com.example.demo.controller;

import com.example.demo.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
public class GameController extends BaseRestController {
    @Autowired
    public GameController(GameRepository repo){
        super(repo);
    }
}
