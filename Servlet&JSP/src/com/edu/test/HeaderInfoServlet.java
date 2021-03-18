package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/headerInfo")
public class HeaderInfoServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HeaderInfoServlet!!");
		
		//6.모든 헤더 정보
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<head><title>Request 정보 출력</title></head>");
		out.print("<body>");
		out.print("<h3>요청 헤더 정보</h3>");
		Enumeration<String> em=req.getHeaderNames();
		while(em.hasMoreElements()) {
			String s=em.nextElement();
			out.print(s+" : "+req.getHeader(s)+"<br/>");
		}
		out.print("</body></html>");
		out.close();
	}
	
}
