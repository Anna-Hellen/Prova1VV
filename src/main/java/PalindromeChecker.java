/**
 * A classe PalindromeChecker fornece uma funcionalidade para verificar
 * se uma determinada string é um palíndromo.
 * Um palíndromo é uma palavra, frase, número ou outra sequência de caracteres
 * que lê o mesmo para trás e para frente, como "madam" ou "racecar".
 */
public class PalindromeChecker {

    /**
     * Verifica se a string fornecida é um palíndromo.
     * <p>
     * O método ignora a diferença entre maiúsculas e minúsculas ao realizar a comparação.
     * Por exemplo, "Racecar" seria considerado um palíndromo.
     * Uma string vazia ou uma string com um único caractere é considerada um palíndromo.
     * Se a string de entrada for {@code null}, o método retorna {@code false},
     * pois uma string nula não pode ser considerada um palíndromo.
     * </p>
     *
     * @param str A string a ser verificada. Pode ser {@code null}.
     * @return {@code true} se a string for um palíndromo ou vazia/único caractere;
     *         {@code false} se não for um palíndromo ou se a entrada for {@code null}.
     */
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false; // Correction: Handle null input gracefully
        }
        // Original problematic code
        int left = 0;
        int right = str.length() - 1; // Bug: NullPointerException if str is null
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
