package Desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite valores de entrada:");

        int n = sc.nextInt(); // Número de linhas de entrada
        
        List<Integer> numeros = new ArrayList<>();

        // Lê os valores de entrada
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            numeros.add(num);
        }

        sc.close();

        // Separa os números em pares e ímpares
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        
        //num % 2 calcula o resto da divisão de num por 2. Se o resto for 0, significa que o número é divisível por 2, portanto é par.
        for (int num : numeros) {
            if (num % 2 == 0) {
                //Se a condição for verdadeira, portanto adicionar na lista de par.
                pares.add(num);
            } else {
                //Se a condição for falsa, portanto adicionar na lista de par.
                impares.add(num);
            }
        }

        // Ordena os pares em ordem crescente
        Collections.sort(pares);

        // Ordena os ímpares em ordem decrescente
        Collections.sort(impares, Collections.reverseOrder());
        
         System.out.println("");
         System.out.println("Exemplo de Saída");
         
        // Imprime os números na ordem especificada
        for (int par : pares) {
            System.out.println(par);
        }

        for (int impar : impares) {
            System.out.println(impar);
        }
    }
}