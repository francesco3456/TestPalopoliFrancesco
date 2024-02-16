package it.fides.testVersionSpring.model.Entitities;

import java.time.LocalDate;
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
@Table(name = "libro")
public class LibroEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_libro")
	private Long idLibro;
	@Column(name = "titolo", nullable=false, length = 50)
	private String titoloLibro;
	@Column(name = "autore", nullable=false, length = 50)
	private String autoreLibro;
	@Column(name = "prezzo", nullable=false)
	private Double prezzoLibro;
	@Column(name = "editore", nullable=false, length = 50)
	private String editoreLibro;
	@Column(name = "genere", nullable=false, length = 45)
	private String genereLibro;
	@Column(name = "data_pubblicazione")
	private LocalDate dataPubblicazioneLibro;
	@Column(name = "disponibilità", nullable=false)
	private int disponibilitaLibro;
	@Column(name = "data_creazione", nullable=false)
	private LocalDateTime dataCreazioneLibro;
	@Column(name = "data_modifica", nullable=false)
	private LocalDateTime dataModificaLibro;
	@Column(name = "flg_cancellato", nullable=false)
	private Boolean flgCancellatoLibro;
	
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "libro_utente",
            joinColumns = @JoinColumn(name = "id_libro"),
            inverseJoinColumns = @JoinColumn(name = "utente"))
    private List<UtenteEntity> utenti;
	
	public LibroEntity () {
		
	}
	
	public LibroEntity(Long idLibro, String titoloLibro, String autoreLibro, Double prezzoLibro, String editoreLibro,
			String genereLibro, LocalDate dataPubblicazioneLibro, int disponibilitaLibro,
			LocalDateTime dataCreazioneLibro, LocalDateTime dataModificaLibro, Boolean flgCancellatoLibro) {
		this.idLibro = idLibro;
		this.titoloLibro = titoloLibro;
		this.autoreLibro = autoreLibro;
		this.prezzoLibro = prezzoLibro;
		this.editoreLibro = editoreLibro;
		this.genereLibro = genereLibro;
		this.dataPubblicazioneLibro = dataPubblicazioneLibro;
		this.disponibilitaLibro = disponibilitaLibro;
		this.dataCreazioneLibro = dataCreazioneLibro;
		this.dataModificaLibro = dataModificaLibro;
		this.flgCancellatoLibro = flgCancellatoLibro;
	}

	public Long getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(Long idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitoloLibro() {
		return titoloLibro;
	}

	public void setTitoloLibro(String titoloLibro) {
		this.titoloLibro = titoloLibro;
	}

	public String getAutoreLibro() {
		return autoreLibro;
	}

	public void setAutoreLibro(String autoreLibro) {
		this.autoreLibro = autoreLibro;
	}

	public Double getPrezzoLibro() {
		return prezzoLibro;
	}

	public void setPrezzoLibro(Double prezzoLibro) {
		this.prezzoLibro = prezzoLibro;
	}

	public String getEditoreLibro() {
		return editoreLibro;
	}

	public void setEditoreLibro(String editoreLibro) {
		this.editoreLibro = editoreLibro;
	}

	public String getGenereLibro() {
		return genereLibro;
	}

	public void setGenereLibro(String genereLibro) {
		this.genereLibro = genereLibro;
	}

	public LocalDate getDataPubblicazioneLibro() {
		return dataPubblicazioneLibro;
	}

	public void setDataPubblicazioneLibro(LocalDate dataPubblicazioneLibro) {
		this.dataPubblicazioneLibro = dataPubblicazioneLibro;
	}

	public int getDisponibilitaLibro() {
		return disponibilitaLibro;
	}

	public void setDisponibilitaLibro(int disponibilitaLibro) {
		this.disponibilitaLibro = disponibilitaLibro;
	}

	public LocalDateTime getDataCreazioneLibro() {
		return dataCreazioneLibro;
	}

	public void setDataCreazioneLibro(LocalDateTime dataCreazioneLibro) {
		this.dataCreazioneLibro = dataCreazioneLibro;
	}

	public LocalDateTime getDataModificaLibro() {
		return dataModificaLibro;
	}

	public void setDataModificaLibro(LocalDateTime dataModificaLibro) {
		this.dataModificaLibro = dataModificaLibro;
	}

	public Boolean getFlgCancellatoLibro() {
		return flgCancellatoLibro;
	}

	public void setFlgCancellatoLibro(Boolean flgCancellatoLibro) {
		this.flgCancellatoLibro = flgCancellatoLibro;
	}

	@Override
	public String toString() {
		return "LibroEntity [idLibro=" + idLibro + ", titoloLibro=" + titoloLibro + ", autoreLibro=" + autoreLibro
				+ ", prezzoLibro=" + prezzoLibro + ", editoreLibro=" + editoreLibro + ", genereLibro=" + genereLibro
				+ ", dataPubblicazioneLibro=" + dataPubblicazioneLibro + ", disponibilitaLibro=" + disponibilitaLibro
				+ ", dataCreazioneLibro=" + dataCreazioneLibro + ", dataModificaLibro=" + dataModificaLibro
				+ ", flgCancellatoLibro=" + flgCancellatoLibro + "]";
	}
	
	
}
