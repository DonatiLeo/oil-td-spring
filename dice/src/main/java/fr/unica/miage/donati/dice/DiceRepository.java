package fr.unica.miage.donati.dice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DiceRepository extends JpaRepository<DiceRollLog, Long> {

}
