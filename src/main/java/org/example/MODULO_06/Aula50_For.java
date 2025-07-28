package org.example.MODULO_06;

import java.util.Scanner;

public class Aula50_For {

    // O laço for "para" é uma estrutura de repetição usada para executar um bloco de código
    // um número determinado de vezes. Ele é composto por três partes:
    // 1. Inicialização: geralmente usada para declarar e iniciar uma variável de controle.
    // 2. Condição: o laço continua enquanto essa condição for verdadeira.
    // 3. Incremento/Decremento: atualização da variável de controle a cada iteração.

    // Exemplo:
    // for (int i = 0; i < 10; i++) {
    //     System.out.println(i);
    // }

    // No exemplo acima, o laço começa com i = 0 e executa enquanto i < 10,
    // incrementando i em 1 a cada repetição.

    public static void main(String[] args) {

        // Percorrendo um Array
        String[] nomes = {"Ana", "João", "Maria"};

        for (int i = 0; i < nomes.length; i++) {
        System.out.println(nomes[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero positivo: ");
        int numero = sc.nextInt();

        if(numero > 0){
            for (int i = 1; i <= numero; i++) {
                int quadrado = i * i;
                int cubo = quadrado * i;

                System.out.println( i + "," + quadrado + "," + cubo);
            }
        }else {
            System.out.println("Por favor, digite um número positivo.");
        }

        sc.close();
    }
}
