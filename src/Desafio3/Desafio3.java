package Desafio3;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite dois valores inteiro para k:");
          //Leitura do tamanho da array
        int n = sc.nextInt();
        
        System.out.println("Digite valores inteiro para array:");
         //Leitura do valor.
        int k = sc.nextInt();
 
        // Leitura dos elementos do array
        //Declara uma arr de tamanho N
        int[] arr = new int[n];
 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Ordena o array em ordem crescente
        Arrays.sort(arr);
        
        // Contador de pares
        int count = 0;

        // Percorre o array para encontrar pares cuja diferença seja igual ao valor alvo
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] - arr[i] == k) {
                    //Se a diferença for igual a k, significa que encontramos um par válido.
                    count++;
                } else if (arr[j] - arr[i] > k) {
                    // Se a diferença entre os elementos for maior que o valor alvo, loop interrompido.
                    break;
                }
            }
        }
         System.out.println("");
         System.out.println("Exemplo de saída:");
        System.out.println(count);

        sc.close();
    }
}