package org.example.MODULO_09;

import java.util.Scanner;
import java.util.Locale;

//    Encapsulamento em Java é o conceito de proteger os dados de uma classe, permitindo que eles sejam acessados ou modificados apenas de forma controlada.
//    Isso é feito deixando os atributos como private e usando métodos public (getters e setters) para acessá-los, garantindo mais segurança, organização e controle do código.
// Encapsulamento: os atributos são privados e acessados por getters e setters

// GET É PRA LER E SET PARA ALTERAR
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Price: R$ " + price;
    }
}

public class Aula86_Encapsulamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: R$ ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);
        System.out.println(product);

        product.setName("Computador");
        product.setPrice(2500.00);

        System.out.println("Updated product:");
        System.out.println(product);

        sc.close();
    }
}
