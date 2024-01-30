package model.dto;

public class Ruolodto {

	private Long idRuolo;
	private String nomeRuolo;
	
	public Ruolodto(Long idRuolo, String nomeRuolo) {
		this.idRuolo = idRuolo;
		this.nomeRuolo = nomeRuolo;
	}

	public Long getIdRuolo() {
		return idRuolo;
	}

	public void setIdRuolo(Long idRuolo) {
		this.idRuolo = idRuolo;
	}

	public String getNomeRuolo() {
		return nomeRuolo;
	}

	public void setNomeRuolo(String nomeRuolo) {
		this.nomeRuolo = nomeRuolo;
	}
	
	
}
