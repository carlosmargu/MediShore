<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Paciente</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="Css/background.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    </head>

    <body style="background-color: lightblue;">

        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="homeMedico.jsp">MEDISHORE</a>
                </div>
                 <ul class="nav navbar-nav navbar-right">
                     <li><a href="index.html"><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
                 </ul>
                <ul class="nav navbar-nav">

                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Opciones
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="paciente?paciente=${usuario.login}">Agendar Cita</a></li>
                            <li><a href="VerCitasPaciente.html">Ver Citas</a></li>
                            <li><a href="Verhistorial.html">Ver Historial</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav> 
        <div id="formUsuario">
            <h3>Ingrese la fecha para ver disponibilidad</h3>
            <form action="vercitas" method="GET">
                <input type="text" class="campos" name="fecha" placeholder="fecha" required="required"
                        />
                <br></br><input type="submit" class="btn btn-success" value="Buscar" />
            </form>
        </div>


    </body>
</html>
