package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class login extends HttpServlet{
	@Override
	protected void service (HttpServletRequest request,HttpServletResponse respond) throws ServletException,IOException{
		
		PrintWriter out=respond.getWriter();
		out.print("i am in login method for browser");
		
		//backend code
		System.out.println("i am in login ");
	}
	

}
