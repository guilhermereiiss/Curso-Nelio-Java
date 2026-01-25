package org.example.Exercicio_Guilherme.Aula89_Ex05;

public class Banco {

    private int numberCount;
    private String name;
    private double saldo;

    // Construtor SEM depósito inicial
    public Banco(int numberCount, String name) {
        this.numberCount = numberCount;
        this.name = name;
        this.saldo = 0.0;
    }

    // Construtor COM depósito inicial
    public Banco(int numberCount, String name, double depositoInicial) {
        this.numberCount = numberCount;
        this.name = name;
        this.saldo = depositoInicial;
    }

    public int getNumberCount() {
        return numberCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor + 5.0;
    }

    @Override
    public String toString() {
        return "Conta "
                + numberCount
                + ", Titular: "
                + name
                + ", Saldo: R$ "
                + String.format("%.2f", saldo);
    }
}
