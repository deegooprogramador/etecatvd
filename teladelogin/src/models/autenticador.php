<?php

include ('.\..\..\vendor\autoload.php');
use APP\models\Usuario;

$usuario = $_POST['usuário'];
$senha = $_POST['senha'];

$usuarioo = new usuario($usuario, $senha);
if ($usuario == "admin" && $senha == "admin123"
){echo "<script>alert('Login com sucesso')</script>";}else {
    echo "<script>alert('Login ou senha incorretos')</script>";
}

var_dump($usuarioo);
?>