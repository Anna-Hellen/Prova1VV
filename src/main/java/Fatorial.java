/**
 * A classe Fatorial fornece uma funcionalidade para calcular
 * o fatorial de um número inteiro não negativo.
 */
public class Fatorial {

    /**
     * Calcula o fatorial de um número inteiro {@code n}.
     * <p>
     * O fatorial de um inteiro não negativo n, denotado por n!,
     * é o produto de todos os inteiros positivos menores ou iguais a n.
     * Por definição, 0! = 1.
     * Se n for negativo, o método retorna -1 para indicar um erro,
     * pois o fatorial não é definido para números negativos neste contexto.
     * </p>
     *
     * @param n O número inteiro não negativo para o qual o fatorial será calculado.
     * @return O valor do fatorial de {@code n}. Retorna 1 se {@code n} for 0.
     *         Retorna -1 se {@code n} for negativo.
     */
    public static int calcularFatorial(int n) {
        int resultado = 1;
        if (n < 0) {
            return -1; // Error code for negative input
        }
        // The original code implicitly handles n=0 correctly because the loop won't run and resultado remains 1.
        // For explicitness and clarity, an n==0 check could be added, but it's not strictly a bug for n=0.
        // if (n == 0) {
        //     return 1;
        // }
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
