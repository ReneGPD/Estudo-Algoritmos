
/*Faça um programa que leia um número 
inteiro positivo N (máximo = 10)
e depois N números inteiros
e armazene-os em um vetor. Em seguida, 
mostrar na tela todos os números negativos lidos.*/



import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] number = new int[n];

     for (int i = 0; i < n; i++) {
         System.out.println("Digite um numero: ");
         number[i] = sc.nextInt();

    }
     int negativo = 0;
     for (int i = 0; i < n; i++) {
         if (number[i] < 0) {
             negativo += number[i];
             System.out.println( "Numeros negativos: "+ negativo);
         }
     }


    }
}
