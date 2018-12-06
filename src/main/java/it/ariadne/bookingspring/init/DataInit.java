package it.ariadne.bookingspring.init;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import it.ariadne.bookingspring.dao.PrenotazioneDAO;
import it.ariadne.bookingspring.dao.RisorsaDAO;
import it.ariadne.bookingspring.entity.*;

@Component
public class DataInit implements ApplicationRunner {
 
    private RisorsaDAO risorsaDAO;
    private PrenotazioneDAO prenotazioneDAO;
 
    @Autowired
    public DataInit(RisorsaDAO risorsaDAO, PrenotazioneDAO prenotazioneDAO) {
        this.risorsaDAO = risorsaDAO;
        this.prenotazioneDAO = prenotazioneDAO;
    }
 
    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = risorsaDAO.count();
 
        if (count == 0) {
            Risorsa r1 = new Risorsa();
 
            r1.setLimite(5);
 
            r1.setNome("YARIS");
            
            r1.setTipo(RisorsaEnum.Macchina);
            Risorsa r2 = new Risorsa();
            r2.setLimite(4);
            r2.setNome("FERRARI");
            r2.setTipo(RisorsaEnum.Macchina);
            
            Prenotazione p1 = new Prenotazione();
            p1.setNomeP("ciccio");
            p1.setRisorsa(r2);
 
            risorsaDAO.save(r1);
            risorsaDAO.save(r2);
            prenotazioneDAO.save(p1);
        }
 
    }
}
