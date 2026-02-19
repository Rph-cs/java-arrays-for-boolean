package main;

import java.util.Scanner;
/*
 QUESTÃO 9 — Variação Máxima

 O programa deve:

 - Ler 10 números inteiros.
 - Armazenar os valores em um array.
 - Percorrer o array analisando pares consecutivos.
 - Calcular a diferença absoluta entre cada par consecutivo.
 - Determinar qual foi a maior diferença encontrada.
 - Ao final, exibir essa maior diferença.
*/

public class Questao09 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int maiorDiferenca = 0;
        
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o "+ (i + 1) +" número");
            numeros[i] = scanner.nextInt();
            
            if (i > 0) {
                
                int diferenca = Math.abs(numeros[i] - numeros[i - 1]);

                if (diferenca > maiorDiferenca) {
                    maiorDiferenca = diferenca;
                }

            }
            
        }
        
        System.out.println("A maior difereça encontrada foi: "+ maiorDiferenca);
        
    }
}
