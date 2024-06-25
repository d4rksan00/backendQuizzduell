package de.compusafe.quizzappbff.repository;

import de.compusafe.quizzappbff.entity.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends CrudRepository<Question,Long> {
}
