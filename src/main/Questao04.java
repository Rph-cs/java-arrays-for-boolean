package main;

import java.util.Scanner;
/*
 QUESTÃO 4 — Sistema Inteligente de Análise de Padrões Numéricos

 Um sistema deve analisar uma sequência de 20 números inteiros informados pelo usuário.

 O programa deve armazenar os 20 valores em um array.

 Após a leitura, o sistema deve analisar os dados e determinar:

 - Se EXISTE pelo menos uma sequência de 3 números consecutivos pares
 - Se EXISTE pelo menos uma sequência de 2 números consecutivos ímpares
 - Se houve mudança brusca em algum momento
   (diferença absoluta maior que 10 entre um número e o anterior)
 - Se TODOS os números são positivos
 - Se EXISTE pelo menos um número repetido consecutivamente

 Saída esperada (exemplos):

 - "Existe sequência de três pares consecutivos"
 - "Existe sequência de dois ímpares consecutivos"
 - "Houve mudança brusca na sequência"
 - "Todos os números são positivos"
 ou
 - "Nem todos os números são positivos"
 - "Existe número repetido consecutivamente"
*/

public class Questao04 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[20];
        int numeroAnterior = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        boolean temConsecutivosPares = false;
        boolean temConsecutivosImpares = false;
        boolean teveMudancaBrusca = false;
        boolean todosNumerosPositivos = true;
        boolean temNumeroRepetidoConsecutivamente = false;
        
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println("Digite o " + (i + 1) + " número inteiro: ");
            numeros[i] = scanner.nextInt();
            
            
            if(numeros[i] % 2 == 0 && !temConsecutivosPares) {
                contadorPares++;
                if (contadorPares >= 3) {
                    temConsecutivosPares = true;
                }
            } else {
                contadorPares = 0;
            }
            
            if(numeros[i] % 2 != 0 && !temConsecutivosImpares) {
                contadorImpares++;
                if (contadorImpares >= 2) {
                    temConsecutivosImpares = true;
                }
            } else {
                contadorImpares = 0;
            }
            if (i > 0 && !teveMudancaBrusca) {
                if (Math.abs(numeros[i] - numeroAnterior) > 10) {
                    teveMudancaBrusca = true;
                }
            }
            
            if (numeros[i] < 0 && todosNumerosPositivos) {
                todosNumerosPositivos = false;
            }
            
            if (i > 0 && numeros[i] == numeroAnterior && !temNumeroRepetidoConsecutivamente) {
                temNumeroRepetidoConsecutivamente = true;
            }
            
            numeroAnterior = numeros[i];
        }
        
        if (temConsecutivosPares) {
            System.out.println("Existe sequência de três pares consecutivos");
        } else {
            System.out.println("Não existe sequência de três pares consecutivos");
        }
        
        if (temConsecutivosImpares) {
            System.out.println("Existe sequência de dois ímpares consecutivos");
        } else {
            System.out.println("Não existe sequência de dois ímpares consecutivos");
        }
        
        if (teveMudancaBrusca) {
            System.out.println("Houve mudança brusca na sequência");
        } else {
            System.out.println("Não houve mudança brusca na sequência");
        }
        
        if (todosNumerosPositivos) {
            System.out.println("Todos os números são positivos");
        } else {
            System.out.println("Nem todos os números são positivos");
        }
        
        if (temNumeroRepetidoConsecutivamente) {
            System.out.println("Existe número repetido consecutivamente");
        } else {
            System.out.println("Não existe número repetido consecutivamente");
        }
        
    }
}
