

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginChecking
 */
@WebServlet("/LoginChecking")
public class LoginChecking extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String UserName=request.getParameter("UserName");
		String Password=request.getParameter("Password");
		if(Password.equals("admin") && UserName.equals("admin"))
		{
			out.print("you are logged in");
		}
		else
		{
			out.print("userName and Password is wrong");
		}
	}
}
