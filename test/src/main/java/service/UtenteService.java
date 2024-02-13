package service;

import java.util.List;

import model.bean.UtenteBean;
import model.dao.Utentedao;

public class UtenteService {

	Utentedao utentedao = new Utentedao();

	/* public List<UtenteBean> firstQueryExam () {
		Map<Long, Integer> utentiTrovati = ud.firstQueryExam();
		List<UtenteBean> result = new ArrayList<>();
		for (Map.Entry<Long, Integer> entry : utentiTrovati.entrySet()) {
		    UtenteBean utente = ud.findById(entry.getKey());
		    result.add(utente);
		}
		for (UtenteBean ut : result) {
			System.out.println(ut);
		}
		return result;
	} */
	
	public List<UtenteBean> firstQueryExam () {
		List<UtenteBean> result = utentedao.firstQueryExtraExam();
		return result;
	}
}
