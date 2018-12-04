package it.ariadne.bookingspring.controller;

import java.security.Principal;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import it.ariadne.bookingspring.dao.RisorsaDAO;
import it.ariadne.bookingspring.entity.Risorsa;
import it.ariadne.bookingspring.entity.RisorsaEnum;
import it.ariadne.bookingspring.utils.TableResponse;
import it.ariadne.bookingspring.utils.WebUtils;

@Controller
public class MainController {

	@Autowired
	RisorsaDAO risorsaDAO;
	@Autowired
	TableResponse tableResponse;

	@RequestMapping(value = { "/", "/login" }, method = RequestMethod.GET)
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

	@RequestMapping(value = { "/admin/home" }, method = RequestMethod.GET)
	public String homePage(Model model) {
		return "homePage";
	}

	@RequestMapping(value = { "/user/homeUtente" }, method = RequestMethod.GET)
	public String homePageUtente(Model model) {
		return "homePageUtente";
	}

	@RequestMapping(value = { "/admin/risorse" }, method = RequestMethod.GET)
	public String risorsePage(Model model) {
		return "risorsePage";
	}

	@RequestMapping(value = { "/admin/aggiungi-risorsa" }, method = RequestMethod.GET)
	public String aggiungiRisorsaPage(Model model) {
		return "aggiungi-risorsaPage";
	}

	@RequestMapping(value = { "/admin/modifica-risorsa" }, method = RequestMethod.GET)
	public String modificaRisorsaPage(Model model) {
		return "modifica-risorsaPage";
	}

	@RequestMapping(value = { "/admin/prenotazioni" }, method = RequestMethod.GET)
	public String prenotazioniPage(Model model) {
		return "prenotazioniPage";
	}

	@RequestMapping(value = { "/admin/utenti" }, method = RequestMethod.GET)
	public String utentiPage(Model model) {
		return "utentiPage";
	}

	@RequestMapping(value = { "/user/cerca-disponibilita" }, method = RequestMethod.GET)
	public String cercaDisponibilitaPage(Model model) {
		return "cercaDisponibilitaPage";
	}

	@RequestMapping(value = { "/user/cronologia-prenotazioni" }, method = RequestMethod.GET)
	public String cronologiaPrenotazioniPage(Model model) {
		return "cronologiaPrenotazioniPage";
	}

	@RequestMapping(value = { "/user/prenotazioni-in-atto" }, method = RequestMethod.GET)
	public String prenotazioniInAttoPage(Model model) {
		return "prenotazioniInAttoPage";
	}

	@ResponseBody
	@RequestMapping(value = { "/admin/getrisorselist" }, method = RequestMethod.GET)
	public TableResponse ritornaListaRisorse() {
		ArrayList<Risorsa> all = (ArrayList<Risorsa>) risorsaDAO.findAll();
		tableResponse.setDraw(0);
		tableResponse.setData(all);
		tableResponse.setRecordsFiltered(all.size());
		tableResponse.setRecordsTotal(all.size());

		return tableResponse;
	}

	@RequestMapping(value = { "/admin/aggiungi-risorsa-DB" }, method = RequestMethod.POST)
	public String aggiungiRisorsaDB(HttpServletRequest request, Model model) {
		String error = "";
		String nome = (String) request.getParameter("name");
		int limite = Integer.parseInt(request.getParameter("limite"));
		RisorsaEnum re = RisorsaEnum.valueOf(request.getParameter("tipo"));
		Risorsa r = new Risorsa(nome, limite, re);
		ArrayList<Risorsa> all = (ArrayList<Risorsa>) risorsaDAO.findAll();
		for (Risorsa ris : all) {
			if (ris.getNome().equalsIgnoreCase(r.getNome())) {
				error = "Non fare il furbo, la risorsa esiste già";
			}
		}
		if (error.equals("")) {
			risorsaDAO.save(r);
		}
		model.addAttribute("erroreNome", error);
		return "risorsePage";
	}
	
	@RequestMapping(value = { "/admin/modifica-risorsa-DB" }, method = RequestMethod.GET)
	public String modificaRisorsaDB(HttpServletRequest request, Model model) {
		//da implementare
		String prova = (String) request.getParameter("param1");
		System.out.println("sono in modifica "+prova);
		return "risorsePage";
	}
	
	@RequestMapping(value = { "/admin/elimina-risorsa-DB" }, method = RequestMethod.GET)
	public String eliminaRisorsaDB(HttpServletRequest request, Model model) {
		//da implementare
		System.out.println("sono in elimina");
		return "risorsePage";
	}
	
	@ResponseBody
	@RequestMapping(value = { "/admin/getutentilist" }, method = RequestMethod.GET)
	public TableResponse ritornaListaUtenti() {
		//da implementare
		return tableResponse;
	}
}
