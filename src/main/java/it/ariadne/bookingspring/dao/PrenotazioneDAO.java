package it.ariadne.bookingspring.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.ariadne.bookingspring.entity.AppUser;
import it.ariadne.bookingspring.entity.Prenotazione;

@Repository
public interface PrenotazioneDAO  extends CrudRepository<Prenotazione, Long>{
	public ArrayList<Prenotazione> findByAppUser(AppUser appUser);

}
