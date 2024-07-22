package org.example.quizzappbackend.repository;

import org.example.quizzappbackend.entity.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepo extends CrudRepository<Player, Long> {
}
