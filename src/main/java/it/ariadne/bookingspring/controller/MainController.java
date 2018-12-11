package it.ariadne.bookingspring.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import it.ariadne.bookingspring.dao.AppRoleDAO;
import it.ariadne.bookingspring.dao.AppUserDAO;
import it.ariadne.bookingspring.dao.PrenotazioneDAO;
import it.ariadne.bookingspring.dao.RisorsaDAO;
import it.ariadne.bookingspring.entity.AppUser;
import it.ariadne.bookingspring.entity.Prenotazione;
import it.ariadne.bookingspring.entity.PrenotazioneStampa;
import it.ariadne.bookingspring.entity.Risorsa;
import it.ariadne.bookingspring.entity.RisorsaEnum;
import it.ariadne.bookingspring.utils.TableResponse;
import it.ariadne.bookingspring.utils.WebUtils;

@Controller
public class MainController {

	@Autowired
	RisorsaDAO risorsaDAO;
	@Autowired
	PrenotazioneDAO prenotazioneDAO;
	@Autowired
	AppUserDAO appUserDAO;
	@Autowired
	AppRoleDAO appRoleDAO;
	@Autowired
	TableResponse<Risorsa> tableResponse;
	@Autowired
	TableResponse<PrenotazioneStampa> tableResponsePrenotazione;

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
	
	@RequestMapping(value = { "/user/risorse" }, method = RequestMethod.GET)
	public String risorsePageUser(Model model) {
		return "risorseUserPage";
	}

	@RequestMapping(value = { "/admin/aggiungi-risorsa" }, method = RequestMethod.GET)
	public String aggiungiRisorsaPage(Model model) {
		return "aggiungi-risorsaPage";
	}

	@RequestMapping(value = { "/admin/modifica-risorsa" }, method = RequestMethod.GET)
	public String modificaRisorsaPage(Model model) {
		return "modifica-risorsaPage";
	}

