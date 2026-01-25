package org.example.Exercicio_Guilherme.Ex01;

public class Main {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Guilherme", 20);
        Pessoa pessoa2 = new Pessoa("Ana", 18);
        pessoa.apresentar();
        pessoa2.apresentar();

        pessoa.setIdadeDobro(20);
        pessoa.apresentar();
    }
}
