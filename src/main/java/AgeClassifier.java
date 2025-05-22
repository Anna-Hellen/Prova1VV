/**
 * A classe AgeClassifier fornece uma funcionalidade para classificar
 * uma idade em categorias predefinidas (Menor de idade, Adulto, Idoso).
 */
public class AgeClassifier {

    /**
     * Classifica uma idade fornecida em uma das seguintes categorias:
     * <ul>
     *   <li>"Menor de idade": se a idade estiver entre 0 e 17 (inclusive).</li>
     *   <li>"Adulto": se a idade estiver entre 18 e 64 (inclusive).</li>
     *   <li>"Idoso": se a idade for 65 ou mais.</li>
     *   <li>"Idade inválida": para qualquer outra idade (por exemplo, negativa).</li>
     * </ul>
     *
     * @param idade A idade a ser classificada.
     * @return Uma string representando a categoria da idade.
     */
    public static String classifyAge(int idade) {
        // This method will be developed using TDD.
        if (idade >= 0 && idade <= 17) {
            return "Menor de idade";
        } else if (idade >= 18 && idade <= 64) {
            return "Adulto";
        } else if (idade >= 65) {
            return "Idoso";
        }
        // What about negative ages or very large ages if not covered by int limits?
        // For now, sticking to the defined positive ranges. 
        // An else case could throw an IllegalArgumentException for invalid ages (e.g., negative).
        return "Idade inválida"; // Or throw exception for ages not covered, like negative ages.
    }
}
