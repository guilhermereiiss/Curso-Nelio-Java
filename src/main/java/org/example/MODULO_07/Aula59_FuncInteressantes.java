package org.example.MODULO_07;

public class Aula59_FuncInteressantes {
    public static void main(String[] args) {
        // Criação de uma variável do tipo String
        String texto = "   abcde FGHIJ ABC abc DEFG   ";
        // Tem espaços no início e no final

        // trim(): remove os espaços em branco do início e do fim da string
        String textoSemEspacos = texto.trim();
        System.out.println("Com trim(): " + textoSemEspacos);

        // toLowerCase(): converte todos os caracteres para minúsculo
        String textoMinusculo = textoSemEspacos.toLowerCase();
        System.out.println("Com toLowerCase(): " + textoMinusculo);

        // toUpperCase(): converte todos os caracteres para maiúsculo
        String textoMaiusculo = textoSemEspacos.toUpperCase();
        System.out.println("Com toUpperCase(): " + textoMaiusculo);

        // substring(início, fim): retorna uma parte da string entre os índices dados
        String parteTexto = textoSemEspacos.substring(0, 5); // do índice 0 até o 5 (sem incluir o 5)
        String parteTexto2 = textoSemEspacos.substring(2); // a partir do índice 2 até o final
        System.out.println("Com substring(0, 5): " + parteTexto);
        System.out.println("Com substring(2): " + parteTexto2);

        // replace(): substitui todas as ocorrências de um caractere ou palavra por outro
        String textoTroca = textoSemEspacos.replace("abc", "XYZ");
        System.out.println("Com replace('abc', 'XYZ'): " + textoTroca);

        // indexOf(): retorna o índice da primeira ocorrência de um caractere ou substring
        int primeiroIndice = textoSemEspacos.indexOf("ABC");
        System.out.println("Com indexOf('ABC'): " + primeiroIndice);

        // lastIndexOf(): retorna o índice da última ocorrência de um caractere ou substring
        int ultimoIndice = textoSemEspacos.lastIndexOf("ABC");
        System.out.println("Com lastIndexOf('ABC'): " + ultimoIndice);

        // split(): divide a string em partes, com base em um separador (nesse caso, o espaço)
        String[] partes = textoSemEspacos.split(" ");
        System.out.println("Com split(' '):");
        for (String p : partes) {
            if (!p.isEmpty()) { // ignora espaços duplos
                System.out.println("- " + p);
            }
        }

        // Podemos também combinar funções:
        // Exemplo: pegar parte da string e deixar em maiúsculo
        String parteMaiuscula = textoSemEspacos.substring(6, 11).toUpperCase();
        System.out.println("Substring + toUpperCase(): " + parteMaiuscula);
    }
}
