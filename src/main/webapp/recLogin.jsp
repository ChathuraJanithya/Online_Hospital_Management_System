<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
 <head>
    <meta charset="utf-8" />
    <title>Receptionist Login</title>
    <link rel="stylesheet" href="css/recLogin.css" />
  </head>
  <body>
    <div class="logoo">
      
         <center> <a href="#"><img src="Img/projectLogo.png" id="header" /></a>  </center> 
     
    </div>
    <div class="center">
      <h1>Receptionist | Login</h1>

      <form  action="log" method="post">
        <div class="txt_field">
          <label for="uname">Receptionist Username</label>
          <input
            type="text"
            name="uname"
            placeholder="ex: jone doe"
          required />
        </div>
        <div class="txt_field">
          <label for="password">Password</label>
          <input type="password" name="password" placeholder="ex: jonedow123" required />
        </div>
        <input type="submit" value="Login" />
      </form>
    </div>
  </body>
</html>