package it.ariadne.bookingspring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "Prenotazione")

public class Prenotazione {

	@Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "Id_P", nullable=false)
    private Long id;
	@Column(name = "Nome_Prenotazione", length=64, nullable=false)
	private String nomeP;//nome prenotazione
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Id", nullable = false)
	private Risorsa risorsa;
	
	@Column(name = "Inizio", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date inizio;
	
	@Column(name = "Fine", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fine;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "User_Id", nullable = false)
    private AppUser appUser;

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

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeP() {
		return nomeP;
	}

	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}

	public Risorsa getRisorsa() {
		return risorsa;
	}

	public void setRisorsa(Risorsa risorsa) {
		this.risorsa = risorsa;
	}

	public AppUser getAppUser() {
		return appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}
}
