package org.example.MODULO_08;

import java.util.Locale;
import java.util.Scanner;

class Funcionario {

    private String name;
    private double grossSalary;
    private double tax;

    public Funcionario(String name, double grossSalary, double tax){
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * (percentage / 100.0);
    }

    @Override
    public String toString() {
        return name + ", R$ " + String.format("%.2f", netSalary());
    }
}

public class Aula70_Exercicio {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do funcionario: ");
        String name = sc.nextLine();

        System.out.print("Salário bruto: ");
        double grossSalary = sc.nextDouble();

        System.out.print("Imposto: ");
        double tax = sc.nextDouble();

        Funcionario funcionario = new Funcionario(name, grossSalary, tax);

        System.out.println("Dados do funcionario:");
        System.out.println(funcionario);

        System.out.print("Qual porcentagem para aumentar o salArio? ");
        double percentage = sc.nextDouble();
        funcionario.increaseSalary(percentage);

        System.out.println("Dados atualizados:");
        System.out.println(funcionario);

        sc.close();
    }
}

