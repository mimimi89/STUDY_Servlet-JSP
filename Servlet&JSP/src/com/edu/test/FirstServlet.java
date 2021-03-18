package com.edu.test;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/hello2")
//web.xml에 mapping하거나 annotation 사용 
public class FirstServlet extends HttpServlet {
	
	//servlet 실행순서 
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() 실행됨!");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("service() 실행됨!");
	}
	
}
