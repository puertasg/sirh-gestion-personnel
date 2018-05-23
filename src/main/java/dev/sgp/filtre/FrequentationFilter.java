package dev.sgp.filtre;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import dev.sgp.entite.VisiteWeb;
import dev.sgp.util.Constantes;

public class FrequentationFilter implements Filter, Constantes{
	
	private FilterConfig config = null;
	private int counter;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.config = filterConfig;
		config.getServletContext().log("FilterConfig initialized");
		this.counter = 0;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		this.counter ++;
		request.setAttribute("listeVisite", VISITE_SERVICE.listerVistes());
		long before = System.currentTimeMillis();
		chain.doFilter(request, response);
		long after = System.currentTimeMillis();
		
		String path = ((HttpServletRequest) request).getRequestURI();
		
		int tempsExecution = Math.toIntExact(after - before);
		VISITE_SERVICE.sauvegarderVisite(new VisiteWeb(counter, path, tempsExecution));
	}

	@Override
	public void destroy() {
		
	}
	
}
