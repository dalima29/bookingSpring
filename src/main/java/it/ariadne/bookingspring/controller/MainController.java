package it.ariadne.bookingspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import it.ariadne.bookingspring.dao.RisorsaDAO;
import it.ariadne.bookingspring.entity.Macchina;

@Controller
public class MainController {
	
	@Autowired
	RisorsaDAO risorsaDAO;
 
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
    @ResponseBody
    @RequestMapping(value= {"/getrisorselist"},method = RequestMethod.GET)
    public String index() {
 
        System.out.println("11111");
        List<Macchina> lista= (List<Macchina>) risorsaDAO.findAll();
        String pippo = new Gson().toJson(lista);
        return pippo;
    }*/
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
