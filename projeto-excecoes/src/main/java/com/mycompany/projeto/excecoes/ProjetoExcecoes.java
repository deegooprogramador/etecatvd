/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto.excecoes;

import com.mycompany.projeto.excecoes.erros.ErroBancoDados;
import com.mycompany.projeto.excecoes.erros.OperacaoInvalida;
/**
 *
 * @author debor
 */
public class ProjetoExcecoes {

    public static void main(String[] args) {
        OperacaoInvalida operacaoInvalida = new OperacaoInvalida("");
        ErroBancoDados erroBancoDados = new ErroBancoDados("");

        try {
            operacaoInvalida.gerarExcecao();
        } catch (OperacaoInvalida e) {
            System.out.println("Capturado: " + e.getMessage());
        }

        try {
            erroBancoDados.gerarExcecao();
        } catch (ErroBancoDados e) {
            System.out.println("Capturado: " + e.getMessage());
        }
    }
}
