package com.rec;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PatientViewServlet
 */
@WebServlet("/PatientViewServlet")
public class PatientViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Patient> patientDetails = RecDBUtil.readData();
		request.setAttribute("patientDetails", patientDetails);
		
		RequestDispatcher dis = request.getRequestDispatcher("PatientView.jsp");
		dis.forward(request, response);
	}

}
