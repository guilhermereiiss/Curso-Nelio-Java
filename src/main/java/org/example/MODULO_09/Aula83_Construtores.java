package org.example.MODULO_09;

import java.util.Scanner;
import java.util.Locale;

class Products {
    public String name;
    public double price;
    public int quantity;

    public Products() { }

//    public Products(String name, double price, int quantity) {
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//    }

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
       // this.quantity = quantity; OPCIONAL POIS NO JAVA OS INTS JA POR SI PROPRIOS INICIAM COM 0
    }

    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}

public class Aula83_Construtores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        Products product = new Products();

//        System.out.println(product.name);
//        System.out.println(product.price);
//        System.out.println(product.quantity);

//        System.out.println("Enter product data:");
//        System.out.print("Name: ");
//        product.name = sc.nextLine();
//        System.out.print("Price: R$");
//        product.price = sc.nextDouble();
//        System.out.print("Quantity in stock: ");
//        product.quantity = sc.nextInt();

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: R$");
        double price = sc.nextDouble();
//        System.out.print("Quantity in stock: ");
//        int quantity = sc.nextInt();
        Products product = new Products(name, price);
        System.out.println(product);
    }

}
