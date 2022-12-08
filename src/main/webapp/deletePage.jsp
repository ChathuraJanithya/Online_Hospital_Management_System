<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/admit.css" id="stylesheet">
<title>Discharge | Page </title>
</head>
<body>
	<% 
	String pid = request.getParameter("pid");
	String name = request.getParameter("name");
	String nic = request.getParameter("nic");
	String contact = request.getParameter("contact");
	String age = request.getParameter("age");
	String medical_unit = request.getParameter("medical_unit");
	String date = request.getParameter("date");
	String ward_Id = request.getParameter("ward_Id");
	%>
	
	<div id="admit">
 <form action="delete" method="post">
        <h1>Edit patient data</h1>
        <input type="text" name="pid" value="<%= pid %>" placeholder="Patient ID" style="color:black; " readonly />
        <input type="text" name="name" value="<%= name %>" placeholder="Patient Name" readonly />
        <input type="text" name="nic" value="<%= nic %>" placeholder="NIC / Passport" readonly />
        <input
          type="tel"
          name="contact"
          value="<%= contact %>"
          placeholder="contact Number"
          readonly
        >
        <input type="text" name="age" value="<%= age %>" placeholder="age" readonly />
        <button
          id="med"
          disabled
          style="
            width: 360px;
            margin-bottom: 10px;
            background-color: DodgerBlue;
            border: none;
          "
        >
          Medical unit
        </button>
        <br />
        <br />
        <select name="medical_unit" value="<%= medical_unit %>" id="medselect">
        </select>
        <input type="date" name="date" value="<%= date %>" placeholder="Date " style="color:black;" readonly />
        <input
          type="text"
          id="ward"
          name="ward_Id"
          value="<%= ward_Id %>"
          placeholder="ward ID"
          readonly
        />
        <br /><br />
        
        <button type="submit" name ="submit" style="margin-bottom: 10px"> delete </button>

        <br />
        <h5><a href="recDashboard.jsp" style="color: blue"> Back to dashboard</a></h5>
      </form>
      </div>
	

</body>
</html>