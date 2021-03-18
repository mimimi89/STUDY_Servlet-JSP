package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("ThirdServlet!!");
		
		//한글 출력
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out=resp.getWriter();
		out.print("<h1>좋은 하루!!</h1>");
		out.close();
	}
	
}
