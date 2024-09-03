package org.example.quizzappbackend.controller;

import jakarta.validation.Valid;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.quizzappbackend.entity.Quiz;
import org.example.quizzappbackend.entity.QuizRound;
import org.example.quizzappbackend.service.QuizRoundServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Getter
@RequiredArgsConstructor
@RequestMapping("/quizround")
@CrossOrigin
public class QuizRoundController {

    private final QuizRoundServiceImpl quizRoundServiceImpl;

    @GetMapping("/{id}")
    public ResponseEntity<QuizRound> getQuizRoundById(@Valid @PathVariable("id") Long id){
        return new ResponseEntity<>(this.quizRoundServiceImpl.getQuizRoundById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<QuizRound> postQuizRound(@Valid @RequestBody QuizRound postQuizRound){
        QuizRound response = this.quizRoundServiceImpl.createQuizRound(postQuizRound);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
