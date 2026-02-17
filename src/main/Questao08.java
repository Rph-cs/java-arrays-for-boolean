package main;

import java.util.Scanner;
/*
 QUESTÃO 8 — Sequência Crescente com Reset

 O programa deve:

 - Ler 8 números inteiros.
 - Armazenar em um array.
 - Percorrer a sequência analisando o crescimento.
 - Sempre que o número atual for maior que o anterior,
   aumentar a contagem atual.
 - Se não for maior, a contagem atual volta para zero.
 - Durante o processo, registrar o maior valor que essa contagem atingiu.
 - Ao final, exibir o maior crescimento consecutivo encontrado.
*/

public class Questao08 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[8];

        int sequenciaAtual = 0;
        int maiorSequenciaCrescente = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println("Digite o "+ (i + 1) + " número: ");
            numeros[i] = scanner.nextInt();
            
            if (i > 0) {
                if (numeros[i] > numeros[i - 1]) {
                    sequenciaAtual++;
                    if (sequenciaAtual > maiorSequenciaCrescente) {
                        maiorSequenciaCrescente = sequenciaAtual;
                    }
                } else {
                    sequenciaAtual = 0;
                }
            }
            
        }
        
        System.out.println("O maior crescimento consecutivo encontrado foi: "+ maiorSequenciaCrescente);
    }
}
