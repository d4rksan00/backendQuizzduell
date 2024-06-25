package de.compusafe.quizzappbff.repository;

import de.compusafe.quizzappbff.entity.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepo extends CrudRepository<Player, Long> {
}
