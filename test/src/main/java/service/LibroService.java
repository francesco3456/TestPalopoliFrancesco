package service;

import model.bean.LibroBean;
import model.dao.Librodao;

public class LibroService {
	
	public String visualizzaLibriByAutore(String autoreLibro) {
		
		Librodao librodao = new Librodao();
		LibroBean libroBean = new LibroBean();
		
		libroBean = librodao.findBooksByAuthor(autoreLibro);
		
		return "Questi sono i libri dell'utente scelto: "+libroBean;
	}
	
	public String visualizzaQtaDisponibile(String titoloLibro) {
		
		Librodao librodao = new Librodao();
		LibroBean libroBean = new LibroBean();
		
		libroBean = librodao.findByAvailability(titoloLibro);
		
		return "Questa è la disponibilità del libro col titolo indicato: "+ libroBean;
	}
}
