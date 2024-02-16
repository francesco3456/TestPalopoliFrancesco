package it.fides.testVersionSpring.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.fides.testVersionSpring.model.Entitities.UtenteEntity;

@Repository
public interface UtenteRepository extends JpaRepository<UtenteEntity, Long> {

	@Query(value = "SELECT * FROM utente order by età asc limit 2", nativeQuery = true)
	public List<UtenteEntity> getUtenteGiovane();
	
	
	//funzione sql vista su internet
	@Query(value = "SELECT * FROM utente WHERE LOWER(SUBSTRING(nome, 1, 1)) NOT IN ('a', 'e', 'i', 'o', 'u')", nativeQuery = true)
	public List<UtenteEntity> getUtenteConsonante();
	
	@Query(value = "SELECT * FROM utente order by libri_acquistati desc limit 1", nativeQuery = true)
	public UtenteEntity getUtenteMaxLibriAcquistati();
	
	@Query(value = "SELECT * FROM utente order by libri_acquistati asc limit 3", nativeQuery = true)
	public UtenteEntity getUtenteMinLibriAcquistati();
}
