package org.example.MODULO_06;

public class Aula44_DEBUG {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Calculando o fatorial de: " + numero);

        int resultado = calcularFatorial(numero);

        System.out.println("Resultado final: " + resultado);
    }

    public static int calcularFatorial(int n) {
        int resultado = 1;

        for (int i = n; i > 0; i--) {
            System.out.println("Multiplicando: " + resultado + " * " + i);
            resultado *= i;

            // Simula uma pausa para observar o debug
            try {
                Thread.sleep(300); // 300ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//        if (n == 3) {
//            throw new RuntimeException("Erro forçado no valor 3");
//        }

        return resultado;
    }
}
