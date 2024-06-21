package org.example.quizzappbackend.controller;

import lombok.RequiredArgsConstructor;
import org.example.quizzappbackend.dto.PlayerCreateDto;
import org.example.quizzappbackend.entity.Player;
import org.example.quizzappbackend.service.PlayerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/player")
@RequiredArgsConstructor
public class PlayerController {

    private final PlayerServiceImpl playerService;

    @PostMapping
    public ResponseEntity<Player> createPlayer(PlayerCreateDto player) {
        return new ResponseEntity<>()
    }
}
