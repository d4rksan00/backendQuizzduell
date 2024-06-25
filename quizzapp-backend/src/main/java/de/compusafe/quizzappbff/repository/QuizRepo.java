package de.compusafe.quizzappbff.repository;

import de.compusafe.quizzappbff.entity.Quiz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepo extends CrudRepository<Quiz, Long> {

}
