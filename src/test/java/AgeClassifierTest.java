import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste para {@link AgeClassifier}.
 * Contém testes unitários desenvolvidos seguindo os princípios de TDD
 * para verificar a funcionalidade do método classifyAge em diferentes
 * faixas etárias e casos de borda.
 */
public class AgeClassifierTest {

    /**
     * Testa a classificação para idade 0.
     * Espera-se "Menor de idade".
     */
    @Test
    void testClassifyAge_age0_shouldReturnMenorDeIdade() {
        assertEquals("Menor de idade", AgeClassifier.classifyAge(0), "Age 0 should be 'Menor de idade'");
    }

    /**
     * Testa a classificação para idade 17 (limite superior para Menor de idade).
     * Espera-se "Menor de idade".
     */
    @Test
    void testClassifyAge_age17_shouldReturnMenorDeIdade() {
        assertEquals("Menor de idade", AgeClassifier.classifyAge(17), "Age 17 should be 'Menor de idade'");
    }

    /**
     * Testa a classificação para idade 18 (limite inferior para Adulto).
     * Espera-se "Adulto".
     */
    @Test
    void testClassifyAge_age18_shouldReturnAdulto() {
        assertEquals("Adulto", AgeClassifier.classifyAge(18), "Age 18 should be 'Adulto'");
    }

    /**
     * Testa a classificação para idade 64 (limite superior para Adulto).
     * Espera-se "Adulto".
     */
    @Test
    void testClassifyAge_age64_shouldReturnAdulto() {
        assertEquals("Adulto", AgeClassifier.classifyAge(64), "Age 64 should be 'Adulto'");
    }

    /**
     * Testa a classification para idade 65 (limite inferior para Idoso).
     * Espera-se "Idoso".
     */
    @Test
    void testClassifyAge_age65_shouldReturnIdoso() {
        assertEquals("Idoso", AgeClassifier.classifyAge(65), "Age 65 should be 'Idoso'");
    }

    /**
     * Testa a classificação para uma idade negativa.
     * Espera-se "Idade inválida".
     */
    @Test
    void testClassifyAge_negativeAge_shouldReturnIdadeInvalida() {
        assertEquals("Idade inválida", AgeClassifier.classifyAge(-1), "Negative age should be 'Idade inválida'");
    }

    /**
     * Testa a classificação para uma idade avançada (acima de 65).
     * Espera-se "Idoso".
     */
    @Test
    void testClassifyAge_largeAge_shouldReturnIdoso() { // e.g. 120
        assertEquals("Idoso", AgeClassifier.classifyAge(120), "Age 120 should be 'Idoso'");
    }
}
