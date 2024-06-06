package org.example.quizzappbackend.service;

import org.example.quizzappbackend.entity.Quiz;

import java.util.List;

public interface QuizService {

    public Quiz createQuiz(Quiz quiz);
    public Quiz updateQuiz(Quiz quiz);
    public Quiz getQuizById(Long id);
    public void deleteQuiz(Long id);
    public List<Quiz> getAllQuizzes();

}
