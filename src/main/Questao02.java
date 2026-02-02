package main;

import java.util.Scanner;

/*
 QUESTÃO 2 — Análise de desempenho de sensores

 Um sistema recebe valores inteiros representando medições de sensores.

 O programa deve armazenar 8 valores inteiros em um array.

 Após a leitura dos valores, o sistema deve analisar os dados e determinar:

 - Quantos valores são maiores que 50
 - Quantos valores são menores que 0
 - Quantos valores são pares
 - Se existe pelo menos um valor entre 20 e 30 (inclusive)

 Regras:
 - Os valores devem ser armazenados em um array
 - A leitura e a análise devem ser feitas usando FOR
 - Usar boolean
 - Não usar break
 - Não usar continue

 Observação:
 - Um mesmo valor pode se encaixar em mais de uma categoria
*/

public class Questao02 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] medicao = new int[8];
        int totalMaiores50 = 0, totalMenores0 = 0, totalPares = 0;
        boolean medicaoEntre = false;
        
        for(int i = 0; i < medicao.length; i++) {
            
            System.out.println("Digite o valor da medição: ");
            medicao[i] = scanner.nextInt();
            
            if(medicao[i] % 2 == 0) {
                totalPares++;
            }
            
            if (medicao[i] < 0) {
                totalMenores0++;
            } 
            
            if (medicao[i] >= 20 && medicao[i] <= 30 && !medicaoEntre) {
                medicaoEntre = true;
            }
            
            if (medicao[i] > 50) {
                totalMaiores50++;
            }
   
        }
        
        System.out.format("Total de medições maiores que 50: %d %n", totalMaiores50);
        System.out.format("Total de medições menores que 0: %d %n", totalMenores0);
        System.out.format("Total de medições que são pares: %d %n", totalPares);
        if(medicaoEntre) {
            System.out.println("Tem valor entre 20 e 30");
        } else {
            System.out.println("Não tem valor entre 20 e 30");
        }
      
    }
}
