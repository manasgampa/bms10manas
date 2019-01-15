package net.antra.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionEx1 extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		HttpSession session=request.getSession(true);
		
		session.setAttribute("name", "steven");
		PrintWriter out=response.getWriter();
		out.println("Session object:"+session);
		out.println("Session id:"+session.getId());
		out.println("is new?:"+session.isNew());
	}

}
