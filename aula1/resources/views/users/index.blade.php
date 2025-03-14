@extends('layouts.admin')

@section('content')
    <div class="table">

        <div class="card-header hstack gap-2">
            
            <span>
                <a class="ngt">Usuários</a> 
            </span>

            <span>
                <a href="{{ route('user.create') }}" class="btna">Cadastrar</a>
            </span>
        </div>

        <div class="table2">

            <x-alert />

            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Nome</th>
                        <th scope="col">E-mail</th>
                        <th scope="col" class="text-center">Ações</th>
                    </tr>
                </thead>
                <tbody>

                    @forelse ($users as $user)
                        <tr>
                            <th>{{ $user->id }}</th>
                            <td>{{ $user->name }}</td>
                            <td>{{ $user->email }}</td>
                            <td class="text-center">
                                <a href="{{ route('user.show', ['user' => $user->id]) }}"
                                    class="btna">Visualizar</a>
                                <a href="{{ route('user.edit', ['user' => $user->id]) }}"
                                    class="btna">Editar</a>
                                <form method="POST" action="{{ route('user.destroy', ['user' => $user->id]) }}"
                                    class="d-inline">
                                    @csrf
                                    @method('delete')
                                    <button type="submit" class="btns"
                                        onclick="return confirm('Tem certeza que deseja apagar este registro?')">Apagar</button>
                                </form>
                            </td>
                        </tr>
                    @empty
                    @endforelse
                </tbody>
            </table>
        </div>
    </div>
@endsection
