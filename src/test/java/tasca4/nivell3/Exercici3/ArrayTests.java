package tasca4.nivell3.Exercici3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayTests {
    /* Exercici 3. Una asserció que indiqui que dos arrays d'enters són idèntics. */

    @Test
    void arrayTest() {
        int[] arrayA = { 2, 5, 7, 8 };
        int[] arrayB = { 2, 5, 7, 8 };

        Assertions.assertThat(arrayA).contains(arrayB);
    }
}
