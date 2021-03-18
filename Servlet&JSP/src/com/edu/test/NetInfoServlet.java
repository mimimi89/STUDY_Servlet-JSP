package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/netInfo")
public class NetInfoServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("NetInfoServlet!!");
		
		//4.네트워크 정보
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<head><title>Request 정보 출력</title></head>");
		out.print("<body>");
		out.print("<h3>네트워크 관련 요청 정보</h3>");
		out.print("Request Scheme(요청 시 사용한 프로토콜 이름) : "+req.getScheme()+"<br/>");
		out.print("Server Name : "+req.getServerName()+"<br/>");
		out.print("Server Address(요청받은 서버의 ip) : "+req.getLocalAddr()+"<br/>");
		out.print("Server Port : "+req.getServerPort()+"<br/>");
		out.print("Client Address(클라이언트의 ip) : "+req.getRemoteAddr()+"<br/>");
		out.print("Client Host : "+req.getRemoteHost()+"<br/>");
		out.print("Client Port : "+req.getRemotePort()+"<br/>");
		out.print("</body></html>");
		out.close();
	}
	
}
