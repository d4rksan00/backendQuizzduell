package org.example.quizzappbackend.repository;

import org.example.quizzappbackend.entity.Quiz;
import org.springframework.data.repository.CrudRepository;

public interface QuizRepository extends CrudRepository<Quiz, Long> {
}
