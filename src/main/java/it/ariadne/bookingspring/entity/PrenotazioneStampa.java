package it.ariadne.bookingspring.entity;

import java.util.Date;

public class PrenotazioneStampa {
	private Long id;
	private String risorsa;
	private String nomeP;
	private Date inizio;
	private Date fine;
	private String appUser;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRisorsa() {
		return risorsa;
	}
	public void setRisorsa(String risorsa) {
		this.risorsa = risorsa;
	}
	public String getNomeP() {
		return nomeP;
	}
	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}
	public Date getInizio() {
		return inizio;
	}
	public void setInizio(Date inizio) {
		this.inizio = inizio;
	}
	public Date getFine() {
		return fine;
	}
	public void setFine(Date fine) {
		this.fine = fine;
	}
	public String getAppUser() {
		return appUser;
	}
	public void setAppUser(String appUser) {
		this.appUser = appUser;
	}

}
