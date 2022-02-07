package tasca4.nivell3.Exercici7;

import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmptyTest {
    /* Exercici 7. Crea un objecte Optional buit. Escriu l'asserció correcta per a verificar que efectivament està buit.*/

    @Test
    void checkEmptyObject() {
        String test = null;
        Assertions.assertThat(test).isNull();
    }
}
