package com.example.provawagner.model;

import jakarta.validation.constraints.NotBlank;


public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String nome, Integer idade, String endereco, String telefone, String cpf, String email, String matricula) {
        super(nome, idade, endereco, telefone, cpf, email);
        this.matricula = matricula;
    }

    @NotBlank
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}