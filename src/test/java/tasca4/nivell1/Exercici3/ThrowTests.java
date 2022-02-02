package tasca4.nivell1.Exercici3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


class ThrowTests {

    @Test
    void checkArrayOutOfBonds() {
        Throw  th = new Throw();
        Exception e = assertThrows(ArrayIndexOutOfBoundsException.class, () -> th.throwMethod());

        //miramos si las clases son las mismas
        assertEquals(ArrayIndexOutOfBoundsException.class, e.getClass(), "Se espera una excepción de ArrayOutOfBounds.");

    }
    
    
}
