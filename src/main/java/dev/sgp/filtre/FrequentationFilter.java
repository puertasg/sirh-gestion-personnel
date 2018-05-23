package dev.sgp.filtre;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FrequentationFilter implements Filter{
	
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
		request.setAttribute("visitCount", this.counter);
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		
	}
	
}
