package org.example.quizzappbackend.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.quizzappbackend.entity.Quiz;
import org.example.quizzappbackend.repository.QuizRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {

    private final QuizRepo quizRepo;

    @Override
    public Quiz createQuiz(Quiz quiz) {
        return this.quizRepo.save(quiz);
    }

    @Override
    public Quiz updateQuiz(Quiz quiz) {
        return this.quizRepo.save(quiz);
    }

    @Override
    public Quiz getQuiz(Long id) {
        return this.quizRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteQuiz(Long id) {
        this.quizRepo.deleteById(id);
    }

    @Override
    public List<Quiz> getAllQuizzes() {
        return (List<Quiz>) quizRepo.findAll();
    }
}
