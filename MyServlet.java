package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse respond) throws ServletException,IOException{
		
		PrintWriter out=respond.getWriter();
		out.print("i am in doGet() method for browser");
		
		//backend code
		System.out.print("i am in doGet() method");
	}
	
}
