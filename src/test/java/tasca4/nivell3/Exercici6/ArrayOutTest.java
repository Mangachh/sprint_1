package tasca4.nivell3.Exercici6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOutTest {
    /* Exercici 6. Provoca una ArrayIndexOutOfBoundsException en una classe qualsevol. 
     * Creu una asserció que validi que l'excepció és llançada quan correspon. */

    int[] numbers = { 3, 5, 4, 8, 7, 45 };

    @Test
    void checkOutOfBounds() {
        //Throwable thrown = Assertions.catchThrowable(() -> System.out.println(numbers[12]));
        //Assertions.assertThat(thrown).isInstanceOf(ArrayIndexOutOfBoundsException.class).hasMessageContaining("12");
        Assertions.assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class).isThrownBy(() -> this.doIndexException());
    }

    void doIndexException() {
        System.out.println(numbers[12]);
    }
}
