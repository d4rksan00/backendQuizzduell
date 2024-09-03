package org.example.quizzappbackend.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.quizzappbackend.entity.Quiz;
import org.example.quizzappbackend.entity.QuizRound;
import org.example.quizzappbackend.repository.QuizRoundRepo;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Getter
@Service
public class QuizRoundServiceImpl implements QuizRoundService {

    private QuizRoundRepo quizRoundRepo;

    @Override
    public QuizRound createQuizRound(QuizRound quizRound) {
        return this.quizRoundRepo.save(quizRound);
    }

    @Override
    public QuizRound updateQuizRound(QuizRound quizRound) {
        if (this.quizRoundRepo.existsById(quizRound.getId())) {
            QuizRound newQuizRound = this.quizRoundRepo.findById(quizRound.getId()).orElse(null);
            if (newQuizRound != null) {
                newQuizRound.setId(quizRound.getId());
                this.quizRoundRepo.save(newQuizRound);
            }
        }
        return quizRound;
    }

    @Override
    public QuizRound getQuizRoundById(Long id) {
        return this.quizRoundRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteQuizRound(Long id) {

    }
}