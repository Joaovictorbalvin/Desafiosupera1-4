package Desafio2;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        
        System.out.print("Digite um valor de ponto flutuante: ");
        Scanner sc = new Scanner(System.in);
        
        //converte String resultante em um valor do tipo double.
        //Aqui fazemos o uso do replace para substituir a virgula por ponto, evitando possiveis erros.
        double valor = Double.parseDouble(sc.next().replace(",", "."));

        // Converte o valor para centavos, multiplicando por 100 e arredondando para o inteiro mais próximo
        int centavos = (int) (valor * 100);

        // Inicializa as variáveis de contagem notas.
        int notas100 = 0, notas50 = 0, notas20 = 0, notas10 = 0, notas5 = 0, notas2 = 0;
        
        // Inicializa as variáveis de contagem moedas.
        int moedas1 = 0, moedas50 = 0, moedas25 = 0, moedas10 = 0, moedas5 = 0, moedasrestantes = 0;

        // Cálculo das notas de 100
        while (centavos >= 10000) {
            centavos -= 10000;
            notas100++;
        }

        // Cálculo das notas de 50
        while (centavos >= 5000) {
            centavos -= 5000;
            notas50++;
        }

        // Cálculo das notas de 20
        while (centavos >= 2000) {
            centavos -= 2000;
            notas20++;
        }

        // Cálculo das notas de 10
        while (centavos >= 1000) {
            centavos -= 1000;
            notas10++;
        }

        // Cálculo das notas de 5
        while (centavos >= 500) {
            centavos -= 500;
            notas5++;
        }

        // Cálculo das notas de 2
        while (centavos >= 200) {
            centavos -= 200;
            notas2++;
        }

        // Cálculo das moedas de 1
        while (centavos >= 100) {
            centavos -= 100;
            moedas1++;
        }

        // Cálculo das moedas de 0.50
        while (centavos >= 50) {
            centavos -= 50;
            moedas50++;
        }

        // Cálculo das moedas de 0.25
        while (centavos >= 25) {
            centavos -= 25;
            moedas25++;
        }

        // Cálculo das moedas de 0.10
        while (centavos >= 10) {
            centavos -= 10;
            moedas10++;
        }

        // Cálculo das moedas de 0.05
        while (centavos >= 5) {
            centavos -= 5;
            moedas5++;
        }

        // O valor restante em centavos é a quantidade de moedas de 0.01
        moedasrestantes = centavos;

        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00"); //Quantidade de nota de 100.00.
        System.out.println(notas50 + " nota(s) de R$ 50.00"); //Quantidade de nota de 50.00.
        System.out.println(notas20 + " nota(s) de R$ 20.00"); //Quantidade de nota de 20.00.
        System.out.println(notas10 + " nota(s) de R$ 10.00"); //Quantidade de nota de 10.00.
        System.out.println(notas5 + " nota(s) de R$ 5.00"); //Quantidade de nota de 5.00.
        System.out.println(notas2 + " nota(s) de R$ 2.00"); //Quantidade de nota de 2.00.
        System.out.println("");
        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00"); //Quantidades de moedas de 1.00.
        System.out.println(moedas50 + " moeda(s) de R$ 0.50"); //Quantidades de moedas de 0.50.
        System.out.println(moedas25 + " moeda(s) de R$ 0.25"); //Quantidades de moedas de 0.25.
        System.out.println(moedas10 + " moeda(s) de R$ 0.10"); //Quantidades de moedas de 0.10.
        System.out.println(moedas5 + " moeda(s) de R$ 0.05"); //Quantidades de moedas de 0.05.
        System.out.println(moedasrestantes + " moeda(s) de R$ 0.01"); //Quantidades de moedas de 0.01.

        sc.close();
    }
}
