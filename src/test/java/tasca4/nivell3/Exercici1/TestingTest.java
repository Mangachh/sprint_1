package tasca4.nivell3.Exercici1;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class TestingTest {
    
    /* Exercici 1. Una asserció que demostri que el valor de dos 
     * objectes sencers és igual, i una altra que indiqui que no ho és.*/
    
    @Test
    void sameNumber() {
        Integer a = 5;
        Integer b = 5;
        Assertions.assertThat(a).isEqualTo(b);
    }

    @Test 
    void diferentNumber(){
        Assertions.assertThat(8).isNotEqualTo(5);
    }

   
}
