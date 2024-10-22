/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Media {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos alunos você deseja inserir? ");
        int n = scanner.nextInt();
        
        double[] notas = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / n;
        
        System.out.println("A média das notas é: " + media);
    }
}
