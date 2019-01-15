package net.antra.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionEx2 extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		HttpSession session=request.getSession(false);
		
		String str=(String)session.getAttribute("name");
		
		PrintWriter out=response.getWriter();
		out.println("Session value:"+str);
	}
}