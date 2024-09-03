package org.example.quizzappbackend.service;


import org.example.quizzappbackend.entity.QuizRound;

public interface QuizRoundService {

    public QuizRound createQuizRound(QuizRound quizRound);
    public QuizRound updateQuizRound(QuizRound quizRound);
    public QuizRound getQuizRoundById(Long id);
    public void deleteQuizRound(Long id);
}
