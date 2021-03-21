package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/context1") 
public class ServletContextTest1Servlet extends HttpServlet{
	/*
	 * init() 메소드를 재정의하여 ServletContext(웹 애플리케이션 단위로 정보를 서버 쪽에 유지할 수 있는 방법) 객체의 주소를 추출하는 방법
	ServletContext sc;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		sc=config.getServletContext();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out=resp.getWriter();
		out.print("Context : "+sc);
		out.close();
		
	}
	*/
	//HttpServlet객체를 이용하여 ServletContext 주소를 추출하는 방법
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out=resp.getWriter();
		
		ServletContext sc=this.getServletContext();
		String location=sc.getInitParameter("contextConfig");
		out.print("location : "+location);
//		out.print("Context : "+sc);
		out.close();
		
	}
	
	

}
