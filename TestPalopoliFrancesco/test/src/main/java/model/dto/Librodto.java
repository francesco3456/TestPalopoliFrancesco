package model.dto;

import java.time.LocalDate;

public class Librodto {
	
	private Long idLibro;
	private String titoloLibro;
	private String autoreLibro;
	private Double prezzoLibro;
	private String editoreLibro;
	private String genereLibro;
	private LocalDate dataPubblicazioneLibro;
	private int disponibilitaLibro;
	
	public Librodto(Long idLibro, String titoloLibro, String autoreLibro, Double prezzoLibro, String editoreLibro,
			String genereLibro, LocalDate dataPubblicazioneLibro, int disponibilitaLibro) {
		this.idLibro = idLibro;
		this.titoloLibro = titoloLibro;
		this.autoreLibro = autoreLibro;
		this.prezzoLibro = prezzoLibro;
		this.editoreLibro = editoreLibro;
		this.genereLibro = genereLibro;
		this.dataPubblicazioneLibro = dataPubblicazioneLibro;
		this.disponibilitaLibro = disponibilitaLibro;
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
	
	
}
