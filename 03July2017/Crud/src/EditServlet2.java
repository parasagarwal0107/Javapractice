

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/EditServlet2")
public class EditServlet2 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String sid=request.getParameter("ID");
		int ID=Integer.parseInt(sid);
		String Name=request.getParameter("Name");
		String Password=request.getParameter("Password");
		String Email=request.getParameter("Email");
		String Country=request.getParameter("Country");
		
		Emp e=new Emp();
		e.setID(ID);
		e.setName(Name);
		e.setPassword(Password);
		e.setEmail(Email);
		e.setCountry(Country);
		
		int status=EmpDao.update(e);
		if(status>0){
			response.sendRedirect("ViewServlet");
		}else{
			out.println("Sorry! unable to update record");
		}
		
		out.close();
	}

}
