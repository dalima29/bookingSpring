package it.ariadne.bookingspring.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.ariadne.bookingspring.entity.*;

@Repository
public interface RisorsaDAO extends CrudRepository<Risorsa, Long>{
	
    public List<Risorsa> findByNomeLike(String nome);
    
    public List<Risorsa> findByLimiteGreaterThan(int limite);

}

