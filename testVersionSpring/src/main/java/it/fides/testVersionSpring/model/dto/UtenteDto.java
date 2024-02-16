package it.fides.testVersionSpring.model.dto;

import java.util.List;


public class UtenteDto {
	
	private Long idUtente;
	private String nomeUtente;
	private String cognomeUtente;
	private String emailUtente;
	private String passwordUtente;
	private int etaUtente;
	private int libriAcquistati;
	private boolean isPremium;
    private RuoloDto ruolo;
    private List<LibroDto> libri;
    
	public UtenteDto() {
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


	public RuoloDto getRuolo() {
		return ruolo;
	}

	public void setRuolo(RuoloDto ruolo) {
		this.ruolo = ruolo;
	}

	public List<LibroDto> getLibri() {
		return libri;
	}

	public void setLibri(List<LibroDto> libri) {
		this.libri = libri;
	}

	
	public int getEtaUtente() {
		return etaUtente;
	}

	public void setEtaUtente(int etaUtente) {
		this.etaUtente = etaUtente;
	}

	public int getLibriAcquistati() {
		return libriAcquistati;
	}

	public void setLibriAcquistati(int libriAcquistati) {
		this.libriAcquistati = libriAcquistati;
	}

	public boolean isPremium() {
		return isPremium;
	}

	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}

	@Override
	public String toString() {
		return "UtenteDto [idUtente=" + idUtente + ", nomeUtente=" + nomeUtente + ", cognomeUtente=" + cognomeUtente
				+ ", emailUtente=" + emailUtente + ", passwordUtente=" + passwordUtente + ", etaUtente=" + etaUtente
				+ ", libriAcquistati=" + libriAcquistati + ", isPremium=" + isPremium + ", ruolo=" + ruolo + ", libri="
				+ libri + "]";
	}


    
    

}
