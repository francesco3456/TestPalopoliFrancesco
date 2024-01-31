package service;

import java.util.ArrayList;
import java.util.List;

import model.bean.UtenteBean;
import model.dao.Utentedao;

public class UtenteService {

	public List<UtenteBean> visualizzaUtentiConCinqueOPiuLibriAcquistati() {
		Utentedao utentedao = new Utentedao();
		List<UtenteBean> utentiTrovati = new ArrayList<>();
		utentiTrovati = utentedao.findUtenteWithMoreFiveBooks();

		return utentiTrovati;
	}
}
