package org.example.quizzappbackend.controller;

import jakarta.validation.Valid;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.quizzappbackend.entity.Quiz;
import org.example.quizzappbackend.service.QuizServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Getter
@RequiredArgsConstructor
@RequestMapping("/quiz")
@CrossOrigin
public class QuizController {

    private final QuizServiceImpl quizServiceImpl;
    //private final ModelMapper modelMapper;

    @GetMapping("/allQuizzes")
    public ResponseEntity<List<Quiz>> getAllQuiz(){
        return new ResponseEntity<>(this.quizServiceImpl.getAllQuizzes(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Quiz> getQuizById(@Valid @RequestBody Long id){
        return new ResponseEntity<>(this.quizServiceImpl.getQuizById(id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Quiz> putQuiz(@Valid @RequestBody Quiz putQuiz){
        Quiz response = this.quizServiceImpl.updateQuiz(putQuiz);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Quiz> postQuiz(@Valid @RequestBody Quiz postQuiz){
        Quiz response = this.quizServiceImpl.createQuiz(postQuiz);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }



    @DeleteMapping
    public ResponseEntity<Quiz> deleteQuiz(@Valid @RequestBody Quiz deleteQuiz){
        this.quizServiceImpl.deleteQuiz(deleteQuiz.getId());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



}
