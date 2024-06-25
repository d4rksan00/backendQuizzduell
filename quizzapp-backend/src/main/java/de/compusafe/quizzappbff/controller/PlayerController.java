package de.compusafe.quizzappbff.controller;

import de.compusafe.quizzappbff.dto.PlayerCreateDto;
import de.compusafe.quizzappbff.entity.Player;
import de.compusafe.quizzappbff.service.PlayerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/player")
@RequiredArgsConstructor
public class PlayerController {

    private final PlayerServiceImpl playerService;

    @PostMapping
    public ResponseEntity<Player> createPlayer(PlayerCreateDto player) {
        return null;
    }
}
