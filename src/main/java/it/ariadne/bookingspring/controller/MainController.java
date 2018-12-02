package it.ariadne.bookingspring.controller;

import java.security.Principal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import it.ariadne.bookingspring.dao.RisorsaDAO;
import it.ariadne.bookingspring.entity.Macchina;
import it.ariadne.bookingspring.utils.TableResponse;
import it.ariadne.bookingspring.utils.WebUtils;

@Controller
public class MainController {
	
	@Autowired
	RisorsaDAO risorsaDAO;
	@Autowired
	TableResponse tableResponse;
	
    @RequestMapping(value = {"/","/login"}, method = RequestMethod.GET)
    public String loginPage(Model model) {
        return "loginPage";
    }
 
    @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
    public String logoutSuccessfulPage(Model model) {
        model.addAttribute("title", "Logout");
        return "logoutSuccessfulPage";
    }
    
    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String accessDenied(Model model, Principal principal) {
 
        if (principal != null) {
            User loginedUser = (User) ((Authentication) principal).getPrincipal();
 
            String userInfo = WebUtils.toString(loginedUser);
 
            model.addAttribute("userInfo", userInfo);
 
            String message = "Hi " + principal.getName() //
                    + "<br> You do not have permission to access this page!";
            model.addAttribute("message", message);
 
        }
 
        return "403Page";
    }
 
    @RequestMapping(value = { "/home" }, method = RequestMethod.GET)
    public String homePage(Model model) {
        return "homePage";
    }
    
    @RequestMapping(value = { "/homeUtente" }, method = RequestMethod.GET)
    public String homePageUtente(Model model) {
        return "homePageUtente";
    }
    
    @RequestMapping(value = { "/risorse" }, method = RequestMethod.GET)
    public String risorsePage(Model model) {
        return "risorsePage";
    }
    
    @RequestMapping(value = { "/aggiungi-risorsa" }, method = RequestMethod.GET)
    public String aggiungiRisorsaPage(Model model) {
        return "aggiungi-risorsaPage";
    }
    
    @RequestMapping(value = { "/modifica-risorsa" }, method = RequestMethod.GET)
    public String modificaRisorsaPage(Model model) {
        return "modifica-risorsaPage";
    }
    
    @RequestMapping(value = { "/prenotazioni" }, method = RequestMethod.GET)
    public String prenotazioniPage(Model model) {
        return "prenotazioniPage";
    }
  
    @RequestMapping(value = { "/utenti" }, method = RequestMethod.GET)
    public String utentiPage(Model model) {
        return "utentiPage";
    }
    
    @RequestMapping(value = { "/cerca-disponibilita" }, method = RequestMethod.GET)
    public String cercaDisponibilitaPage(Model model) {
        return "cercaDisponibilitaPage";
    }
    
    @RequestMapping(value = { "/cronologia-prenotazioni" }, method = RequestMethod.GET)
    public String cronologiaPrenotazioniPage(Model model) {
        return "cronologiaPrenotazioniPage";
    }
    
    @RequestMapping(value = { "/prenotazioni-in-atto" }, method = RequestMethod.GET)
    public String prenotazioniInAttoPage(Model model) {
        return "prenotazioniInAttoPage";
    }
    
    @ResponseBody
    @RequestMapping(value= {"/getrisorselist"},method = RequestMethod.GET)
    public TableResponse index() {
        ArrayList<Macchina> all = (ArrayList<Macchina>) risorsaDAO.findAll();
        tableResponse.setDraw(0);
        tableResponse.setData(all);
        tableResponse.setRecordsFiltered(all.size());
        tableResponse.setRecordsTotal(all.size());
 
        return tableResponse;
    }
    
 /*    
    @RequestMapping(value = { "/contactus" }, method = RequestMethod.GET)
    public String contactusPage(Model model) {
        model.addAttribute("address", "Vietnam");
        model.addAttribute("phone", "...");
        model.addAttribute("email", "...");
        return "contactusPage";
    }
     */
}
