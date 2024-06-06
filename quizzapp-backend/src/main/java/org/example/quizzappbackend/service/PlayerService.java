package org.example.quizzappbackend.service;

import org.example.quizzappbackend.entity.Player;
import java.util.List;

public interface PlayerService {
    public Player createPlayer(Player player);
    public Player updatePlayer(Player player);
    public Player getPlayer(Long id);
    public void deletePlayer(Long id);
    public List<Player> getAllPlayers();

}