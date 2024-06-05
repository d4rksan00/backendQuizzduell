package org.example.quizzappbackend.service;

import lombok.RequiredArgsConstructor;
import org.example.quizzappbackend.entity.Quiz;
import org.example.quizzappbackend.repository.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {
    private final QuizRepository quizRepository;

    @Override
    public Quiz createQuiz(Quiz quiz) {
        return this.quizRepository.save(quiz);
    }

    @Override
    public Quiz getQuiz(Long id) {
        return null;
    }

    @Override
    public Quiz updateQuiz(Quiz quiz) {
        if (this.quizRepository.existsById(quiz.getId())) {
            Quiz newQuiz = this.quizRepository.findById(quiz.getId()).orElse(null);
            if (newQuiz != null) {
                newQuiz.setId(quiz.getId());
                this.quizRepository.save(newQuiz);
            }
        }
        return quiz;
    }

    @Override
    public void deleteQuiz(Long id) {
        this.quizRepository.deleteById(id);
    }

    @Override
    public List<Quiz> getAllQuizzes() {
        return (List<Quiz>) this.quizRepository.findAll();
    }
}


