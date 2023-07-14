package Desafio4;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica a quantidade de linhas e a frase:");
        //N representa a quantidade de linhas.
        int n = sc.nextInt();
         //Quebra de linha após o número de casos de teste
        sc.nextLine();
        System.out.println(""); //Pra pular uma linha.
        
        for (int i = 0; i < n; i++) {
            String linha = sc.nextLine(); //Le o numero de inforrmado no N.
            String decifrada = decifrarString(linha); //Uma função definida por decifrar o codigo.
            System.out.println(decifrada); //Imprime as palavras decifradas.
        }

        sc.close();
    }
    
    //Recebe uma String linha e retorna a String como resultado.
    public static String decifrarString(String linha) {
        int tam = linha.length();//Recebe o comprimento da String linha.
        String parteEsquerda = linha.substring(0, tam / 2).trim(); //Representa a metade da linha da esquerda.
        String parteDireita = linha.substring(tam / 2).trim(); //Representa a metade da linha da direita.

        // Inverter as partes esquerda, utilizei o reverse para isso
        String parteEsquerdaInvertida = new StringBuilder(parteEsquerda).reverse().toString();
        // Inverter as parte direita, utilizei o reverse para isso.
        String parteDireitaInvertida = new StringBuilder(parteDireita).reverse().toString();

        // Combinar as partes invertidas para formar a string decifrada
        String decifrada = parteEsquerdaInvertida + parteDireitaInvertida;

        return decifrada;
    }
}
