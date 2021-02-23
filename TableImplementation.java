

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TableImplementation
 */
@WebServlet("/TableImplementation")
public class TableImplementation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int table=Integer.parseInt(request.getParameter("table"));
		int range=Integer.parseInt(request.getParameter("range"));
		for(int i=1;i<=range;i++)
		{
			
			out.print(table+" * "+i+"="+table*i);
			out.print("<br>");
		}
		
	}

}
