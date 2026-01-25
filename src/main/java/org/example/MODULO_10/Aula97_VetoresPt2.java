package org.example.MODULO_10;

import java.util.Locale;
import java.util.Scanner;


class Product{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

public class Aula97_VetoresPt2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um nome: ");
            String name = sc.next();
            System.out.println("Digite um preço: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vect[i].getPrice();
        }

        double avg = soma / n;
        System.out.printf("MEDIA = %.5f%n", avg);

        sc.close();
    }
}
