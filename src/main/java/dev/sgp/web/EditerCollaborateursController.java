package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateursController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		
		if(matricule == null || titre == null || nom == null || prenom == null)
		{
			resp.setStatus(400);
			
			resp.getWriter().write("<h1>Code=" + resp.getStatus() + "</h1>");
			resp.getWriter().write("Les paramètres suivants sont incorects:");
			
			if(matricule == null)
			{
				resp.getWriter().write(" matricule");
			}
			
			if(titre == null)
			{
				resp.getWriter().write(" titre");
			}
			
			if(nom == null)
			{
				resp.getWriter().write(" nom");
			}
			
			if(prenom == null)
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
