package com.rec;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PatientInsert
 */
@WebServlet("/PatientInsert")
public class PatientInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String name = request.getParameter("name");
		String nic = request.getParameter("nic");
		String contact = request.getParameter("contact");
		String age = request.getParameter("age");
		String MedicalUnit = request.getParameter("MedicalUnit");
		String date = request.getParameter("date");
		String wardId = request.getParameter("wardId");
		
		boolean isTrue;
		
		isTrue = RecDBUtil.insertPatient(name, nic, contact, age, MedicalUnit, date, wardId);
		
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Patient admitted');");
			out.println("location = 'recDashboard.jsp'");
			out.println("</script>");

		}
		
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Patient admission failed');");
			out.println("location = 'admit.jsp'");
			out.println("</script>");
			//RequestDispatcher dis2 = request.getRequestDispatcher("admit.jsp");
			//dis2.forward(request, response);
			
		}
	}

}
