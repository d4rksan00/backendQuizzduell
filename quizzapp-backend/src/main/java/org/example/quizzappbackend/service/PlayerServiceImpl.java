package org.example.quizzappbackend.service;


import lombok.AllArgsConstructor;
import org.example.quizzappbackend.entity.Player;
import org.example.quizzappbackend.entity.Quiz;
import org.example.quizzappbackend.repository.PlayerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PlayerServiceImpl {

    private final PlayerRepo playerRepo;

    public Player createPlayer(Player player) {
        return playerRepo.save(player);
    }

    public Player updatePlayer(Player player) {
        return playerRepo.save(player);
    }

    public Player getPlayerByCredentials(String email, String password) {
        return playerRepo.findByEmail(email);
    }

    public List<Quiz> getAllOpenGames(String email){ return playerRepo.findAllByEmail(email); };
}
