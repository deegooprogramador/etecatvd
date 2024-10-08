/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.excecoes.erros;

/**
 *
 * @author debor
 */
public class ErroBancoDados extends Exception{
    public ErroBancoDados(String message) {
        super(message);
    }

    public void gerarExcecao() throws ErroBancoDados {
        throw new ErroBancoDados("Erro: Falha ao acessar o banco de dados.");
    }
}
