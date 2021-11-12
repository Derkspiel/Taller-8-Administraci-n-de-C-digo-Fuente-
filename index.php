<html>
<head>
	<meta charset="utf-8">
	<link rel="shortcut icon" href="img/L.png">   
	<link rel="stylesheet" href="E.css">
	<title>LOGIN</title> 
</head>
<body>
	<div id="contenedor">
		<div id="contenedorcentrado">
			<div id="login">
				<form action="login.php" method="post">
					<center><h1>LOGIN</h1></center>
					<?php if(isset($_GET['error'])){?>
					<p class="error"><?php echo $_GET['error'];?></p>
					<?php }?>
				
					<label>Usuario</label>
					<input type="text" name = "email" placeholder="Usuario"><br>
			
					<label>Contraseña</label>
					<input type="password" name = "password" placeholder="Password"><br>
					<button type = "submit">LOGIN</button>
				</form>
			</div>
			<div id="derecho">
				<div class="titulo">
					<center>Bienvenido<br>
					Usuario<center>
				</div>
				<hr>
				<div class="pie-form">
					Portal de Entrada a PC Repair
				</div>
			</div>
		</div>
	</div>
</body>
</html>	