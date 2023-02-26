package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String sub = req.getParameter("subject");
		String tandc = req.getParameter("tandC"), mail=req.getParameter("email");
		PrintWriter p = res.getWriter();
		if(tandc==null) {
			p.println("not registered, please accept");
		}else {
			p.print("name "+name+"\nemail: "+mail+"\nsubject: "+sub+"\ngender: "+gender);
		}
		
	}
}
