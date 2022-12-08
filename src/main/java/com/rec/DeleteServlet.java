package com.rec;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String pid = request.getParameter("pid");
		
		boolean isTrue;
		
		isTrue = RecDBUtil.deleteData(pid);
		
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Patient data deleted successfully');");
			out.println("location = 'recDashboard.jsp'");
			out.println("</script>");
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Patient delete process failed');");
			out.println("location = 'recDashboard.jsp'");
			out.println("</script>");
		}
		
	}

}
