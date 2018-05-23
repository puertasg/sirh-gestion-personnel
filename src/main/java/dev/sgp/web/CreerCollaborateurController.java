package dev.sgp.web;

import java.io.IOException;
import java.io.InputStream;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import dev.sgp.entite.Collaborateur;
import dev.sgp.util.Constantes;

public class CreerCollaborateurController extends HttpServlet implements Constantes {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateur.jsp")
		.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");

		String adresse = req.getParameter("adresse");
		String noSecu = req.getParameter("noSecu");
		String emailPro = "";

		LocalDate dateNaissance = null;

		resp.setContentType("text/html;charset=UTF-8");

		// Vérification du form
		boolean isFormValid = true;

		if (StringUtils.isEmpty(nom)) {
			req.setAttribute("nom", "invalid");
			isFormValid = false;
		}

		if (StringUtils.isEmpty(prenom)) {
			req.setAttribute("prenom", "invalid");
			isFormValid = false;
		}

		try {
			dateNaissance = LocalDate.parse(req.getParameter("dateNaissance"), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		} catch (DateTimeException | NullPointerException ex) {
			req.setAttribute("dateNaissance", "invalid");
			isFormValid = false;
		}

		if (StringUtils.isEmpty(adresse)) {
			req.setAttribute("adresse", "invalid");
			isFormValid = false;
		}

		if (StringUtils.isEmpty(noSecu) || noSecu.length() != 15) {
			req.setAttribute("noSecu", "invalid");
			isFormValid = false;
		}
		// Fin vérification du form
		
		//Tentative ouverture fichier de propriétés
		Properties prop = new Properties();
		InputStream input = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("config_mail_domain.properties");
		try {
			prop.load(input);
			input.close();
			String mailDomain = prop.getProperty("mailDomain");
			emailPro = nom + "." + prenom + "@" + mailDomain;
		} catch (IOException e) {
			resp.sendError(400, "Une erreur est survenue lors de la création de l'email");
		}
		//Fin ouverture fichier de propriétés

		if (isFormValid) {
			COLLAB_SERVICE.sauvegarderCollaborateur(
					new Collaborateur(nom, prenom, dateNaissance, adresse, noSecu, emailPro));
			resp.setStatus(201);
			resp.sendRedirect("/sgp/collaborateurs/lister");
		} else {
			resp.setStatus(400);
			req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateur.jsp")
				.forward(req, resp);
		}
	}
}
