package org.example.MODULO_07;

public class Aula58_BitWise {
    public static void main(String[] args) {
        // Os operadores bitwise permitem manipular bits diretamente.
        // Eles são usados em situações de baixo nível, como controle de hardware,
        // compactação, criptografia e combinação de permissões (flags).

        int a = 5;  // Em binário: 0101
        int b = 3;  // Em binário: 0011

        // & (AND): Retorna 1 apenas quando os dois bits são 1
        System.out.println("a & b = " + (a & b));  // 0101 & 0011 = 0001 = 1

        // | (OR): Retorna 1 quando pelo menos um dos bits é 1
        System.out.println("a | b = " + (a | b));  // 0101 | 0011 = 0111 = 7

        // ^ (XOR): Retorna 1 quando os bits são diferentes
        System.out.println("a ^ b = " + (a ^ b));  // 0101 ^ 0011 = 0110 = 6

        // ~ (NOT): Inverte todos os bits (muda 0 pra 1 e 1 pra 0)
        System.out.println("~a = " + (~a));        // ~0101 = ...1010 = -6

        // << (Shift Left): Desloca bits para a esquerda (multiplica por 2 a cada deslocamento)
        System.out.println("a << 1 = " + (a << 1)); // 0101 << 1 = 1010 = 10

        // >> (Shift Right): Desloca bits para a direita (divide por 2 a cada deslocamento)
        System.out.println("a >> 1 = " + (a >> 1)); // 0101 >> 1 = 0010 = 2
    }
}