	@RequestMapping(value = { "/admin/elimina-risorsa" }, method = RequestMethod.GET)
	public String eliminaRisorsaPage(Model model) {
		return "elimina-risorsaPage";
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

	@RequestMapping(value = { "/user/aggiungi-prenotazione" }, method = RequestMethod.GET)
	public String aggiungiPrenotazionePage(Model model) {
		return "aggiungiPrenotazionePage";
	}

	@RequestMapping(value = { "/user/rimuovi-prenotazione" }, method = RequestMethod.GET)
	public String rimuoviPrenotazionePage(Model model) {
		return "rimuoviPrenotazionePage";
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
	public TableResponse<Risorsa> ritornaListaRisorse() {
		ArrayList<Risorsa> all = (ArrayList<Risorsa>) risorsaDAO.findAll();
		tableResponse.setDraw(0);
		tableResponse.setData(all);
		tableResponse.setRecordsFiltered(all.size());
		tableResponse.setRecordsTotal(all.size());

		return tableResponse;
	}
	
	@ResponseBody
	@RequestMapping(value = { "/user/getrisorselistuser" }, method = RequestMethod.GET)
	public TableResponse<Risorsa> ritornaListaRisorseUser() {
		ArrayList<Risorsa> all = (ArrayList<Risorsa>) risorsaDAO.findAll();
		tableResponse.setDraw(0);
		tableResponse.setData(all);
		tableResponse.setRecordsFiltered(all.size());
		tableResponse.setRecordsTotal(all.size());

		return tableResponse;
	}

	@ResponseBody
	@RequestMapping(value = { "/admin/getprenotazionilist" }, method = RequestMethod.GET)
	public TableResponse<PrenotazioneStampa> ritornaListaPrenotazioni() {
		ArrayList<Prenotazione> all = (ArrayList<Prenotazione>) prenotazioneDAO.findAll();
		tableResponsePrenotazione.setDraw(0);
		ArrayList<PrenotazioneStampa> prenotazioneStampa = new ArrayList<>();

		tableResponsePrenotazione.setRecordsFiltered(all.size());
		tableResponsePrenotazione.setRecordsTotal(all.size());
		for (Prenotazione p : all) {
			PrenotazioneStampa ps = new PrenotazioneStampa();
			ps.setId(p.getId());
			ps.setInizio(p.getInizio());
			ps.setFine(p.getFine());
			ps.setRisorsa(p.getRisorsa().getNome());
			ps.setAppUser(p.getAppUser().getUserName());
			ps.setNomeP(p.getNomeP());
			prenotazioneStampa.add(ps);
		}
		tableResponsePrenotazione.setData(prenotazioneStampa);
		return tableResponsePrenotazione;
	}

	@ResponseBody
	@RequestMapping(value = { "/user/getcronologialist" }, method = RequestMethod.GET)
	public TableResponse<PrenotazioneStampa> ritornaListaCronologia(Model model, Principal principal) {
		String utente = principal.getName();
		AppUser appUser = appUserDAO.findUserAccount(utente);
		ArrayList<Prenotazione> all = (ArrayList<Prenotazione>) prenotazioneDAO.findByAppUser(appUser);
		tableResponsePrenotazione.setDraw(0);
		ArrayList<PrenotazioneStampa> prenotazioneStampa = new ArrayList<>();

		tableResponsePrenotazione.setRecordsFiltered(all.size());
		tableResponsePrenotazione.setRecordsTotal(all.size());
		for (Prenotazione p : all) {
			PrenotazioneStampa ps = new PrenotazioneStampa();
			ps.setId(p.getId());
			ps.setInizio(p.getInizio());
			ps.setFine(p.getFine());
			ps.setRisorsa(p.getRisorsa().getNome());
			ps.setAppUser(p.getAppUser().getUserName());
			ps.setNomeP(p.getNomeP());
			prenotazioneStampa.add(ps);
		}
		tableResponsePrenotazione.setData(prenotazioneStampa);
		return tableResponsePrenotazione;
	}

	@ResponseBody
	@RequestMapping(value = { "/user/getprenotazionicorrentilist" }, method = RequestMethod.GET)
	public TableResponse<PrenotazioneStampa> ritornaListaPrenotazioni(Model model, Principal principal) {
		String utente = principal.getName();
		AppUser appUser = appUserDAO.findUserAccount(utente);
		Date adesso = new Date();
		ArrayList<Prenotazione> all = (ArrayList<Prenotazione>) prenotazioneDAO
				.findByAppUserAndInizioGreaterThanEqual(appUser, adesso);
		tableResponsePrenotazione.setDraw(0);
		ArrayList<PrenotazioneStampa> prenotazioneStampa = new ArrayList<>();

		tableResponsePrenotazione.setRecordsFiltered(all.size());
		tableResponsePrenotazione.setRecordsTotal(all.size());
		for (Prenotazione p : all) {
			PrenotazioneStampa ps = new PrenotazioneStampa();
			ps.setId(p.getId());
			ps.setInizio(p.getInizio());
			ps.setFine(p.getFine());
			ps.setRisorsa(p.getRisorsa().getNome());
			ps.setAppUser(p.getAppUser().getUserName());
			ps.setNomeP(p.getNomeP());
			prenotazioneStampa.add(ps);
		}
		tableResponsePrenotazione.setData(prenotazioneStampa);
		return tableResponsePrenotazione;
	}

	@RequestMapping(value = { "/admin/aggiungi-risorsa-DB" }, method = RequestMethod.POST)
	public String aggiungiRisorsaDB(HttpServletRequest request, Model model) {
		String error = "";
		String nome = (String) request.getParameter("name");
		String nomeDB = nome.toUpperCase();
		int limite = Integer.parseInt(request.getParameter("limite"));
		RisorsaEnum re = RisorsaEnum.valueOf(request.getParameter("tipo"));
		Risorsa r = new Risorsa(nomeDB, limite, re);
		ArrayList<Risorsa> all = (ArrayList<Risorsa>) risorsaDAO.findAll();
		for (Risorsa ris : all) {
			if (ris.getNome().equals(r.getNome())) {
				error = "La risorsa esiste già";
			}
		}
		if (error.equals("")) {
			risorsaDAO.save(r);
		}
		model.addAttribute("erroreNome", error);
		return "risorsePage";
	}

	@RequestMapping(value = { "/admin/modifica-risorsa-DB" }, method = RequestMethod.POST)
	public String modificaRisorsaDB(HttpServletRequest request, Model model) {
		String errorModifica = "";
		String nomeR = (String) request.getParameter("nome-risorsa");
		String nomeRDB = nomeR.toUpperCase();
		int limite = Integer.parseInt(request.getParameter("limite"));
		if (risorsaDAO.existsByNome(nomeRDB)) {
			Risorsa r = risorsaDAO.findByNome(nomeRDB);
			r.setLimite(limite);
			risorsaDAO.save(r);
			return "risorsePage";
		} else {
			errorModifica = "La risorsa non esiste";
			model.addAttribute("erroreModifica", errorModifica);
			return "modifica-risorsaPage";
		}

	}

	@RequestMapping(value = { "/admin/elimina-risorsa-DB" }, method = RequestMethod.POST)
	public String eliminaRisorsaDB(HttpServletRequest request, Model model) {
		String errorElimina = "";
		String nomeR = (String) request.getParameter("nome-risorsa");
		String nomeRDB = nomeR.toUpperCase();
		if (risorsaDAO.existsByNome(nomeRDB)) {
			risorsaDAO.deleteByNome(nomeRDB);
			return "risorsePage";
		} else {
			errorElimina = "La risorsa non esiste";
			model.addAttribute("erroreElimina", errorElimina);
			return "elimina-risorsaPage";
		}

	}

	@RequestMapping(value = { "/user/elimina-prenotazione-DB" }, method = RequestMethod.POST)
	public String eliminaPrenotazioneDB(HttpServletRequest request, Model model, Principal principal) {
		String errorEliminaPrenotazione = "";
		Long idP = Long.valueOf(request.getParameter("id-prenotazione"));
		String utente = principal.getName();
		
		if (prenotazioneDAO.existsById(idP)) {
			DateTime ddtt = new DateTime(prenotazioneDAO.findById(idP).get().getInizio());
			if (prenotazioneDAO.findById(idP).get().getAppUser().getUserName().equals(utente)
					&& ddtt.isAfterNow()) {
				prenotazioneDAO.deleteById(idP);
				return "prenotazioniInAttoPage";
			} else {
				//è la prenotazione di un altro utente o è in cronologia
				errorEliminaPrenotazione = "Non puoi rimuovere la prenotazione";
				model.addAttribute("erroreEliminaPrenotazione", errorEliminaPrenotazione);
				return "rimuoviPrenotazionePage";
			}
		} else {
			errorEliminaPrenotazione = "La prenotazione non esiste";
			model.addAttribute("erroreEliminaPrenotazione", errorEliminaPrenotazione);
			return "rimuoviPrenotazionePage";
		}

	}

	@RequestMapping(value = { "/user/cerca-disponibilita-DB" }, method = RequestMethod.POST)
	public String cercaDisponibilitaDB(HttpServletRequest request, Model model, Principal principal) {
		Long idR = Long.valueOf(request.getParameter("idR"));
		DateTime dtinizioR = new DateTime(request.getParameter("inizio"));
		DateTime dtfineR = new DateTime(request.getParameter("fine"));
		Period periodo = new Period(Integer.parseInt(request.getParameter("durata")), 0, 0, 0);
		String errorRisNonEsiste = "";
		if (risorsaDAO.existsById(idR)) {
			Optional<Risorsa> risorsa = risorsaDAO.findById(idR);
			ArrayList<Prenotazione> prenotazioni = prenotazioneDAO.findByRisorsa(risorsa.get());
			boolean dataDisp = true;
			do {
				dataDisp = true;
				for (Prenotazione pre : prenotazioni) {
					Interval intervallo = new Interval(dtinizioR, dtinizioR.plus(periodo));
					Interval intervalloDB = new Interval(new DateTime(pre.getInizio()), new DateTime(pre.getFine()));
					if (intervallo.overlaps(intervalloDB)) {
						dtinizioR = dtinizioR.plusHours(1);
						dataDisp = false;
						break;
					}
				}
				if (dataDisp) {
					DateTime primaDataDisp = new DateTime(dtinizioR);
					DateTimeFormatter df = DateTimeFormat.forPattern("dd-MM-yyyy HH:mm");
					errorRisNonEsiste = "La prima disponibile è " + primaDataDisp.toString(df);
					model.addAttribute("erroreRisNonEsiste", errorRisNonEsiste);
					return "aggiungiPrenotazionePage";
				}
			} while (dtinizioR.plus(periodo).isBefore(dtfineR));
			errorRisNonEsiste = "non sono disponibili date";
			model.addAttribute("erroreRisNonEsiste", errorRisNonEsiste);
			return "cercaDisponibilitaPage";
		} else {
			errorRisNonEsiste = "La risorsa non esiste";
			model.addAttribute("erroreRisNonEsiste", errorRisNonEsiste);
			return "cercaDisponibilitaPage";
		}

	}

	@RequestMapping(value = { "/user/aggiungi-prenotazione-DB" }, method = RequestMethod.POST)
	public String aggiungiPrenotazioneDB(HttpServletRequest request, Model model, Principal principal) {
		Long idR = Long.valueOf(request.getParameter("IdRis"));
		DateTime dtinizioR = new DateTime(request.getParameter("inizio"));
		Period periodo = new Period(Integer.parseInt(request.getParameter("periodo")), 0, 0, 0);
		String nomePrenotazione = (String)request.getParameter("nomeP");
		String errorDataNonDisp = "";
		if (risorsaDAO.existsById(idR)) {
			Optional<Risorsa> risorsa = risorsaDAO.findById(idR);
			ArrayList<Prenotazione> prenotazioni = prenotazioneDAO.findByRisorsa(risorsa.get());
			boolean dataDisp = true;
			for (Prenotazione pre : prenotazioni) {
				Interval intervallo = new Interval(dtinizioR, dtinizioR.plus(periodo));
				Interval intervalloDB = new Interval(new DateTime(pre.getInizio()), new DateTime(pre.getFine()));
				if (intervallo.overlaps(intervalloDB)) {
					dataDisp = false;
					break;
				}
			}
			if (dataDisp) {
				Prenotazione preno = new Prenotazione();
				AppUser appUser = appUserDAO.findUserAccount(principal.getName());
				preno.setAppUser(appUser);

				DateTime primaDataDisp = new DateTime(dtinizioR);
				preno.setFine(primaDataDisp.plus(periodo).toDate());
				preno.setInizio(primaDataDisp.toDate());
				preno.setNomeP(nomePrenotazione);
				preno.setRisorsa(risorsa.get());
				prenotazioneDAO.save(preno);			
				return "prenotazioniInAttoPage";
			}
			errorDataNonDisp = "Data non disponibile";
			model.addAttribute("erroreDataNonDisp", errorDataNonDisp);
			return "cercaDisponibilitaPage";
		} else {
			errorDataNonDisp = "La risorsa non esiste";
			model.addAttribute("erroreRisNonEsiste", errorDataNonDisp);
			return "aggiungiPrenotazionePage";
		}
	}

}
