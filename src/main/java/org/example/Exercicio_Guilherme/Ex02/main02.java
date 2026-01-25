package org.example.Exercicio_Guilherme.Ex02;

import java.util.ArrayList;

public class main02 {
    public static void main(String[] args){
        Funcionario f1 = new Funcionario("Guilherme", 19, 4000);

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(f1);
        funcionarios.add(new Funcionario("Gabriel BAKA", 19, 4000));
        funcionarios.add(new Gerente("Anisu", 23, 10000));
        funcionarios.add(new Estagiario("Felk", 17, 1200));

        for (Funcionario f : funcionarios) {
            f.mostrarDados();
        }

        Gerente g1 = new Gerente("Marcos", 36, 8000);
        g1.mostrarDados();
    }
}
