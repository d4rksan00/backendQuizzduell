package org.example.quizzappbackend.service;


import lombok.AllArgsConstructor;
import org.example.quizzappbackend.entity.Player;
import org.example.quizzappbackend.repository.PlayerRepo;

@AllArgsConstructor
public class PlayerServiceImpl {

    private final PlayerRepo playerRepo;

    public void createPlayer(Player player) {
        playerRepo.save(player);
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
