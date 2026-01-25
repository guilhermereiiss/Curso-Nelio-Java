package org.example.Exercicio_Guilherme.Ex03;

public class main03 {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca("Guilherme", 101, 1000, 0.05);
        cp.mostrarSaldo();
        cp.renderJuros();
        cp.mostrarSaldo();

        System.out.println("------------------");

        ContaCorrente cc = new ContaCorrente("Guilherme", 202, 500, 2.50);
        cc.mostrarSaldo();
        cc.sacar(100);
        cc.mostrarSaldo();
    }
}
