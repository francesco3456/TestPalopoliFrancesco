package it.fides.testVersionSpring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.fides.testVersionSpring.model.Entitities.LibroEntity;
import it.fides.testVersionSpring.model.Entitities.UtenteEntity;
import it.fides.testVersionSpring.model.dto.UtenteDto;
import it.fides.testVersionSpring.model.repository.LibroRepository;
import it.fides.testVersionSpring.model.repository.UtenteRepository;

@Service
public class UtenteService {

	@Autowired
	private UtenteRepository utenteRepository;

	@Autowired
	private LibroRepository libroRepository;
	
	@Autowired
	private LibroService libroService;

	public List<UtenteEntity> getAllUtenti() {
		List<UtenteEntity> utenti = utenteRepository.findAll();
		if (utenti.size() > 0) {
			System.out.println("Utenti: " + utenti);
		} else {
			System.out.println("Utenti non trovati");
		}
		return utenti;
	}

	public UtenteEntity getUtenti(Long id) {
		UtenteEntity utente = utenteRepository.findById(id).get();

		if (utente != null) {
			System.out.println("utente: " + utente);
		} else {
			System.out.println("utente non trovato");
		}

		return utente;
	}

	public UtenteEntity insertUtente(UtenteEntity utenteEntity) {
		UtenteEntity utente = utenteRepository.save(utenteEntity);

		if (utente != null) {
			System.out.println("utente: " + utente);
		} else {
			System.out.println("utente non trovato");
		}

		return utente;
	}

	public UtenteEntity updateUtente(Long id, UtenteEntity utenteEntity) {
		UtenteEntity utente = utenteRepository.findById(id).get();
		UtenteEntity updatedUtente = null;

		if (utente != null) {
			utente.setIdUtente(utenteEntity.getIdUtente());
			utente.setNomeUtente(utenteEntity.getNomeUtente());
			utente.setCognomeUtente(utenteEntity.getCognomeUtente());
			utente.setEmailUtente(utenteEntity.getEmailUtente());
			utente.setEta(utenteEntity.getEta());
			utente.setPasswordUtente(utenteEntity.getPasswordUtente());
			utente.setLibriAcquistati(utenteEntity.getLibriAcquistati());

			updatedUtente = utenteRepository.save(utente);
			System.out.println("Utente aggiornato: " + updatedUtente);
		} else {
			System.out.println("Utente non aggiornato");
		}

		return updatedUtente;
	}

	public void deleteUtente(Long id) {
		utenteRepository.deleteById(id);
	}

	public List<UtenteEntity> findByGiovani() {
		return utenteRepository.getUtenteGiovane();
	}

	public List<UtenteEntity> findByConsonante() {
		return utenteRepository.getUtenteConsonante();
	}

	public UtenteEntity findByMaxLibriAcquistati() {
		return utenteRepository.getUtenteMaxLibriAcquistati();
	}

	public String associaLibri(UtenteEntity utente, List<LibroEntity> libro) {
		
		int libriAcquistati;
		LibroEntity libroEntity = new LibroEntity();
		
		utente = utenteRepository.getUtenteMaxLibriAcquistati();
		
		libriAcquistati = utente.getLibriAcquistati();
		
		if (libriAcquistati > 10) {
			libro = libroRepository.libriPrezzoMax50();
			
			if (libro != null) {
				
				//query per assegnare i libri ai 3 utenti
				//libroService.AssegnaLibro(libroEntity);
			}
		}
		
		return "libri associati agli utenti";
	}
}
