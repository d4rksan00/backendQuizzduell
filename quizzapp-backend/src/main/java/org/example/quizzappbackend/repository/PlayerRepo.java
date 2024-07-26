package org.example.quizzappbackend.repository;

import org.example.quizzappbackend.entity.Player;
import org.example.quizzappbackend.entity.Quiz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepo extends CrudRepository<Player, String> {

    Player findPlayerByEmail(String email);
    //List<Quiz> findByOpenQuizzesByEmail(String email);
}
