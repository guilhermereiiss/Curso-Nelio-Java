package org.example.Exercicio_Guilherme.Aula89_Ex05;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome do titular: ");
        String nome = sc.nextLine();

        System.out.print("Havera deposito inicial (s/n)? ");
        char opcao = sc.next().charAt(0);

        Banco conta;

        if (opcao == 's') {
            System.out.print("Valor do deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Banco(numero, nome, depositoInicial);
        } else {
            conta = new Banco(numero, nome);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta);

        // DEPÓSITO
        System.out.println();
        System.out.print("Digite um valor para deposito: ");
        double valorDeposito = sc.nextDouble();
        conta.depositar(valorDeposito);

        System.out.println("Dados atualizados:");
        System.out.println(conta);

        // SAQUE
        System.out.println();
        System.out.print("Digite um valor para saque: ");
        double valorSaque = sc.nextDouble();
        conta.sacar(valorSaque);

        System.out.println("Dados atualizados:");
        System.out.println(conta);

        sc.close();
    }
}
