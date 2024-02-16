package it.fides.testVersionSpring.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.fides.testVersionSpring.model.Entitities.RuoloEntity;

@Repository
public interface RuoloRepository extends JpaRepository<RuoloEntity, Long> {

}
