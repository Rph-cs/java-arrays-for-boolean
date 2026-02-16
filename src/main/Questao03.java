package main;

import java.util.Scanner;
/*
 QUESTÃO 3 — Monitoramento inteligente de temperatura

 Um sistema monitora temperaturas registradas por um sensor ao longo do tempo.

 O programa deve armazenar 10 valores inteiros em um array,
 onde cada valor representa uma temperatura medida.

 Após a leitura das temperaturas, o sistema deve analisar os dados e determinar:

 - Se houve pelo menos UMA temperatura negativa
 - Se houve pelo menos UMA temperatura acima de 40 graus
 - Se EXISTE uma sequência de DUAS temperaturas consecutivas acima de 30 graus
 - Se TODAS as temperaturas são válidas (entre -10 e 50 inclusive)

 Regras importantes:
 - Os valores devem ser armazenados em um array
 - A leitura e a análise devem ser feitas usando FOR
 - Usar boolean

 Observações importantes:
 - Uma temperatura pode se encaixar em mais de uma condição
 - O sistema deve "lembrar" estados anteriores (ex: temperatura anterior)
 - O programa NÃO deve parar quando encontrar um caso verdadeiro
 - A decisão final só é mostrada APÓS o FOR

 Saída esperada (exemplo de mensagens):
 - "Houve temperatura negativa"
 - "Houve temperatura acima de 40"
 - "Sequência crítica detectada"
 - "Todas as temperaturas são válidas"
 ou
 - "Existem temperaturas inválidas"
*/

public class Questao03 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] temperaturas = new int[10];
        int contador = 0;
        boolean teveTemperaturaNegativa = false;
        boolean teveTemperaturaAlta = false;
        boolean teveTemperaturaConsecutiva = false;
        boolean todasTemperaturasValidas = true;
        
        for (int i = 0; i < temperaturas.length; i++) {
            
            System.out.println("Digite a temperatura registrada: ");
            temperaturas[i] = scanner.nextInt();
            
            if (temperaturas[i] < 0 && !teveTemperaturaNegativa) {
                teveTemperaturaNegativa = true;
            }
            
            if (temperaturas[i] > 40 && !teveTemperaturaAlta) {
                teveTemperaturaAlta = true;
            }
            
            if (temperaturas[i] > 30 && !teveTemperaturaConsecutiva) {
                contador++;
                if(contador >= 2) {
                    teveTemperaturaConsecutiva = true;
                }
            } else if (!teveTemperaturaConsecutiva) {
                contador = 0;
            }
            
            if (temperaturas[i] < -10 || temperaturas[i] > 50) {
                todasTemperaturasValidas = false;
            }
            
        }
        
        if (teveTemperaturaNegativa) {
            System.out.println("Houve temperatura negativa registrada");
        } else {
            System.out.println("Não houve temperatura negativa registrada");
        }

        if (teveTemperaturaAlta) {
            System.out.println("Houve temperatura acima de 40 graus registrada");
        } else {
            System.out.println("Não houve temperatura acima de 40 graus registrada");
        }

        if (teveTemperaturaConsecutiva) {
            System.out.println("Houve uma sequência de duas temperaturas consecutivas acima de 30 graus");
        } else {
            System.out.println("Não houve uma sequência de duas temperaturas consecutivas acima de 30 graus");
        }

        if (todasTemperaturasValidas) {
            System.out.println("Todas as temperaturas são válidas");
        } else {
            System.out.println("Existem temperaturas inválidas");
        }
  
    }
}
