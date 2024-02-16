package it.fides.testVersionSpring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.fides.testVersionSpring.model.Entitities.RuoloEntity;
import it.fides.testVersionSpring.model.repository.RuoloRepository;


@Service
public class RuoloService {

	@Autowired
	private RuoloRepository ruoloRepository;
	
	
	public List<RuoloEntity> getAllRuoli() {
		List<RuoloEntity> ruoli = ruoloRepository.findAll();
		if (ruoli.size() > 0) {
			System.out.println("Ruoli: " + ruoli);
		} else {
			System.out.println("Ruoli non trovati");
		}
		return ruoli;
	}
	
	public RuoloEntity getRuolo(Long id) {
		RuoloEntity ruolo = ruoloRepository.findById(id).get();
		
		if (ruolo != null) {
			System.out.println("Ruolo: " + ruolo);
		} else {
			System.out.println("Ruolo non trovato");
		}
		
		return ruolo;
	}
	
	public RuoloEntity insertRuolo(RuoloEntity ruoloEntity) {
		RuoloEntity ruolo = ruoloRepository.save(ruoloEntity);
		
		if (ruolo != null) {
			System.out.println("Ruolo: " + ruolo);
		} else {
			System.out.println("Ruolo non trovato");
		}
		
		return ruolo;
	}
	
	public RuoloEntity updateRuolo(Long id, RuoloEntity ruoloEntity) {
		RuoloEntity ruolo = ruoloRepository.findById(id).get();
		RuoloEntity updatedRuolo = null;
		
		if (ruolo != null) {
			ruolo.setIdRuolo(ruoloEntity.getIdRuolo());
			ruolo.setNomeRuolo(ruoloEntity.getNomeRuolo());
			
			updatedRuolo = ruoloRepository.save(ruolo);
			System.out.println("Ruolo aggiornato: " + updatedRuolo);
		} else {
			System.out.println("Ruolo non aggiornato");
		}
		
		return updatedRuolo;
	}
	
	public void deleteRuolo(Long id) {
		ruoloRepository.deleteById(id);
	}
}
