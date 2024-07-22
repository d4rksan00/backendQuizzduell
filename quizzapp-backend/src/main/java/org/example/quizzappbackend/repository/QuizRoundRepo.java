package org.example.quizzappbackend.repository;


import org.example.quizzappbackend.entity.QuizRound;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRoundRepo extends CrudRepository<QuizRound, Long> {
}
