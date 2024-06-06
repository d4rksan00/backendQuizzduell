package org.example.quizzappbackend.controller;

import jakarta.validation.Valid;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.quizzappbackend.entity.Player;
import org.example.quizzappbackend.service.PlayerServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Getter
@RequiredArgsConstructor
@RequestMapping("/player")
@CrossOrigin
public class PlayerController {

    private final PlayerServiceImpl playerServiceImpl;

    @PostMapping
    public ResponseEntity<Player> postPlayer(@Valid @RequestBody Player player) {
        Player response = this.playerServiceImpl.createPlayer(player);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Player> putPlayer(@Valid @RequestBody Player player) {
        Player response = this.playerServiceImpl.updatePlayer(player);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Player> deletePlayer(@Valid @RequestBody Player player) {
        this.playerServiceImpl.deletePlayer(player.getId());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/allPlayers")
    public ResponseEntity<List<Player>> getAllPlayers() {
        return new ResponseEntity<>(this.playerServiceImpl.getAllPlayers(), HttpStatus.OK);
    }

}
