/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaoescolamusica;

/**
 *
 * @author debor
 */
class Funcionario extends Pessoa implements Identificavel {
    private String cracha;

    public Funcionario(String nome, int idade, String cracha) {
        super(nome, idade);
        this.cracha = cracha;
    }

    @Override
    public String atividade() {
        return nome + " (Funcionário) está realizando funções designadas a sua área.";
    }

    @Override
    public String getId() {
        return "Crachá: " + cracha;
    }
}
