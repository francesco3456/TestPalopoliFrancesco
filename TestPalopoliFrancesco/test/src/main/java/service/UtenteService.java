package service;

import model.bean.UtenteBean;
import model.dao.Utentedao;
import model.dto.Utentedto;
import utils.converter.UtenteConverter;

public class UtenteService {

	public String visualizzaUtentiConCinqueOPiuLibriAcquistati () {
		
		Utentedto utentedto = new Utentedto();
		Utentedao utentedao = new Utentedao();
		UtenteConverter utenteConverter = new UtenteConverter();
		
		UtenteBean utenteBean = utenteConverter.toBean(utentedto);
		utenteBean = utentedao.findUtenteWithMoreFiveBooks();
		
		return "Gli utenti che hanno comprato più di 5 libri: "+ utenteBean;
	}
	
	public String visualizzaUtentiPremium () {
		
		Utentedto utentedto = new Utentedto();
		Utentedao utentedao = new Utentedao();
		UtenteConverter utenteConverter = new UtenteConverter();
		
		UtenteBean utenteBean = utenteConverter.toBean(utentedto);
		utenteBean = utentedao.findUtentePremium();
		
		return "Utenti premium: "+ utenteBean;
	}
	
}
