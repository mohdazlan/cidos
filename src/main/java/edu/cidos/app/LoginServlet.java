package edu.cidos.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>CIDOS Login Page</title></head><body>");
		out.println("<center>Welcome to Center for eLearning And Teaching<center>");
		out.println("<hr>");
		out.println("<img width='150' src='https://polycc.cidos.edu.my/assets/media/auth/agency-dark.png'>");
		out.println("<h1 style='color:red'>Sign In</h1>");
		out.println("<input type='text'><br> ");
		out.println("<input type='password'><br> ");
		out.println("<input type='submit' value='Sign-In'> ");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
