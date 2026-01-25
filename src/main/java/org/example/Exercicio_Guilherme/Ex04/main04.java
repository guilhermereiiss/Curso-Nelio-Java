package org.example.Exercicio_Guilherme.Ex04;
import java.util.Locale;

// Exercicio do inicio do modulo 08

class Triangulo {
    double lado1;
    double lado2;
    double lado3;

    Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    double area() {
        double p = (lado1 + lado2 + lado3) / 2.0;
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
    }
}

class Triangulo1 extends Triangulo {

    Triangulo1(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }

    @Override
    double area() {
        double p = (lado1 + lado2 + lado3) / 2.0;
        double areaGeral = Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
        System.out.printf("Triângulo 01 tem área: %.4f%n", areaGeral);
        return areaGeral;
    }
}

class Triangulo2 extends Triangulo {

    Triangulo2(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }

    @Override
    double area() {
        double p = (lado1 + lado2 + lado3) / 2.0;
        double areaGeral = Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
        System.out.printf("Triângulo 02 tem área: %.4f%n", areaGeral);
        return areaGeral;
    }
}

public class main04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Triangulo1 t1 = new Triangulo1(3, 4, 5);
        Triangulo2 t2 = new Triangulo2(6, 8, 10);

        double areaT1 = t1.area();
        double areaT2 = t2.area();

        if (areaT1 > areaT2) {
            System.out.println("O triângulo 01 tem maior área que o triângulo 02");
        } else {
            System.out.println("O triângulo 02 tem maior área que o triângulo 01");
        }
    }
}
