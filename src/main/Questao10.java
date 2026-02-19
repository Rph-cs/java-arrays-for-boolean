package main;

import java.util.Scanner;
/*
 QUESTÃO 10 — Sequência Válida

 O programa deve:

 - Ler 10 números inteiros.
 - Armazenar os valores em um array.
 - Percorrer o array verificando a sequência.
 - Determinar se a sequência nunca diminui.
 - A sequência pode repetir valores.
 - A sequência pode aumentar.
 - Caso exista algum número menor que o anterior,
     a sequência deve ser considerada inválida.
 - Ao final, informar se a sequência é válida ou inválida.
*/
public class Questao10 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
         int[] numeros = new int[10];
         boolean sequenciaValida = true;
         
         for (int i = 0; i < numeros.length; i++) {
             
             System.out.println("Digite o "+ (i + 1) +" número: ");
             numeros[i] = scanner.nextInt();
             
             if (i > 0) {
                 if (numeros[i] < numeros[i - 1]) {
                     sequenciaValida = false;
                     break;
                 }
             }
             
         }
         
         if (sequenciaValida) {
             System.out.println("A sequência é válida.");
         } else {
             System.out.println("A sequência não é válida.");
         }
        
    }
}
