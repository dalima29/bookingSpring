package it.ariadne.bookingspring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.ariadne.bookingspring.entity.Risorsa;

@Repository
public interface RisorsaDAO extends CrudRepository<Risorsa, Long>{
	
    public List<Risorsa> findByNomeLike(String nome);
    
    public List<Risorsa> findByLimiteGreaterThan(int limite);
    public boolean existsByNome(String nome);
    public Risorsa findByNome(String nome);
    @Transactional
    public void deleteByNome(String nome);

}

