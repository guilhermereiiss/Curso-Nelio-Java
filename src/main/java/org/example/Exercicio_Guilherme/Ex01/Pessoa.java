package org.example.Exercicio_Guilherme.Ex01;

class Pessoa {
    private String nome;
    private int idade;

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // Getter e Setter do nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter da idade
    public int getIdade() {
        return idade;
    }

    public void setIdadeDobro(int idade) {
        this.idade = idade * 2;
    }
    void apresentar(){
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
