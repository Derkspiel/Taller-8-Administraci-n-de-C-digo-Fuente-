<?php
session_start();
include "db_conn.php";

if(isset($_POST['email']) && isset($_POST['password'])){
	
	function validate($data){
		$data =	trim($data);
		$data =	stripcslashes($data);
		$data =	htmlspecialchars($data);
		return $data;
	} 
	
	$email = validate($_POST['email']);
	$pass = validate($_POST['password']);
	
	if(empty($email)){
		header ("Location: index.php?error= El Correo es Requerido"); 	
		exit;
	}else if(empty($pass)){
		header ("Location: index.php?error= La Contraseña es Requerida"); 	
		exit;
		
	}else{

		$usu = "SELECT * FROM usuario WHERE correo='$email' AND contra='$pass'";
		$result = mysqli_query($conn, $usu);
		
		if(mysqli_num_rows($result)===1){
			$row= mysqli_fetch_assoc($result);
			if($row['correo'] === $email && $row['contra'] === $pass){
				$_SESSION['iD'] = $row['iD'];
				$_SESSION['nombre'] = $row['nombre'];
				$_SESSION['apellido'] = $row['apellido'];
				$_SESSION['cedula'] = $row['cedula'];
				$gen = $row['genero_Id'];
				$rol = $row['rol_Id'];
				
				$usu = "SELECT * FROM géneros WHERE iD= '$gen'";
				$result = mysqli_query($conn, $usu);
				if(mysqli_num_rows($result)===1){
					$row= mysqli_fetch_assoc($result);
					if($row['iD'] === $gen){
						$_SESSION['Genero'] = $row['Genero'];
					}
				}
				$usu = "SELECT * FROM roles WHERE iD= '$rol'";
				$result = mysqli_query($conn, $usu);
				if(mysqli_num_rows($result)===1){
					$row= mysqli_fetch_assoc($result);
					if($row['iD'] === $rol){
						$_SESSION['rol'] = $row['rol'];
					}
				}if($rol == 1){
					header ("Location: user.php");
				}else if($rol == 2){
					header ("Location: admin.php");
				}else{
					header ("Location: main.php");
				}
				exit();
			}else{
				header("Location: index.php?error=Usuario o Contraseña Incorrecta");
				exit();
			}
		}else{
			header("Location: index.php?error=Usuario o Contraseña Incorrecta");
			exit();
		}
	}
}else{
	header("Location: index.php?error=Usuario o Contraseña Incorrecta");
}