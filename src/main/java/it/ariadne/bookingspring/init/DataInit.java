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
        	
            Prenotazione p2 = new Prenotazione();
            p2.setNomeP("ciccio");
            p2.setRisorsa(r2);
            DateTime d3 = new DateTime(2018, 05, 18, 9, 00);     
            String data3 = d3.toString(df);
            DateTime startDate3 = df.parseDateTime(data3);
            p2.setInizio(startDate3.toDate());
            DateTime d4 = new DateTime(2018, 05, 18, 11, 00);
        	String data4 = d4.toString(df);
        	DateTime endDate4 = df.parseDateTime(data4);
        	p2.setFine(endDate4.toDate());
        	AppUser appUser2 = appUserDAO.findUserAccount("dbuser2");
        	p2.setAppUser(appUser2);
        	
            Prenotazione p3 = new Prenotazione();
            p3.setNomeP("ciccio");
            p3.setRisorsa(r2);
            DateTime d5 = new DateTime(2018, 12, 18, 9, 00);     
            String data5 = d5.toString(df);
            DateTime startDate5 = df.parseDateTime(data5);
            p3.setInizio(startDate5.toDate());
            DateTime d6 = new DateTime(2018, 12, 18, 11, 00);
        	String data6 = d6.toString(df);
        	DateTime endDate6 = df.parseDateTime(data6);
        	p3.setFine(endDate6.toDate());
        	p3.setAppUser(appUser);

 
            risorsaDAO.save(r1);
            risorsaDAO.save(r2);
            prenotazioneDAO.save(p1);
            prenotazioneDAO.save(p2);
            prenotazioneDAO.save(p3);
        }
 
    }
}
