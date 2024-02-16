package it.fides.testVersionSpring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.fides.testVersionSpring.model.Entitities.LibroEntity;
import it.fides.testVersionSpring.model.repository.LibroRepository;


@Service
public class LibroService {

	@Autowired
	private LibroRepository libroRepository;
	
	
	public List<LibroEntity> getAllLibri() {
		List<LibroEntity> libri = libroRepository.findAll();
		if (libri.size() > 0) {
			System.out.println("Libri: " + libri);
		} else {
			System.out.println("Libri non trovati");
		}
		return libri;
	}
	
	public LibroEntity getLibro(Long id) {
		LibroEntity libro = libroRepository.findById(id).get();
		
		if (libro != null) {
			System.out.println("libro: " + libro);
		} else {
			System.out.println("libro non trovato");
		}
		
		return libro;
	}
	
	public LibroEntity insertLibro(LibroEntity libroEntity) {
		LibroEntity libro = libroRepository.save(libroEntity);
		
		if (libro != null) {
			System.out.println("libro: " + libro);
		} else {
			System.out.println("libro non trovato");
		}
		
		return libro;
	}
	
	public LibroEntity updateRuolo(Long id, LibroEntity libroEntity) {
		LibroEntity libro = libroRepository.findById(id).get();
		LibroEntity updatedLibro = null;
		
		if (libro != null) {
			libro.setIdLibro(libroEntity.getIdLibro());
			libro.setTitoloLibro(libroEntity.getTitoloLibro());
			libro.setAutoreLibro(libroEntity.getAutoreLibro());
			libro.setEditoreLibro(libroEntity.getEditoreLibro());
			libro.setGenereLibro(libroEntity.getGenereLibro());
			libro.setPrezzoLibro(libroEntity.getPrezzoLibro());
			
			updatedLibro = libroRepository.save(libro);
			System.out.println("Libro aggiornato: " + updatedLibro);
		} else {
			System.out.println("Libro non aggiornato");
		}
		
		return updatedLibro;
	}
	
	public void deleteLibro(Long id) {
		libroRepository.deleteById(id);
	}
	
	public List<LibroEntity> getOrdineLibri() {
		
		List<LibroEntity> libri = libroRepository.libriOrdineVista();
		
		return libri;
		
		
	}
}
