package net.antra.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{

	public void init() {
		System.out.println("in init method");
	}
	
	public void service(HttpServletRequest request,HttpServletResponse reponse) throws IOException {
		
		System.out.println("in first servlet");
		ServletConfig config=getServletConfig();
		String one=config.getInitParameter("1");
		System.out.println(one);
		ServletContext context=getServletContext();
		String url=context.getInitParameter("url");
		System.out.println("url"+url);
		
		/*String no=request.getParameter("no");
		String name=request.getParameter("name");
		String marks=request.getParameter("marks");
		
		PrintWriter out=reponse.getWriter();*/
		/*int no1=Integer.parseInt(no);
		int marks1=Integer.parseInt(marks);
		
		try {
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?)");
			pstmt.setInt(1, no1);
			pstmt.setString(2, name);
			pstmt.setInt(3, marks1);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*out.println(no);
		out.println(name);
		out.println(marks);*/
	}
	
	public void destroy() {
		System.out.println("in destroy");
	}
}
