package org.example.quizzappbackend.repository;

import org.example.quizzappbackend.entity.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends CrudRepository<Question,Long> {
}
