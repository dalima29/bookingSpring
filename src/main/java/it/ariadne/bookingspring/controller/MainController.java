package it.ariadne.bookingspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
 
    @RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
    public String homePage(Model model) {
        return "homePage";
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
