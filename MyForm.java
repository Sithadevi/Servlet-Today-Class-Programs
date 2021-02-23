

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyForm
 */
@WebServlet("/MyForm")
public class MyForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("Hello you have called the server from the client...<br>");
		String firstName=request.getParameter("fname");
		String lastName=request.getParameter("lname");
		
		out.print("Your firstName"+firstName+"<br>");
		out.print("Your last Name"+lastName+"<br>");
		System.out.println("Service is called");
	}
	MyForm()
	{
		System.out.println("This is constructor");
	}
	public void Init(ServletConfig config)throws ServletException
	{
		System.out.println("Init is called");
	}
	public void destroy()
	{
		System.out.println("destroy is called");
	}
}
