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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable=false)
    private Long id;

    private String name;
    private Boolean turn;
    private Integer points;
    private Long countWins;
    private Long countLosses;
    private Long countDraws;

    @OneToMany(mappedBy = "player")
    private List<Player> friendList;

    @OneToMany(mappedBy = "player")
    private List<Quiz> openQuizzes;
}
