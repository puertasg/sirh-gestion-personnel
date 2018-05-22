package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String matricule = req.getParameter("matricule");
		if(matricule == null)
		{
			resp.setStatus(400);
			resp.getWriter().write("Un matricule est attendu");
		}
		else
		{
			resp.getWriter().write("<h1>Edition de collaborateur</h1>"
			+ "Matricule : " + matricule);
		}
	}

}
