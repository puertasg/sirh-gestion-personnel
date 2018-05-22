package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

public class EditerCollaborateursController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String matricule = req.getParameter("matricule");
		
		resp.setContentType("text/html;charset=UTF-8");
		
		if(StringUtils.isEmpty(matricule))
		{
			resp.sendError(400, "Un matricule est attendu");
		}
		else
		{
			resp.setStatus(200);
			resp.getWriter().write("<h1>Code=" + resp.getStatus() + "</h1>");
			resp.getWriter().write("matricule=" + matricule);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		
		resp.setContentType("text/html;charset=UTF-8");
		
		if(StringUtils.isAnyEmpty(matricule, titre, nom, prenom))
		{
			
			String paramsIncorrects = "";
			
			if(StringUtils.isEmpty(matricule))
			{
				paramsIncorrects += " matricule";
			}
			
			if(StringUtils.isEmpty(titre))
			{
				paramsIncorrects += " titre";
			}
			
			if(StringUtils.isEmpty(nom))
			{
				paramsIncorrects += " nom";
			}
			
			if(StringUtils.isEmpty(prenom))
			{
				paramsIncorrects += " prenom";
			}
			
			resp.sendError(400, "Les paramètres suivants sont incorects:" + paramsIncorrects);
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
