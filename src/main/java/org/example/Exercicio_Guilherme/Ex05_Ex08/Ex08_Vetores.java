package org.example.Exercicio_Guilherme.Ex05_Ex08;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
//os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
//igual a 6.0 (seis).

class Aluno{
    private String nome;
    private double[] notas;

    public Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }
    public double[] getNotas() {
        return notas;
    }

    public double media() {
        return (notas[0] + notas[1]) / 2.0;
    }
}

public class Ex08_Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int n = sc.nextInt();
        sc.nextLine();

        Aluno[] alunos = new Aluno[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nAluno #" + (i + 1));

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            double[] notas = new double[2];

            System.out.print("Nota 1º semestre: ");
            notas[0] = sc.nextDouble();

            System.out.print("Nota 2º semestre: ");
            notas[1] = sc.nextDouble();
            sc.nextLine();

            alunos[i] = new Aluno(nome, notas);
        }

        System.out.println("\nAlunos aprovados:");
        for (int i = 0; i < n; i++) {
            if (alunos[i].media() >= 6.0) {
                System.out.println(alunos[i].getNome());
            }
        }

    }
}
