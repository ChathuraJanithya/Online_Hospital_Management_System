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
 * Servlet implementation class UpdatePatientServlet
 */
@WebServlet("/UpdatePatientServlet")
public class UpdatePatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String pid = request.getParameter("pid");
		String name = request.getParameter("name");
		String nic = request.getParameter("nic");
		String contact = request.getParameter("contact");
		String age = request.getParameter("age");
		String medical = request.getParameter("medical_unit");
		String date = request.getParameter("date");
		String ward_Id = request.getParameter("ward_Id");
		
		boolean isTrue;
		
		isTrue = RecDBUtil.updateData(pid, name, nic, contact, age, medical, date, ward_Id);
		
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Patient data Updated');");
			out.println("location = 'recDashboard.jsp'");
			out.println("</script>");
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Patient data update failed');");
			out.println("location = 'recDashboard.jsp'");
			out.println("</script>");
		}
		
		
	}

}
