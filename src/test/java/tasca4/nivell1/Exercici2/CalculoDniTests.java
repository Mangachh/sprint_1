package tasca4.nivell1.Exercici2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculoDniTests {
    
    @ParameterizedTest(name = "Getting letter for {0}.")
    @CsvSource(
    { "53113458, H", "35989327, P", "91363488, J", "59661888, A", "45478920, P",
      "63600480, Y", "80857844, X", "50543939, J", "46343249, C", "23660045, Z"}
    )
    void calculateDniLetter(int number, char letter) {
        CalculoDni dni = new CalculoDni();
        assertEquals(letter, dni.getDniLeter(number), () -> "Expected letter: " + letter);
    }
}
