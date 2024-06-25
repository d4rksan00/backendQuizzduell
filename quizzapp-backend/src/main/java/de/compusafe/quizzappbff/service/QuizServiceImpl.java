package de.compusafe.quizzappbff.service;

import de.compusafe.quizzappbff.repository.QuizRepo;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import de.compusafe.quizzappbff.entity.Quiz;
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
        if (this.quizRepo.existsById(quiz.getId())) {
            Quiz newQuiz = this.quizRepo.findById(quiz.getId()).orElse(null);
            if (newQuiz != null) {
                newQuiz.setId(quiz.getId());
                this.quizRepo.save(newQuiz);
            }
        }
        return quiz;
    }

    @Override
    public Quiz getQuizById(Long id) {
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
