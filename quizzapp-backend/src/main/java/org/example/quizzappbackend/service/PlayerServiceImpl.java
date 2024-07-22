package org.example.quizzappbackend.service;


import lombok.AllArgsConstructor;
import org.example.quizzappbackend.entity.Player;
import org.example.quizzappbackend.repository.PlayerRepo;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PlayerServiceImpl {

    private final PlayerRepo playerRepo;

    public Player createPlayer(Player player) {
        return playerRepo.save(player);
    }

    public Player getPlayer(Long playerId) {
        return playerRepo.findById(playerId).orElse(null);
    }

    public Player updatePlayer(Player player) {
        return playerRepo.save(player);
    }

    public void deletePlayer(Long playerId) {
        playerRepo.deleteById(playerId);
    }
}
