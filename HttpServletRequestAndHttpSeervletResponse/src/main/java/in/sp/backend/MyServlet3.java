package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/aaa")
public class MyServlet3 extends HttpServlet{
	
	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException
	{
		
		try {
			String name=req.getParameter("name1");
			String email=req.getParameter("email1");
			
			System.out.println("Name: "+name);
			System.out.println("Eamil: "+email);
			
			PrintWriter out = res.getWriter();
			out.print("WelCome "+name+"\n");
			out.print("Email: "+email);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
