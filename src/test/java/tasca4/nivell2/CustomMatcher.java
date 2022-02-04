package tasca4.nivell2;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;

public class CustomMatcher {
    /* Exercici 1. Defineix un Matcher personalitzat per a Hamcrest 
     * que proporcioni el Matcher de longitud per a un String. Volem usar 
     * la classe FeatureMatcher. Amb FeatureMatcher podem ajustar un Matcher existent, 
     * decidir quin camp de l'Objecte donat baix prova ha de coincidir i 
     * proporcionar un missatge d'error agradable. El constructor de FeatureMatcher presa els següents 
     * arguments en aquest ordre: continua en la web */


    //funciona bien, aunque pasa como parametro el limit en vez de un matcher. 
    // tenia problemas para el método is(x)
    /*public static Matcher<String> strLength(Integer limit) {
        return new FeatureMatcher<String, Integer>(Matchers.equalTo(limit), "Se esperaba longitud: ", "La cadena tiene longitud: ") {
            @Override
            protected Integer featureValueOf(String actual) {
                return actual.length();
            }
        };
    }*/

    // vale, este funciona tal como pide
    public static Matcher<String> strLength(Matcher<? super Integer> limit) {
        return new FeatureMatcher<String, Integer>(limit, "Se esperaba longitud: ", "La cadena tiene longitud: ") {

            @Override
            protected Integer featureValueOf(String actual) {
                return actual.length();
            }
        };
    }
    
    //para que el is(x) funque hay que poner xxx.Matchers.* (no é cual es)
    @Test
    public void matcherTest() {
        assertThat("Mordoros", strLength(is(8)));
    }
    
   
}
