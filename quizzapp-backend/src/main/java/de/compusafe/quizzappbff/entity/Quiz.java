package de.compusafe.quizzappbff.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Player playerOne;

    @OneToOne
    private Player playerTwo;

    @OneToMany(cascade = CascadeType.ALL)
    private List<QuizRound> quizRounds = new ArrayList<>();

}
