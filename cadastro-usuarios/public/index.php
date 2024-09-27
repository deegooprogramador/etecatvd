<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Usuários</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h1>Formulário de Cadastro</h1>
    <form action="index.php" method="POST">
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" required><br><br>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>
        
        <label for="senha">Senha:</label>
        <input type="password" id="senha" name="senha" required><br><br>
        
        <label for="produto">Produto de Interesse:</label>
        <input type="text" id="produto" name="produto" required><br><br>
        
        <input type="submit" value="Cadastrar">
    </form>

    <?php
    require '../vendor/autoload.php';

    use App\User;

    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        $nome = $_POST['nome'];
        $email = $_POST['email'];
        $senha = $_POST['senha'];
        $produto = $_POST['produto'];

        $user = new User();
        if ($user->create($nome, $email, $senha, $produto)) {
            echo "Usuário cadastrado com sucesso!";
        } else {
            echo "Erro ao cadastrar o usuário.";
        }
    }
    ?>
</body>
</html>
