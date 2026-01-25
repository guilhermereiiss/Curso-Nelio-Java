package org.example.Exercicio_Guilherme.Ex03;

public class ContaBancaria{
    private double saldo;
    private String titular;
    private int numero;

    public ContaBancaria(String titular, int numero, double saldo){
        this.saldo = saldo;
        this.titular = titular;
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}

class ContaPoupanca extends ContaBancaria{
    private double taxa;

    public ContaPoupanca(String titular, int numero, double taxa, double saldo){
        super(titular, numero, saldo);
        this.taxa = taxa;
    }

    void renderJuros(){
        double rendimento = getSaldo() * taxa;
        depositar(rendimento);
        System.out.println("Juros de R$" + rendimento + " aplicado.");
    }
}

class ContaCorrente extends ContaBancaria{
    private double taxaManutencao;

    public ContaCorrente(String titular, int numero, double saldo, double taxaManutencao) {
        super(titular, numero, saldo);
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public void sacar(double valor) {
        double total = valor + taxaManutencao;
        if (total <= getSaldo()) {
            super.sacar(total);
            System.out.println("Taxa de manutenção de R$" + taxaManutencao + " aplicada.");
        } else {
            System.out.println("Saldo insuficiente para saque e taxa.");
        }
    }
}