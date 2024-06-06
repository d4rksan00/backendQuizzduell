package org.example.quizzappbackend.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.quizzappbackend.entity.Player;
import org.example.quizzappbackend.repository.PlayerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService{

    private final PlayerRepo playerRepo;

    @Override
    public Player createPlayer(Player player) {
        return this.playerRepo.save(player);
    }

    @Override
    public Player updatePlayer(Player player) {
        return this.playerRepo.save(player);
    }

    @Override
    public Player getPlayer(Long id) {
        return this.playerRepo.findById(id).orElse(null);
    }

    @Override
    public void deletePlayer(Long id) {
        this.playerRepo.deleteById(id);
    }

    @Override
    public List<Player> getAllPlayers() {
        return (List<Player>) playerRepo.findAll();
    }
}