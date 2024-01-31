package model.bean;

import java.time.LocalDateTime;

public class UtenteBean {
	private Long idUtente;
	private String nomeUtente;
	private String cognomeUtente;
	private String emailUtente;
	private String passwordUtente;
	private LocalDateTime dataCreazioneUtente;
	private LocalDateTime dataModificaUtente;
	private Boolean flgCancellatoUtente;
	private Long ruoloUtente;
	private int libriAcquistati;
	
	public UtenteBean(Long idUtente, String nomeUtente, String cognomeUtente, String emailUtente, String passwordUtente,
			LocalDateTime dataCreazioneUtente, LocalDateTime dataModificaUtente, Boolean flgCancellatoUtente,
			Long ruoloUtente, int libriAcquistati) {
		this.idUtente = idUtente;
		this.nomeUtente = nomeUtente;
		this.cognomeUtente = cognomeUtente;
		this.emailUtente = emailUtente;
		this.passwordUtente = passwordUtente;
		this.dataCreazioneUtente = dataCreazioneUtente;
		this.dataModificaUtente = dataModificaUtente;
		this.flgCancellatoUtente = flgCancellatoUtente;
		this.ruoloUtente = ruoloUtente;
		this.libriAcquistati = libriAcquistati;
	}
	
	public UtenteBean() {
		
	}

	public Long getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(Long idUtente) {
		this.idUtente = idUtente;
	}

	public String getNomeUtente() {
		return nomeUtente;
	}

	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}

	public String getCognomeUtente() {
		return cognomeUtente;
	}

	public void setCognomeUtente(String cognomeUtente) {
		this.cognomeUtente = cognomeUtente;
	}

	public String getEmailUtente() {
		return emailUtente;
	}

	public void setEmailUtente(String emailUtente) {
		this.emailUtente = emailUtente;
	}

	public String getPasswordUtente() {
		return passwordUtente;
	}

	public void setPasswordUtente(String passwordUtente) {
		this.passwordUtente = passwordUtente;
	}

	public LocalDateTime getDataCreazioneUtente() {
		return dataCreazioneUtente;
	}

	public void setDataCreazioneUtente(LocalDateTime dataCreazioneUtente) {
		this.dataCreazioneUtente = dataCreazioneUtente;
	}

	public LocalDateTime getDataModificaUtente() {
		return dataModificaUtente;
	}

	public void setDataModificaUtente(LocalDateTime dataModificaUtente) {
		this.dataModificaUtente = dataModificaUtente;
	}

	public Boolean getFlgCancellatoUtente() {
		return flgCancellatoUtente;
	}

	public void setFlgCancellatoUtente(Boolean flgCancellatoUtente) {
		this.flgCancellatoUtente = flgCancellatoUtente;
	}

	public Long getRuoloUtente() {
		return ruoloUtente;
	}

	public void setRuoloUtente(Long ruoloUtente) {
		this.ruoloUtente = ruoloUtente;
	}

	public int getLibriAcquistati() {
		return libriAcquistati;
	}

	public void setLibriAcquistati(int libriAcquistati) {
		this.libriAcquistati = libriAcquistati;
	}

	@Override
	public String toString() {
		return "UtenteBean [id=" + getIdUtente() + ", nomeUtente=" + getNomeUtente() + ", cognomeUtente=" + getCognomeUtente()
				+ ", emailUtente=" + getEmailUtente() + ", passwordUtente=" + getPasswordUtente() + ", dataCreazioneUtente="
				+ getDataCreazioneUtente() + ", dataModificaUtente=" + getDataModificaUtente() + ", flgCancellatoUtente="
				+ getFlgCancellatoUtente() + ", ruoloUtente=" + getRuoloUtente() + ", libriAcquistati="+ getLibriAcquistati()+ "]";
	}

}
