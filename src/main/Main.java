package main;

import java.util.Scanner;
/*
 QUESTÃO 1 — Análise de números em sequência

 Um programa deve armazenar 10 números inteiros.

 Após a leitura dos números, o sistema deve analisar os valores e determinar:

 - Quantos números são positivos
 - Quantos números são negativos
 - Quantos números são múltiplos de 3
 - Se existe pelo menos um número igual a 0

 Regras:
 - Os números devem ser armazenados em um array
 - A análise deve ser feita usando FOR
 - Não usar boolean
 - Não usar break
 - Não usar continue

 Observação:
 - Um mesmo número pode se encaixar em mais de uma categoria
*/

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int totalPositivos = 0, totalNegativos = 0, totalMultiplos3 = 0;
        String existeZero = "Não existe número 0 no array";
        
        for (int i = 0; i < numeros.length; i++) {
          System.out.println("Digite um número: ");
          numeros[i] = scanner.nextInt();   
          
          if (numeros[i] == 0 && existeZero.equals("Não existe número 0 no array")){
              existeZero = "Existe número 0 no array";
          }
          
          if (numeros[i] % 3 == 0) {
              totalMultiplos3++;
          }
          
          if (numeros[i] > 0) {
              totalPositivos++;
          } else if (numeros[i] < 0){
              totalNegativos++;
          }
            
        }
        
        System.out.format("%d números são positivos %n", totalPositivos);
        System.out.format("%d números são negativos %n", totalNegativos);
        System.out.format("%d números são múltiplos de 3 %n", totalMultiplos3);
        System.out.println(existeZero);
        
    }

}