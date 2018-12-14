package it.ariadne.bookingspring.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.ariadne.bookingspring.entity.AppUser;
import it.ariadne.bookingspring.entity.Prenotazione;
import it.ariadne.bookingspring.entity.UserRole;
import it.ariadne.bookingspring.entity.AppRole;


@Repository
@Transactional
public class AppUserDAO {
 
    @Autowired
    private EntityManager entityManager;
 
    public AppUser findUserAccount(String userName){
        try {
            String sql = "Select e from " + AppUser.class.getName() + " e " //
                    + " Where e.userName = :userName ";
 
            Query query = entityManager.createQuery(sql, AppUser.class);
            query.setParameter("userName", userName);
 
            return (AppUser) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
    
    public ArrayList<String> trovaUtentiNonAdmin(String nomeRuolo) {
    	try {
    		String sql = "Select ur.appUser.userName from " + UserRole.class.getName() + " ur "
    				+ "where ur.appRole.roleName = :nomeRuolo";
    		Query query = entityManager.createQuery(sql, String.class);
    		query.setParameter("nomeRuolo", nomeRuolo);
    		return (ArrayList<String>) query.getResultList();
    	}catch (NoResultException e) {
            return null;
        }
    }

 
}
