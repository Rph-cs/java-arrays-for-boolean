package main;

import java.util.Scanner;
/*
 QUESTÃO 5 — Análise Inteligente de Média e Valores Acima da Média

 Um sistema deve solicitar 7 números inteiros ao usuário.

 O programa deve armazenar os 7 valores em um array.

 Após a leitura, o sistema deve:

 - Calcular a média dos valores informados
 - Identificar quais números são maiores que a média
 - Mostrar a média calculada
 - Mostrar todos os números que estão acima da média

 Saída esperada (exemplo):

 - "A média dos valores é: 15.4"
 - "Números acima da média:"
 - 20
 - 18
 - 25
*/

public class Questao05 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[7];
        int somaTotalNumeros = 0;
        double media = 0;
        int contador = 0;
        
        for(int i = 0; i < numeros.length; i++) {
            
            System.out.println("Digite o "+ (i + 1) + " número: ");
            numeros[i] = scanner.nextInt();
            
            somaTotalNumeros += numeros[i];
        }

        media = (double) somaTotalNumeros / numeros.length;
        
        System.out.println("A média dos valores é: "+ media);

        System.out.println("Números acima da média:");
        
        for (int i = 0; i < numeros.length; i++) {
            
            if (numeros[i] > media) {
                System.out.println(numeros[i]);
                contador++;
            }
        }
        
        if (contador == 0) {
            System.out.println("Nenhum número é maior que a média");
        }
        
    }
}
