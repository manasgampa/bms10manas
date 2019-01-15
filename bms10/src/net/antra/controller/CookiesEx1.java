package net.antra.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookiesEx1 extends HttpServlet{

	public void service(HttpServletRequest request,HttpServletResponse response) {
		
		Cookie c1=new Cookie("name","manas");
		Cookie c2=new Cookie("sal","123");
		
		response.addCookie(c1);
		response.addCookie(c2);
		
		
		
	}
	
}
