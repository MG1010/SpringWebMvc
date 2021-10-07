// OBSOLETE
//package com.weblogic.jee;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet(urlPatterns = "/login")
//public class LoginServlet extends HttpServlet {
//	
//	private UserLoginValidation loginValidation = new UserLoginValidation();
//	
//	@Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);	
//	}
//	
//	@Override
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		Boolean isUserValid = loginValidation.isUserValid(username, password); // User credentials validation
//		
//		if(isUserValid){
//			request.setAttribute("username", username);
//			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
//		}
//		else{
//			request.setAttribute("errorMessage", "Invalid Credentials");
//			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
//		}
//			
//		}
//	
//}