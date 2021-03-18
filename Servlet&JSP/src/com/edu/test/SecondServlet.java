package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("SecondServlet!!");
		
		//출력
		PrintWriter out=resp.getWriter();
		out.print("<html><head><title>Test</title></head>");
		out.print("<body><h1>hava a nice day!</h1></body>");
		out.print("</html>");
		out.close();
	}
	
}
