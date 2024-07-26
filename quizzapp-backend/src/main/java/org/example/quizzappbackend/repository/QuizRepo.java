package org.example.quizzappbackend.repository;

import jakarta.persistence.NamedQuery;
import org.example.quizzappbackend.entity.Player;
import org.example.quizzappbackend.entity.Quiz;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepo extends CrudRepository<Quiz, Long> {


    //List<Quiz> findAllByIsFinishedFalseAndPlayerOneEqualsOrPlayerTwoEquals(Player playerOne, Player playerTwo);
    @Query("select q from Quiz q where q.isFinished = false AND (q.playerOne.email = ?1 OR q.playerTwo.email = ?1)")
    List<Quiz> findAllOpenQuizzesByPlayerEmail(String email);
}
