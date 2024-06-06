package org.example.quizzappbackend.entity;
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
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Boolean activePlayer;

    private Integer points;

    private Long countWins;

    private Long countLosses;

    private Long countDraws;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Quiz> friendList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Quiz> openQuizzes = new ArrayList<>();


}
