<?php
session_start();
if(isset($_SESSION['iD']) && isset($_SESSION['nombre'])){
?>
<html>

<head>
	<meta charset="utf-8">
	<link rel="shortcut icon" href="img/S.png">   
	<link rel="stylesheet" href="E.css">
	<title><?php echo $_SESSION['rol']; ?></title>
</head>

<body>
	<div id="contenedor">
		<div id="contenedorcentrado" >
			<div id="derecho">
				<h1><center> 
					Bienvenido, 
					<?php echo $_SESSION['nombre']; ?> 
					<?php echo $_SESSION['apellido']; ?> 
					<?php echo $_SESSION['Genero'] ?> 
				</center></h1>
				<hr>
				<center><h2>
					<a href="">Mi Computadora</a>&nbsp; / &nbsp;
					<a href="">Finanzas</a>&nbsp; / &nbsp;
					<a href="">Contactanos</a>
				</h2></center>
				<hr>
				<img src="img/S2.png" width="500px" height ="300px">
				<hr>
				<h2><center><a href="logout.php">Cerrar Sesion</a></center></h2>
				<address align="left">Creado el 06 de Noviembre de 2021<br>
				por Jesus Rafael Lugo Ramirez.</address><br>
			</div>
		</div>	
	</div>				
</body>
</html>	
<?php
}else{
	header("Location: index.php");  
	exit();
}
?>
