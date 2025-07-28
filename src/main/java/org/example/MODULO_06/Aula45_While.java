package org.example.MODULO_06;

import java.util.Scanner;

public class Aula45_While {
    public static void main(String[] args) {
//        int valor = 0;
//        boolean gui = true;
//
//        while (gui) {
//            valor += 1;
//            System.out.println("Valor: " + valor);
//
//            if (valor >= 20) {
//                gui = false;
//            }
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha:");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha incorreta, tente novamente");
            senha = sc.nextInt();
        }

        System.out.println("Senha correta!");
    }
}
