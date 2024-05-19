public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";

        concatenacao = 1 + "1" + 1 + 1;

        concatenacao = 1 + "1" + 1 + "1";

        concatenacao = "1" + 1 + 1 + 1;

        concatenacao = "1" + (1 + 1 + 1);

        int numero = 5;

        numero = -numero;

        numero = numero * -1;

        System.out.println(numero);

        numero++;

        // ternary
        int a, b;
        a = 5;
        b = 6;

        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);
    }
}
