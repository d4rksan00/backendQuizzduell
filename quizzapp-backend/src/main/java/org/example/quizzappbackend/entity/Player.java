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
@Table(name = "player", schema = "quizzapp")
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

    @OneToMany(mappedBy = "player")
    private List<Player> friendList;

    @OneToMany(mappedBy = "player")
    private List<Quiz> openQuizzes;


}
