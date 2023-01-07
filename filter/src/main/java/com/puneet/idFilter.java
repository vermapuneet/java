package com.puneet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServlet;

/**
 * Servlet Filter implementation class idFilter
 */
@WebFilter("/addAlien")
public class idFilter  implements Filter {
       
    
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		//HttpServlet a=(HttpServlet)request;
		PrintWriter out=response.getWriter();
		
		int num=Integer.parseInt(request.getParameter("aid"));
		
		//System.out.println("in filter");
		if(num>1) {
		chain.doFilter(request, response);
		}
		else
		{
			out.println("invalid input");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
