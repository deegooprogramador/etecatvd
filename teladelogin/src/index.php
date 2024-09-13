<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tela de Login</title>
    <style>
        body{
            background-color: cyan;
        }
        h1{
            text-align: center;
            font-family:Century;
        }
        form{
            text-align: center;
            font-family:Century;
        }
        input.usuário{
            border: solid gold;
            border-radius: 5px;
            font-family:Century;
            background-color: grey;
        }
        input.senha{
            border: solid gold;
            border-radius: 5px;
            font-family:Century;
            background-color: gray;
        }
        input.botão{
            border: solid gold;
            border-radius: 5px;
            background-color: grey;
            font-family:Century;
        }
    </style>
</head>
<body>
    <h1>Tela de cadastro</h1>

    <form action=".\models\autenticador.php" method="post">
        <label for="usuário">Usuário:</label>
        <input type="text" name="usuário" id="usuário" class="usuário">

        <br>
        <br>

        <label for="senha">Senha:</label>
        <input type="password" name="senha" id="senha" class="senha">

        <br>
        <br>

        <input type="submit" value="enviar" class="botão">
    </form>
</body>
</html>