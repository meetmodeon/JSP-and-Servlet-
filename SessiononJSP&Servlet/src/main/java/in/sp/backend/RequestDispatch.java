package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/submit")
public class RequestDispatch extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myemail=req.getParameter("email1");
		String myname=req.getParameter("name1");
		String mypass=req.getParameter("pass1");
		String mylogin=req.getParameter("Login");
		PrintWriter out=resp.getWriter();
		if(myemail.equals("meetyadav@gmail.com")&& mypass.equals("123456789")) {
//			req.setAttribute("name_key",myname);
			
			HttpSession session=req.getSession();
			session.setAttribute("name_key", myname);
			
			RequestDispatcher rd=req.getRequestDispatcher("/profile.jsp");
			rd.forward(req,resp);
		}
		else {
			resp.setContentType("text/html");
			out.print("<h5 style='color:red'>Email id and password didnt matched</h5>");
			RequestDispatcher rd=req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
	}

}
