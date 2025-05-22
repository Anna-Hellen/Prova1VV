import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste para {@link Fatorial}.
 * Contém testes unitários para verificar a funcionalidade do método calcularFatorial,
 * cobrindo os caminhos independentes identificados no Grafo de Fluxo de Controle (CFG),
 * incluindo entradas negativas, zero e positivas.
 */
public class FatorialTest {

    /**
     * Testa o cálculo do fatorial para uma entrada negativa.
     * Este teste cobre o Caminho 1 do CFG (n < 0).
     * Espera-se que retorne -1 (código de erro).
     */
    @Test
    void testCalcularFatorial_negativeInput_shouldReturnError() {
        assertEquals(-1, Fatorial.calcularFatorial(-1), "Fatorial of -1 should be -1 (error code)");
        assertEquals(-1, Fatorial.calcularFatorial(-5), "Fatorial of -5 should be -1 (error code)");
    }

    /**
     * Testa o cálculo do fatorial para a entrada 0.
     * Este teste cobre o Caminho 2 do CFG (n = 0, loop não executa).
     * Espera-se que retorne 1.
     */
    @Test
    void testCalcularFatorial_zeroInput_shouldReturnOne() {
        assertEquals(1, Fatorial.calcularFatorial(0), "Fatorial of 0 should be 1");
    }

    /**
     * Testa o cálculo do fatorial para uma entrada positiva onde o loop executa uma vez (n=1).
     * Este teste cobre o Caminho 3 do CFG (n > 0, loop executa).
     * Espera-se que retorne 1.
     */
    @Test
    void testCalcularFatorial_positiveInput_oneIteration_shouldReturnCorrectFactorial() {
        assertEquals(1, Fatorial.calcularFatorial(1), "Fatorial of 1 should be 1");
    }

    /**
     * Testa o cálculo do fatorial para entradas positivas onde o loop executa múltiplas vezes.
     * Este teste também cobre o Caminho 3 do CFG (n > 0, loop executa).
     * Verifica valores de fatorial conhecidos.
     */
    @Test
    void testCalcularFatorial_positiveInput_multipleIterations_shouldReturnCorrectFactorial() {
        assertEquals(2, Fatorial.calcularFatorial(2), "Fatorial of 2 should be 2");
        assertEquals(6, Fatorial.calcularFatorial(3), "Fatorial of 3 should be 6");
        assertEquals(120, Fatorial.calcularFatorial(5), "Fatorial of 5 should be 120");
    }
    
    // Note: The Fatorial.java I created earlier had an explicit n==0 check.
    // The CFG and paths above are for the *exact* code in the prompt.
    // The tests here will work for both versions (prompt's and my slightly modified Fatorial.java)
    // as the logical outcome for n=0 is the same.
}
