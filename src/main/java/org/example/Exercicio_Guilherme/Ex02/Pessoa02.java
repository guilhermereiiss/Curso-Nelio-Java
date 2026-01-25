package org.example.Exercicio_Guilherme.Ex02;

class Pessoa02 {
    String nome;
    int idade;

    Pessoa02(String nome, int idade, int salario){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}

class Funcionario extends Pessoa02{
    int salario;

    Funcionario(String nome, int idade, int salario){
        super(nome, idade, salario);
        this.salario = salario;
    }

    void mostrarDados(){
        System.out.println("O nome do funcionario é " + nome + "e tem " + idade + " anos e ganha R$" + salario + ".");
    }
}

class Gerente extends Funcionario{

    public Gerente(String nome, int idade, int salario) {
        super(nome, idade, salario);
    }

    @Override
    void mostrarDados(){
        System.out.println("O nome do gerente é " + nome + "e tem " + idade + " anos e ganha R$" + salario + ".");
    }
}

class Estagiario extends Funcionario {

    public Estagiario(String nome, int idade, int salario) {
        super(nome, idade, salario);
    }

    @Override
    void mostrarDados(){
        System.out.println("O nome do estagiario é " + nome + "e tem " + idade + " anos e ganha R$" + salario + ".");
    }

}