package it.fides.testVersionSpring.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.fides.testVersionSpring.model.Entitities.LibroEntity;

@Repository
public interface LibroRepository extends JpaRepository<LibroEntity, Long> {
	
	@Query(value = "SELECT * FROM libro where prezzo > 50", nativeQuery = true)
	public List<LibroEntity> libriPrezzoMax50();
		
	@Query(value = "SELECT * FROM libro order by autore, prezzo", nativeQuery = true)
	public List<LibroEntity> libriOrdineVista();

}
