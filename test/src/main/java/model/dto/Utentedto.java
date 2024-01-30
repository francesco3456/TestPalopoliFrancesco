package model.dto;


public class Utentedto {
	private Long idUtente;
	private String nomeUtente;
	private String cognomeUtente;
	private String emailUtente;
	private String passwordUtente;
	private Long ruoloUtente;
	private int libriAcquistati;
	
	public Utentedto(Long idUtente, String nomeUtente, String cognomeUtente, String emailUtente, String passwordUtente,
			Long ruoloUtente, int libriAcquistati) {
		this.idUtente = idUtente;
		this.nomeUtente = nomeUtente;
		this.cognomeUtente = cognomeUtente;
		this.emailUtente = emailUtente;
		this.passwordUtente = passwordUtente;
		this.ruoloUtente = ruoloUtente;
		this.libriAcquistati = libriAcquistati;
	}
	public Utentedto() {
		
	}
	
	public Long getIdUtente() {
		return idUtente;
	}
	public void setIdUtente(Long idUtente) {
		this.idUtente = idUtente;
	}
	public int getLibriAcquistati() {
		return libriAcquistati;
	}
	public void setLibriAcquistati(int libriAcquistati) {
		this.libriAcquistati = libriAcquistati;
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
	public Long getRuoloUtente() {
		return ruoloUtente;
	}
	public void setRuoloUtente(Long ruoloUtente) {
		this.ruoloUtente = ruoloUtente;
	}
	
}
