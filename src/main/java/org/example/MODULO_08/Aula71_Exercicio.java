package org.example.MODULO_08;

import java.util.Locale;
import java.util.Scanner;

class Dolar{
    public static final double IOF = 0.06;

    public static double converterParaReais(double precoDolar, double quantidadeDolares) {
        double valorSemIof = precoDolar * quantidadeDolares;
        double valorComIof = valorSemIof * (1.0 + IOF);
        return valorComIof;
    }
}

public class Aula71_Exercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o preço do dólar? ");
        double preco_dolar = sc.nextDouble();

        System.out.println("Quantos dólares serão comprados?");
        double quantidade_dolar = sc.nextDouble();

        double valorReais = Dolar.converterParaReais(preco_dolar,quantidade_dolar);

        System.out.printf("Valor a ser pago em reais = %.2f%n", valorReais);

        sc.close();
    }
}
