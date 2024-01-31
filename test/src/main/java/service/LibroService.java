package service;

import java.util.ArrayList;
import java.util.List;

import model.bean.LibroBean;
import model.dao.Librodao;

public class LibroService {
	
	public List<LibroBean> visualizzaLibriByAutore(String autoreLibro) {
		
		   Librodao librodao = new Librodao();
		    List<LibroBean> listaLibri = new ArrayList<>();

		    listaLibri = librodao.findBooksByAuthor(autoreLibro);

		    return listaLibri;
	}
	
	public List<LibroBean> visualizzaQtaDisponibile(String titoloLibro) {
		
		   Librodao librodao = new Librodao();
		    List<LibroBean> listaLibri = new ArrayList<>();
		
		listaLibri = librodao.findByAvailability(titoloLibro);
		
		return listaLibri;
	}
}
