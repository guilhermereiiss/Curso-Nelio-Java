package org.example.MODULO_05;

public class Aula40_CondTermaria {

    // Expressão condicional ternária
    // (condição) ? Valor_se_Verdadeiro : Valor_se_Falso

    public static void main(String[] args) {
        int idade = 18;
        double preco = 3.14;


        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";

        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);

        System.out.println(resultado);
    }

}
