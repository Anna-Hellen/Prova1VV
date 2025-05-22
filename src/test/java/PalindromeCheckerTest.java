import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste para {@link PalindromeChecker}.
 * Contém testes unitários para verificar a funcionalidade do método isPalindrome,
 * incluindo o tratamento de casos de borda, entradas nulas e palíndromos válidos/inválidos.
 */
public class PalindromeCheckerTest {

    /**
     * Testa o comportamento do método isPalindrome com uma entrada nula.
     * Espera-se que retorne false, conforme a lógica corrigida.
     */
    @Test
    void testIsPalindrome_nullInput_shouldReturnFalse() {
        // This test now verifies the corrected behavior for null input.
        assertFalse(PalindromeChecker.isPalindrome(null), "isPalindrome(null) should return false after correction");
    }

    /**
     * Testa se uma string vazia é corretamente identificada como um palíndromo.
     */
    @Test
    void testIsPalindrome_emptyString_shouldReturnTrue() {
        assertTrue(PalindromeChecker.isPalindrome(""), "Empty string should be a palindrome");
    }

    /**
     * Testa se uma string com um único caractere é corretamente identificada como um palíndromo.
     */
    @Test
    void testIsPalindrome_singleCharacter_shouldReturnTrue() {
        assertTrue(PalindromeChecker.isPalindrome("a"), "Single character string should be a palindrome");
    }

    /**
     * Testa um palíndromo simples e comum.
     */
    @Test
    void testIsPalindrome_simplePalindrome_shouldReturnTrue() {
        assertTrue(PalindromeChecker.isPalindrome("aba"), "'aba' should be a palindrome");
    }

    /**
     * Testa um palíndromo mais longo.
     */
    @Test
    void testIsPalindrome_longerPalindrome_shouldReturnTrue() {
        assertTrue(PalindromeChecker.isPalindrome("racecar"), "'racecar' should be a palindrome");
    }

    /**
     * Testa um palíndromo com comprimento par.
     */
    @Test
    void testIsPalindrome_palindromeWithEvenLength_shouldReturnTrue() {
        assertTrue(PalindromeChecker.isPalindrome("abba"), "'abba' should be a palindrome");
    }

    /**
     * Testa uma string simples que não é um palíndromo.
     */
    @Test
    void testIsPalindrome_simpleNonPalindrome_shouldReturnFalse() {
        assertFalse(PalindromeChecker.isPalindrome("abc"), "'abc' should not be a palindrome");
    }

    /**
     * Testa uma string que não é um palíndromo, mas tem caracteres finais e iniciais semelhantes.
     */
    @Test
    void testIsPalindrome_nonPalindromeWithSimilarEnds_shouldReturnFalse() {
        assertFalse(PalindromeChecker.isPalindrome("abac"), "'abac' should not be a palindrome");
    }

    /**
     * Testa um palíndromo com letras maiúsculas e minúsculas misturadas.
     * A função original é case-sensitive, então "Racecar" não seria um palíndromo.
     */
    @Test
    void testIsPalindrome_mixedCasePalindrome_shouldReturnFalse() {
        // Assuming case-sensitive comparison as per original implementation
        assertFalse(PalindromeChecker.isPalindrome("Racecar"), "'Racecar' should not be a palindrome (case-sensitive)");
    }
}
