package org.example.quizzappbackend.controller;

import lombok.RequiredArgsConstructor;
import jakarta.validation.Valid;
import org.example.quizzappbackend.entity.Quiz;
import org.modelmapper.ModelMapper;
import org.example.quizzappbackend.service.QuizServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Quiz")
@CrossOrigin
public class QuizController {

    private final QuizServiceImpl quizServiceImpl;
    private final ModelMapper modelMapper;

    @PostMapping()
    //@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Quiz> createQuiz(@Valid @RequestBody CreateQuizDTO createQuizDTO) {
        return new ResponseEntity<>(quizServiceImpl.createQuiz(modelMapper.map(createQuizDTO, Quiz.class)), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Quiz> updateQuiz(@Valid @RequestBody UpdateQuizDTO updateQuizDTO) {
        return new ResponseEntity<>(quizServiceImpl.updateQuiz(modelMapper.map(updateQuizDTO, Quiz.class)), HttpStatus.OK);DeleteMapping
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteQuiz(@RequestParam Long id) {
        quizServiceImpl.deleteQuiz(id);
    }

    @GetMapping
    public ResponseEntity<Quiz> getQuiz(@RequestParam Long id) {
        return new ResponseEntity<>(quizServiceImpl.getQuiz(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Quiz>> getAllQuiz() {
        return new ResponseEntity<>(quizServiceImpl.getAllQuizzes(), HttpStatus.OK);
    }
}
