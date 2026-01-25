package org.example.Exercicio_Guilherme.Ex05_Ex08;

import java.util.Locale;
import java.util.Scanner;

class Pensionato{
    private String nome;
    private String  email;

    public Pensionato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

public class Ex05_Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Pensionato[] vect = new Pensionato[10];

        System.out.print("Digite a quantidade de quartos para ser lidos (1-10): ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Quarto #" + (i + 1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("E-mail: ");
            String email = sc.nextLine();

            vect[i] = new Pensionato(nome, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(
                        i + ": " + vect[i].getNome() + ", " + vect[i].getEmail()
                );
            }
        }

        sc.close();

    }
}
