package in.sp.backend;

import java.io.IOException;

import javax.sound.midi.Soundbank;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mylogin")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myemail=(String) req.getParameter("name");
		String myPass=(String) req.getParameter("password");
		
		if(myemail.equals("meetyadav@gmail.com")&&myPass.equals("Lumad&786")) {
		
			System.out.println("success");
		}
		else {
			System.out.println("Failed");
		}
	}

}
