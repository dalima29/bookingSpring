package it.ariadne.bookingspring.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.ariadne.bookingspring.entity.*;

@Repository
public interface RisorsaDAO extends CrudRepository<Macchina, Long>{
	
    public List<Macchina> findByNomeLike(String nome);
    
    public List<Macchina> findByLimiteGreaterThan(int limite);

}

