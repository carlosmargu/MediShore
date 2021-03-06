
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Medico</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="Css/background.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </head>

    <body style="background-color: lightblue;">

        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">MEDISHORE</a>
                </div>
                <ul class="nav navbar-nav navbar-right">
                     <li><a href="index.html"><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
                 </ul>
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Calendario
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="VerCitasMedico.html">Ver Citas</a></li>
                            <li><a href="medico?medico=${user.login}.html">Agregar Disponibilidad</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Consulta
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="Ingresarcita.html">Ingresar Cita</a></li>
                            <li><a href="Buscarhistoria.html">Ver Historia Clinica</a></li>
                            <li><a href="/vertodash">Ver todas Historias Clinicas</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Personal
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="Verhistorial.html">Historial Citas</a></li>
                        </ul>
                    </li>
                    
                </ul>
            </div>
        </nav> 
    </body>

</html>