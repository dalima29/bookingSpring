package it.ariadne.bookingspring;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myservlet")
public class MyServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name = (String) request.getParameter("name");
		String error = "";
		if (!name.startsWith("T")) {
			error = "il nome deve cominciare per T";
		}
		request.getSession().setAttribute("errore", error);
		request.getSession().setAttribute("name", name);
		response.sendRedirect("aggiungi-risorsa");
	}

}
