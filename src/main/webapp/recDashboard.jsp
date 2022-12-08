<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
    <head>
        <title>Receptionist  |  dashboard</title>
        <link rel="icon" type="image" href="images/Favicon.png">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <link rel="stylesheet" href="reDashboard.css" id="stylesheet">
    </head>

    <body>

        <!-- Navigation panel -->
        <nav>

          
            <!-- Profile icon  and logout -->

            <div id="profile">
                <img src="Img/profile.png " alt="profile" height="50px">
            </div>
            <div id="logout"> 
                <a href="recLogin.jsp"><button class="btn btn-dark">Logout</button></a>
                
             </div>

        </nav>
        
        <!-- Dashboard -->
        <div class="topmain" style="text-align:center;">
        <h2 style="align-items:center; text-align:center;">
        	<c:forEach var="rec" items="${recDetails}"> 

			
          <center> Hello ${rec.user_name} </center>
			
        
       	 </c:forEach>
        </h2>
         <br>
         <h3>
        Dashboard   </h3>
    </div>
        <center>
        

        
            <section id="dashboard">
                <h2> <!-- Hello Name --></h2>
                <hr>
                <a href="admit.jsp"><button>admit patient</button></a>
                <br>
                <form action="View" method="post">
                <button>View Patient</button>
                <br>
                </form>
                <form action="DView" method="post">
                <a href="#"><button >Patient discharge</button></a>
                </form>
                <br></br>
            </section>
      </center> 

        <br><br><br><br><br>

        <!-- Footer -->
        <footer>
           
        </footer>

    </body>
</html>