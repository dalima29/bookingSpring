package it.ariadne.bookingspring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


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
	@JoinColumn(name = "Id_Risorsa", nullable = false)
	private Risorsa risorsa;
	/*@Column(name = "Inizio", nullable=false)
	private DateTime inizio;*/
	
	//private Interval intervallo;//intervallo in cui si effettua la prenotazione
	
    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "User_Id", nullable = false)
    private AppUser appUser;*/

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

/*	public AppUser getAppUser() {
		return appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}*/
}
