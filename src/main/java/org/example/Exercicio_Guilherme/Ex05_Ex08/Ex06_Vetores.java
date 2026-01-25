package org.example.Exercicio_Guilherme.Ex05_Ex08;
import java.util.Locale;
import java.util.Scanner;

public class Ex06_Vetores {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] vect = new int[10];

        System.out.println("Quantos numeros vc vai digitar ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
                System.out.println("Digite um numero: ");
                vect[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos abaixo:");
        for(int i = 0; i < n; i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}

