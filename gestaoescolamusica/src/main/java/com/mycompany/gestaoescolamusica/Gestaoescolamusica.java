/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestaoescolamusica;
import java.util.ArrayList;
/**
 *
 * @author debor
 */
public class Gestaoescolamusica {

     public static void main(String[] args) {
   
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Aluno("Davi", 17, "A45952"));
        pessoas.add(new Professor("Wagner", 45, "P58621"));
        pessoas.add(new Funcionario("Alícia", 25, "F63127"));

        
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.atividade());

            if (pessoa instanceof Identificavel) {
                Identificavel identificavel = (Identificavel) pessoa;
                System.out.println(identificavel.getId());
            }
        }
    }
}
