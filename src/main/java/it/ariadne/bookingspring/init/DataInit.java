package it.ariadne.bookingspring.init;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import it.ariadne.bookingspring.dao.AppUserDAO;
import it.ariadne.bookingspring.dao.PrenotazioneDAO;
import it.ariadne.bookingspring.dao.RisorsaDAO;
import it.ariadne.bookingspring.entity.*;

@Component
public class DataInit implements ApplicationRunner {
 
    private RisorsaDAO risorsaDAO;
    private PrenotazioneDAO prenotazioneDAO;
    private AppUserDAO appUserDAO;
    private static final DateTimeFormatter df =  DateTimeFormat.forPattern("yyyy/MM/dd HH:mm");
 
    @Autowired
    public DataInit(RisorsaDAO risorsaDAO, PrenotazioneDAO prenotazioneDAO, AppUserDAO appUserDAO) {
        this.risorsaDAO = risorsaDAO;
        this.prenotazioneDAO = prenotazioneDAO;
        this.appUserDAO = appUserDAO;
        
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
            
            DateTime d = new DateTime(2018, 05, 18, 9, 00);     
            String data = d.toString(df);
            DateTime startDate = df.parseDateTime(data);
            p1.setInizio(startDate.toDate());
            DateTime d2 = new DateTime(2018, 05, 18, 11, 00);
        	String data2 = d2.toString(df);
        	DateTime endDate = df.parseDateTime(data2);
        	p1.setFine(endDate.toDate());
        	AppUser appUser = appUserDAO.findUserAccount("dbuser1");
        	p1.setAppUser(appUser);

 
            risorsaDAO.save(r1);
            risorsaDAO.save(r2);
            prenotazioneDAO.save(p1);
        }
 
    }
}
