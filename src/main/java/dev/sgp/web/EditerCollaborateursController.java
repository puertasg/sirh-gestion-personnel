package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

public class EditerCollaborateursController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		
		if(StringUtils.isAnyEmpty(matricule, titre, nom, prenom))
		{
			resp.setStatus(400);
			
			resp.getWriter().write("<h1>Code=" + resp.getStatus() + "</h1>");
			resp.getWriter().write("Les paramètres suivants sont incorects:");
			
			if(StringUtils.isEmpty(matricule))
			{
				resp.getWriter().write(" matricule");
			}
			
			if(StringUtils.isEmpty(titre))
			{
				resp.getWriter().write(" titre");
			}
			
			if(StringUtils.isEmpty(nom))
			{
				resp.getWriter().write(" nom");
			}
			
			if(StringUtils.isEmpty(prenom))
			{
				resp.getWriter().write(" prenom");
			}
		}
		else
		{
			resp.setStatus(201);
			
			resp.getWriter().write("<h1>Code=" + resp.getStatus() + "</h1>");
			resp.getWriter().write("Création d'un collaborateur avec les informations suivantes : ");
			resp.getWriter().write("Matricule : " + matricule + ",");
			resp.getWriter().write("Titre : " + titre + ",");
			resp.getWriter().write("Nom : " + nom + ",");
			resp.getWriter().write("Prénom : " + prenom);
		}
	}
}
