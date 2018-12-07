package it.ariadne.bookingspring.dao;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.ariadne.bookingspring.entity.AppUser;
import it.ariadne.bookingspring.entity.Prenotazione;
import it.ariadne.bookingspring.entity.Risorsa;

@Repository
public interface PrenotazioneDAO  extends CrudRepository<Prenotazione, Long>{
	public ArrayList<Prenotazione> findByAppUser(AppUser appUser);
	public ArrayList<Prenotazione> findByAppUserAndInizioGreaterThanEqual(AppUser appUser,Date start);
	public ArrayList<Prenotazione> findByRisorsa(Risorsa risorsa);
}