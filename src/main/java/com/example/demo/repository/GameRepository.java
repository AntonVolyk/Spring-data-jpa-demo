package com.example.demo.repository;

import com.example.demo.model.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends CrudRepository<Game, Long> {
    Game findByName(String name);

    List<Game> findByGenreLike(String genre);

    List<Game> findByCompanyId(Long id);
}
