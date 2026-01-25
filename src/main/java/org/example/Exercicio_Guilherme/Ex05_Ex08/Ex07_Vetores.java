package org.example.Exercicio_Guilherme.Ex05_Ex08;

import java.util.Locale;
import java.util.Scanner;

public class Ex07_Vetores {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho dos vetores: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("Digite os valores para os vetores A: ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Digite os valores para os vetores B: ");
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        System.out.println("O valores dos vetores C: ");
        for(int i = 0; i < n; i++){
            c[i] = a[i] + b[i];
        }
        System.out.println("Vetor C (soma de A + B):");
        for (int i = 0; i < n; i++) {
            System.out.print(c[i] + " ");
        }
        sc.close();


    }
}
