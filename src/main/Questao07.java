package main;

import java.util.Scanner;
/*
 QUESTÃO 7 — Maior e Menor Valor

 O programa deve:

 1) Ler 8 números inteiros informados pelo usuário.
 2) Armazenar os valores em um array.
 3) Percorrer o array para descobrir:
      - O maior valor
      - O menor valor
 4) Exibir ao final:
      - O maior valor encontrado
      - O menor valor encontrado

 Regras:
 - Usar array
 - Não usar Collections
 - Não usar Math.max ou Math.min
*/

public class Questao07 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[8];
        
        int maiorNumero = 0;
        int menorNumero = 0;
        
        for(int i = 0; i < numeros.length; i++) {
            
            System.out.format("Digite o %d número: %n", (i + 1));
            numeros[i] = scanner.nextInt();

            if (i == 0) {
                maiorNumero = numeros[i];
                menorNumero = numeros[i];
            }
            
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
            
            if (numeros[i] < menorNumero) {
                menorNumero = numeros[i];
            }
            
        }
        if (maiorNumero != menorNumero) {
            System.out.format("%d foi o maior número digitado%n", maiorNumero);
            System.out.format("%d foi o menor número digitado%n", menorNumero);
        } else {
            System.out.println("Os números digitados foram todos " + maiorNumero);
        }
     
    }
}
