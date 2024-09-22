/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaoescolamusica;

/**
 *
 * @author debor
 */
class Professor extends Pessoa implements Identificavel {
    private String registroFuncional;

    public Professor(String nome, int idade, String registroFuncional) {
        super(nome, idade);
        this.registroFuncional = registroFuncional;
    }

    @Override
    public String atividade() {
        return nome + " (Professor) está ensinando os acordes do violino nas aulas.";
    }

    @Override
    public String getId() {
        return "Registro Funcional: " + registroFuncional;
    }
}