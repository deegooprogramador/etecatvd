<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    @vite(['resources/sass/app.scss', 'resources/js/app.js'])

    <title>Celke</title>
</head>

<body>


<header>
    <div class="header-container">
        <a href="/" class="logo">
        <img src="https://conteudo.imguol.com.br/2012/11/26/logomarca-remete-o-numero-11-utilizado-pelo-craque-no-santos-e-na-selecao-brasileira-1353961569070_300x300.jpg" alt="Logo" width="40" height="32">
        </a>

        <nav>
            <ul>
                <li><a href="{{ route('user.index') }}">Home</a></li>
                <li><a href="{{ route('user.index') }}">Usuários</a></li>
            </ul>
        </nav>

        <div class="login-btn">
            <button type="button">Login</button>
        </div>
    </div>
</header>

<div class="content-container">
    @yield('content')
</div>


</body>

</html>

