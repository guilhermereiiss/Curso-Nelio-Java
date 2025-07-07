package org.example.MODULO_06;

public class Aula45_While {
    public static void main(String[] args) {
        int valor = 0;
        boolean gui = true;

        while (gui) {
            valor += 1;
            System.out.println("Valor: " + valor);

            if (valor >= 20) {
                gui = false;
            }
        }
    }
}
