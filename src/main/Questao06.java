package main;

import java.util.Scanner;
/*
 QUESTÃO 6 — Comparação com Número Anterior

 O programa deve:

 1) Ler 6 números inteiros informados pelo usuário.
 2) Armazenar os valores em um array.
 3) Percorrer o array comparando cada número com o anterior.
 4) Contar quantas vezes o número atual é MAIOR que o anterior.
 5) Exibir ao final:

    - A quantidade total de vezes em que houve crescimento.
*/

public class Questao06 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[6];
        int numeroAnterior = 0;
        int contagem = 0;
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.format("Digite o %d numero: %n", (i + 1));
            numeros[i] = scanner.nextInt();
            
            if (i > 0) {
                if (numeros[i] > numeroAnterior) {
                    contagem++;
                }
            }
            
            numeroAnterior = numeros[i];
        }
    
        System.out.format("Houve um total de %d vezes um crescimento", contagem);
    }
}
