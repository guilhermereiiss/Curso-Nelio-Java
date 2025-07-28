package org.example.MODULO_06;

import java.util.Scanner;

public class Aula55_DoWhile {

    // O laço do...while é uma estrutura de repetição usada quando queremos que o bloco de código
    // seja executado pelo menos uma vez, antes de verificar a condição.
    //
    // A estrutura é composta por:
    // - "do": onde o bloco de código é executado
    // - "while (condição);": que verifica se o laço deve continuar
    //
    // Exemplo:
    // int i = 1;
    // do {
    //     System.out.println(i);
    //     i++;
    // } while (i <= 5);
    //
    // Nesse exemplo, o número 1 será impresso mesmo se a condição (i <= 5) for falsa,
    // pois o bloco dentro do "do" sempre executa pelo menos uma vez.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número positivo: ");
            numero = sc.nextInt();
        } while (numero <= 0);

        System.out.println("Você digitou: " + numero);
        sc.close();
    }
}

