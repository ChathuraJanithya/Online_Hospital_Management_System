<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<link rel="stylesheet" href="css/PatientView.css" id="stylesheet">
<meta charset="UTF-8">
<title>Delete | View</title>
</head>
<body>

 <div class="logoo">
      <center>
        <a href="#"><img src="#" id="header" /></a>
      </center> 
    </div>
    

      <h1 style="text-align:left;">-- Patient Data --</h1>
    
    
<table class="table table-striped">
 	<tr>
 	<th class="table-dark">Patient ID</th>
 	<th class="table-dark">Patient Name </th>
 	<th class="table-dark">NIC</th>
 	<th class="table-dark">Contact</th>
 	<th class="table-dark">Age</th>
 	<th class="table-dark">Medical_Unit</th>
 	<th class="table-dark">Date</th>
 	<th class="table-dark">Ward_NO</th>
 	<th class="table-dark"> </th>
 	</tr>	

 	<c:forEach var="pat" items="${patientDetails}">
 	
 	 	<c:set var="pid" value="${pat.pid}"/>
 		<c:set var="name" value="${pat.name}"/>
 		<c:set var="nic" value="${pat.nic}"/>
 		<c:set var="contact" value="${pat.contact}"/>
 		<c:set var="age" value="${pat.age}"/>
 		<c:set var="medical_unit" value="${pat.medical_unit}"/>
 		<c:set var="date" value="${pat.date}"/>
 		<c:set var="ward_Id" value="${pat.ward_Id}"/> 	
 		
		<tr>
	 	<td class="table-secondary">${pat.pid}</td> 
	 	<td class="table-secondary">${pat.name}</td> 
	 	<td class="table-secondary">${pat.nic}</td>
	 	<td class="table-secondary">${pat.contact}</td>
	 	<td class="table-secondary">${pat.age}</td>
	 	<td class="table-secondary">${pat.medical_unit}</td>
	 	<td class="table-secondary">${pat.date}</td>
	 	<td class="table-secondary">${pat.ward_Id}</td>
	 	
	 	<c:url value= "deletePage.jsp" var="pDelete"> 
	 	 	<c:param name="pid" value="${pid}" ></c:param>
	 	 	<c:param name="name" value="${name}" ></c:param>
	 	 	<c:param name="nic" value="${nic}" ></c:param>
	 	 	<c:param name="contact" value="${contact}" ></c:param>
	 	 	<c:param name="age" value="${age}" ></c:param>
	 	 	<c:param name="medical_unit" value="${medical_unit}" ></c:param>
	 	 	<c:param name="date" value="${date}" ></c:param>
	 	 	<c:param name="ward_Id" value="${ward_Id}" ></c:param>
	 	 </c:url>
	 	<td class="table-secondary"> <a href="${pDelete}"> <button class="btn btn-danger">  Delete  </button> </a>  </td>
	 	
 	</tr>
	</c:forEach>
	 	 	</table>

</body>
</html>