package net.antra.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{
	
	public void service(HttpServletRequest request,HttpServletResponse response) {
		ServletConfig config=getServletConfig();
		String two=config.getInitParameter("2");
		System.out.println(two);
		ServletContext context=getServletContext();
		String url=context.getInitParameter("url");
		System.out.println("url"+url);
		
	}

}
