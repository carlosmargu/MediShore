<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Medico-Disponibilidad</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="Css/background.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" ></script>

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
                            <li><a href="Buscarhistoria.html">Ver todas las Historias Clinicas</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Personal
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="Historialcitas.html">Historial Citas</a></li>
                        </ul>
                    </li>
                </ul>
				
            </div>
        </nav>
		<div id="formUsuario">
                   <center>                 
                    <h3><b>Agregue sus horas por dia</b></h3>
                    <form action="agendar" method="GET">
                        <input type="text" class="campos" name="fecha" placeholder="DD:MM:AA" required="required"
                            maxlength="5" /><br>
                        Franja 1:
                        <br>
                        <input type="text" class="campos" name="horaI" placeholder="HH:MM" required="required"
                            maxlength="5" />
                        <input type="text" class="campos" name="horaF" placeholder="HH:MM" required="required"
                            maxlength="5" />
                        <br>
                        Franja 2:
                        <br>
                        <input type="text" class="campos" name="horaI2" placeholder="HH:MM" required="required"
                            maxlength="5" />
                        <input type="text" class="campos" name="horaF2" placeholder="HH:MM" required="required"
                            maxlength="5" />
                        <br>
						<br>
                        <input type="submit" class="btn btn-success" value="Registrar" />
                        <br>
                        <br>
                        <br>
                    </form>
                </div>		</center>
    </body>

</html>