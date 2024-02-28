package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.PublicKey;

import javax.management.loading.PrivateClassLoader;

import org.apache.catalina.ant.jmx.Arg;
import org.apache.jasper.runtime.ProtectedFunctionMapper;
import org.apache.tomcat.jakartaee.bcel.util.Args;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet{
	@Override
	protected void service (HttpServletRequest request,HttpServletResponse respond) throws ServletException,IOException{
		
		PrintWriter out=respond.getWriter();
		out.print("i am in doGet() method for browser");
		
		//backend code
		System.out.println("i am in the Registration");
		System.out.println("My name is khan");
		}

}
