package org.example.MODULO_08;
import java.util.Locale;
import java.util.Scanner;

class Triangle {
    public double a;
    public double b;
    public double c;
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}


public class Aula66_Classes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        double areaX = x.area();
        double areaY = y.area();

        if (areaX > areaY) {
            System.out.printf("Triangle X has larger area than triangle Y.%n");
        } else {
            System.out.printf("Triangle Y has larger area than triangle X.%n");
        }
    }
}
