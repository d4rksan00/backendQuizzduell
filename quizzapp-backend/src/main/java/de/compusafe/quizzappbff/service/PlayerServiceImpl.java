package de.compusafe.quizzappbff.service;


import de.compusafe.quizzappbff.entity.Player;
import lombok.AllArgsConstructor;
import de.compusafe.quizzappbff.repository.PlayerRepo;
import org.springframework.stereotype.Service;

@Service
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
