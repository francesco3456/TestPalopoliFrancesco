package it.fides.testVersionSpring.model.Entitities;

import java.time.LocalDateTime;
import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "utente")
public class UtenteEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_utente")
	private Long idUtente;
	@Column(name = "nome",length = 50)
	private String nomeUtente;
	@Column(name = "cognome", length = 50)
	private String cognomeUtente;
	@Column(name = "età")
	private int eta;
	@Column(name = "email", nullable=false, length = 30)
	private String emailUtente;
	@Column(name = "pass", nullable=false, length = 100)
	private String passwordUtente;
	@Column(name = "data_creazione", nullable=false)
	private LocalDateTime dataCreazioneUtente;
	@Column(name = "data_modifica", nullable=false)
	private LocalDateTime dataModificaUtente;
	@Column(name = "flg_cancellato", nullable=false)
	private Boolean flgCancellatoUtente;
	@Column(name = "ruolo")
	private Long ruoloUtente;
	@Column(name = "libri_acquistati")
	private int libriAcquistati;
	@Column(name = "isPremium")
	private boolean isPremium;
	
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "libro_utente",
            joinColumns = @JoinColumn(name = "id_utente"),
            inverseJoinColumns = @JoinColumn(name = "libro"))
    private List<LibroEntity> libri;
	
	public UtenteEntity () {
		
	}

	public UtenteEntity(Long idUtente, String nomeUtente, String cognomeUtente, int eta, String emailUtente,
			String passwordUtente, LocalDateTime dataCreazioneUtente, LocalDateTime dataModificaUtente,
			Boolean flgCancellatoUtente, Long ruoloUtente, int libriAcquistati, boolean isPremium) {
		this.idUtente = idUtente;
		this.nomeUtente = nomeUtente;
		this.cognomeUtente = cognomeUtente;
		this.eta = eta;
		this.emailUtente = emailUtente;
		this.passwordUtente = passwordUtente;
		this.dataCreazioneUtente = dataCreazioneUtente;
		this.dataModificaUtente = dataModificaUtente;
		this.flgCancellatoUtente = flgCancellatoUtente;
		this.ruoloUtente = ruoloUtente;
		this.libriAcquistati = libriAcquistati;
		this.isPremium = isPremium;
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

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
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

	public boolean isPremium() {
		return isPremium;
	}

	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}
	


	public List<LibroEntity> getLibri() {
		return libri;
	}

	public void setLibri(List<LibroEntity> libri) {
		this.libri = libri;
	}

	@Override
	public String toString() {
		return "UtenteEntity [idUtente=" + idUtente + ", nomeUtente=" + nomeUtente + ", cognomeUtente=" + cognomeUtente
				+ ", eta=" + eta + ", emailUtente=" + emailUtente + ", passwordUtente=" + passwordUtente
				+ ", dataCreazioneUtente=" + dataCreazioneUtente + ", dataModificaUtente=" + dataModificaUtente
				+ ", flgCancellatoUtente=" + flgCancellatoUtente + ", ruoloUtente=" + ruoloUtente + ", libriAcquistati="
				+ libriAcquistati + ", isPremium=" + isPremium + "]";
	}


	
	
	

}
