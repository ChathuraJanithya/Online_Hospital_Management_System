<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
  
    <title>Patient Admission</title>
    <link rel="icon" type="image/jpg" href="../images/comp_logo.jpg" />
    <link rel="stylesheet" type="text/css" href="css/admit.css" />
  </head>
  <body>
    <!-- <center class="img"><a href="#"><img src="#" id="header"></a></center> -->
    <br />
    <div id="admit">
      <form action="insert" method="post">
        <h1>Admission form</h1>
        <input type="text" name="name" placeholder="Patient Name" required />
        <input type="text" name="nic" placeholder="NIC / Passport" required />
        <input
          type="tel"
          name="contact"
          placeholder="contact Number"
          required
        />
        <input type="text" name="age" placeholder="age" required />
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
        <select name="MedicalUnit" id="medselect">
          <option value="nicu">Neonatal intensive care units (NICUs)</option>
          <option value="picu">Pediatric intensive care units (PICUs)</option>
          <option value="ccu">
            Coronary care and cardiothoracic units (CCUs/CTUs)
          </option>
          <option value="icu">
            Long term intensive care units (LTAC ICUs)
          </option>
          <option value="micu">Medical intensive care units (MICUs)</option>
        </select>
        <input type="date" name="date" placeholder="Date " required />
        <input
          type="text"
          id="ward"
          name="wardId"
          placeholder="ward ID"
          required
        /><br /><br />
        <button type="submit" style="margin-bottom: 10px">Admit</button>

        <br />
        <h5><a href="#" style="color: blue"> Back to dashboard</a></h5>
      </form>
    </div>
    <br /><br />

    <br />
  </body>
  <footer></footer>
</html>