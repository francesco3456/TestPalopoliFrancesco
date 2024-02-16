package it.fides.testVersionSpring.model.dto;

import java.time.LocalDate;
import java.util.List;

public class LibroDto {

	private Long idLibro;
	private String titoloLibro;
	private String autoreLibro;
	private Double prezzoLibro;
	private String editoreLibro;
	private String genereLibro;
	private LocalDate dataPubblicazioneLibro;
	private int disponibilitaLibro;
    private List<Long> utenti;
    
	public LibroDto() {
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

	public List<Long> getUtenti() {
		return utenti;
	}

	public void setUtenti(List<Long> utenti) {
		this.utenti = utenti;
	}

	@Override
	public String toString() {
		return "LibroDto [idLibro=" + idLibro + ", titoloLibro=" + titoloLibro + ", autoreLibro=" + autoreLibro
				+ ", prezzoLibro=" + prezzoLibro + ", editoreLibro=" + editoreLibro + ", genereLibro=" + genereLibro
				+ ", dataPubblicazioneLibro=" + dataPubblicazioneLibro + ", disponibilitaLibro=" + disponibilitaLibro
				+ ", utenti=" + utenti + "]";
	}
    
    
}
