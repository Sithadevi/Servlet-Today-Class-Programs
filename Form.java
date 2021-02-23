

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form
 */
@WebServlet("/Form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		String Age=request.getParameter("age");
		String Gender=request.getParameter("gender");
		String Hobbies[]=request.getParameterValues("Hobbies");
		
		out.print("hobbies you have selected:"+"<br>");
		for(String values:Hobbies)
		{
			out.print(values+"<br>");
		}
	}

}
