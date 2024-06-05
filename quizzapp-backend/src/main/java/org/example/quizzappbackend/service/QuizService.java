package org.example.quizzappbackend.service;

import org.example.quizzappbackend.entity.Quiz;

import java.util.List;

public interface QuizService {

    Quiz createQuiz(Quiz quiz);
    Quiz getQuiz(Long id);
    Quiz updateQuiz(Quiz quiz);
    void deleteQuiz(Long id);
    List<Quiz> getAllQuizzes();
}
