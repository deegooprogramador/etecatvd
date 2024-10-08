/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.excecoes.erros;

/**
 *
 * @author debor
 */
public class OperacaoInvalida extends Exception{
    public OperacaoInvalida(String message) {
        super(message);
    }

    public void gerarExcecao() throws OperacaoInvalida {
        throw new OperacaoInvalida("Erro: A operação solicitada é inválida.");
    }
}
