package it.ariadne.bookingspring.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.ariadne.bookingspring.entity.Risorsa;
import it.ariadne.bookingspring.entity.Prenotazione;

@Repository
public interface RisorsaDAO extends CrudRepository<Risorsa, Long>{
		
    public List<Risorsa> findByNomeLike(String nome);
    
    public List<Risorsa> findByLimiteGreaterThan(int limite);
    public boolean existsByNome(String nome);
    public Risorsa findByNome(String nome);
    @Transactional
    public void deleteByNome(String nome);
    
    @Query("Select Count(p.risorsa.nome) As valueO From it.ariadne.bookingspring.entity.Prenotazione p Group By p.risorsa.nome Order By valueO DESC")
    public ArrayList<Long> risorsaPiuPrenotata();

}

