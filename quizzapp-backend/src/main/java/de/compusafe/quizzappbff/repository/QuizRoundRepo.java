package de.compusafe.quizzappbff.repository;


import de.compusafe.quizzappbff.entity.QuizRound;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRoundRepo extends CrudRepository<QuizRound, Long> {
}
