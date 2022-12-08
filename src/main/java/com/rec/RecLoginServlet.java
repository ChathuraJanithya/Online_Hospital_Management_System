package com.rec;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RecLoginServlet
 */
@WebServlet("/RecLoginServlet")
public class RecLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("uname"); // catching data
		String password = request.getParameter("password");
		
		boolean isTrue;
		isTrue = RecDBUtil.loginValidate(username, password);
		
		if(isTrue == true) {
			
			
			try {
			List<Receptionist> recDetails = RecDBUtil.validate(username, password); //pass to the DBUtil from the jsp
			request.setAttribute("recDetails", recDetails);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			//navigate to 
			RequestDispatcher dis = request.getRequestDispatcher("recDashboard.jsp");
			dis.forward(request, response);
			
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('user name or password Invalid');");
			out.println("location = 'recLogin.jsp'");
			out.println("</script>");
		}


	}

}
