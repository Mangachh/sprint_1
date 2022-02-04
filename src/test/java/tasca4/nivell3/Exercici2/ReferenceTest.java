package tasca4.nivell3.Exercici2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReferenceTest {
    /* Exercici 2. Una asserció que demostri que la referència a un objecte és la mateixa que una altra, 
     * i una altra que indiqui que és diferent. */
    
    @Test
    void sameReference() {
        // con esto funciona pero con strings...
        StringBuilder a = new StringBuilder();
        StringBuilder b = a;

        Assertions.assertThat(a).isSameAs(b);
    }
    
    @Test
    void diferentReference() {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        Assertions.assertThat(a).isNotSameAs(b);

    }
}
