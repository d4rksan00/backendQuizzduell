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
public class Player {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Boolean activePlayer;

    private Integer points;

    private Long countWins;

    private Long countLosses;

    private Long countDraws;

    @OneToMany
    private List<Player> friendList;

    @OneToMany
    private List<Quiz> openQuizzes;


}
