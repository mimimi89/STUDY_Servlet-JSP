package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/urlInfo")
public class URLInfoServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("URLInfoServlet!!");
		
		//5.URL 정보
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<head><title>Request 정보 출력</title></head>");
		out.print("<body>");
		out.print("<h3>요청 방식과 프로토콜 정보</h3>");
		out.print("Request URI(클라이언트가 요청한 문서 정보) : "+req.getRequestURI()+"<br/>");
		out.print("Request URL(클라이언트가 요청한 문서 전체 정보) : "+req.getRequestURL()+"<br/>");
		out.print("Context Path(웹 애플리케이션 경로) : "+req.getContextPath()+"<br/>");
		out.print("Request Protocol(프로토콜 구체 정보) : "+req.getProtocol()+"<br/>");
		out.print("Servlet Path(서블릿 경로) : "+req.getServletPath()+"<br/>");
		out.print("</body></html>");
		out.close();
	}
	
}
