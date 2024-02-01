package utils.converter;

import model.bean.UtenteBean;
import model.dto.Utentedto;

public class UtenteConverter {
	
	public Utentedto toDto(UtenteBean utenteBean) {
		Utentedto utenteDto = new Utentedto();
		
		utenteDto.setIdUtente(utenteBean.getIdUtente());
		utenteDto.setNomeUtente(utenteBean.getNomeUtente());
		utenteDto.setCognomeUtente(utenteBean.getCognomeUtente());
		utenteDto.setEmailUtente(utenteDto.getEmailUtente());
		utenteDto.setPasswordUtente(utenteBean.getPasswordUtente());
		utenteDto.setLibriAcquistati(utenteBean.getLibriAcquistati());
		utenteDto.setRuoloUtente(utenteBean.getRuoloUtente());
		
		return utenteDto;
	}
	
	public UtenteBean toBean(Utentedto utenteDto) {
		UtenteBean utenteBean = new UtenteBean();
		
		utenteBean.setIdUtente(utenteDto.getIdUtente());
		utenteBean.setNomeUtente(utenteDto.getNomeUtente());
		utenteBean.setCognomeUtente(utenteDto.getCognomeUtente());
		utenteBean.setEmailUtente(utenteDto.getEmailUtente());
		utenteBean.setPasswordUtente(utenteDto.getPasswordUtente());
		utenteDto.setLibriAcquistati(utenteBean.getLibriAcquistati());
		utenteDto.setRuoloUtente(utenteBean.getRuoloUtente());
		
		return utenteBean;
	}
}
