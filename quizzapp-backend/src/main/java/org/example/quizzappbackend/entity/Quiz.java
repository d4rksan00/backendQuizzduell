package org.example.quizzappbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "quizzes", schema = "quizzgame")
public class Quiz {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "quiz")
    private Player playerOne;

    @OneToOne(mappedBy = "quiz")
    private Player playerTwo;

    @OneToMany(mappedBy = "quiz")
    private List<QuizRound> quizRounds;

}
