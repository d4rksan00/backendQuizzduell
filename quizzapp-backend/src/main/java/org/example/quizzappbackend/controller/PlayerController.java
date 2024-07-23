package org.example.quizzappbackend.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.quizzappbackend.dto.PlayerCreateDto;
import org.example.quizzappbackend.entity.Player;
import org.example.quizzappbackend.entity.Quiz;
import org.example.quizzappbackend.service.PlayerServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/player")
@RequiredArgsConstructor
@CrossOrigin
public class PlayerController {

    private final PlayerServiceImpl playerService;
    private ModelMapper modelMapper = new ModelMapper();

    @PostMapping("/create")
    public ResponseEntity<Player> createPlayer(@Valid @RequestBody PlayerCreateDto player) {
        return new ResponseEntity<Player>(this.playerService.createPlayer(this.modelMapper.map(player, Player.class)), HttpStatus.OK);
    }

    @PostMapping("/getByCredentials")
    public ResponseEntity<Player> getPlayerByCredentials(@Valid @RequestBody PlayerCreateDto player) {
        return new ResponseEntity<>(this.playerService.getPlayerByCredentials(player.getEmail(), player.getPassword()) ,HttpStatus.OK);
    }

    @PostMapping("/getOpenGames")
    public ResponseEntity<List<Quiz>> getOpenGames(@Valid @RequestBody PlayerCreateDto player) {
        return new ResponseEntity<>(this.playerService.getAllOpenGames(player.getEmail()) ,HttpStatus.OK);
    }

}
