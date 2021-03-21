package com.edu.test;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FlowFilterOne implements Filter{
	//필터 사용하려면 web.xml에 mapping 필요함
	
	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("init() 호출 ...... one");
		//필터 객체 생성 시 한 번 수행되는 초기화 코드
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter 호출 전 ...... one");
		//서블릿 수행 전에 수행할 코드
		chain.doFilter(request, response);
		System.out.println("doFilter 호출 후 ...... one");
		//서블릿 수행 후에 수행할 코드
		
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy 호출 ...... one");
		//필터 객체 해제 시 한 번 수행되는 해제 코드
	}
	
	

}
