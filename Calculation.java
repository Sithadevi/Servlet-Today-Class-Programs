

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculation
 */
@WebServlet("/Calculation")
public class Calculation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//converting string request into integer
		
		int number1=Integer.parseInt(request.getParameter("num1"));
		int number2=Integer.parseInt(request.getParameter("num2"));
		
		//name of button is clac and getting value of that button
		String Calculation=request.getParameter("calc");
		System.out.println("you have clicked"+Calculation +"button");
		
		int result=0;
		if(Calculation.equalsIgnoreCase("add"))
		{
			result=number1+number2;
			out.print("Result of add="+result);
		}
		else if(Calculation.equalsIgnoreCase("sub"))
		{
			result=number1-number2;
			out.print("Result of sub="+result);
		}
		else if(Calculation.equalsIgnoreCase("div"))
		{
			result=number1/number2;
			out.print("Result of div="+result);
		}
		else if(Calculation.equalsIgnoreCase("mul"))
		{
			result=number1*number2;
			out.print("Result of mul="+result);
		}
	}

}
