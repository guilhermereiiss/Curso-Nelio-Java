package org.example.MODULO_05;

import java.util.Scanner;

public class Aula39_SwitchCase {

    // SWITCH CASE

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 5: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Você digitou 1");
                break;
            case 2:
                System.out.println("Você digitou 2");
                break;
            case 3:
                System.out.println("Você digitou 3");
                break;
            case 4:
                System.out.println("Você digitou 4");
                break;
            case 5:
                System.out.println("Você digitou 5");
                break;
            default:
                System.out.println("Número fora do intervalo esperado (1 a 5)");
        }

        sc.close();
    }
}
