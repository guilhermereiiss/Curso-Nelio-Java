package org.example.MODULO_05;

public class Aula41_EscopoInic {

    // Escopo e inicialização

    // Escopo de classe (variável global)
    static String nomeGlobal = "João";
    static int idadeGlobal; // não inicializada, valor padrão é 0

    public static void main(String[] args) {
        // Escopo de método
        int numeroLocal = 10; // precisa ser inicializada

        // Condição ternária
        String resultado = (numeroLocal >= 10) ? "Número alto" : "Número baixo";
        System.out.println("Resultado da ternária: " + resultado);

        // Escopo de bloco
        if (numeroLocal > 5) {
            int dentroDoIf = 99; // só existe dentro do IF
            System.out.println("Valor dentro do IF: " + dentroDoIf);
        }

        // System.out.println(dentroDoIf); // ❌ Erro: fora do escopo

        // Variável local declarada, mas não inicializada
        int x;
        // System.out.println(x); // ❌ Erro: variável local 'x' não foi inicializada

        System.out.println("Variável local: " + numeroLocal);
        System.out.println("Nome global: " + nomeGlobal);
        System.out.println("Idade global (valor padrão): " + idadeGlobal); // imprime 0

    }
}
