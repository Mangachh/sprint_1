package tasca4.nivell2;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;

public class CustomMatcher {
    
    //old
    /*public static Matcher<String> strLength(Integer limit) {
        return new FeatureMatcher<String, Integer>(Matchers.equalTo(limit), "Se esperaba longitud: ", "La cadena tiene longitud: ") {
            @Override
            protected Integer featureValueOf(String actual) {
                return actual.length();
            }
        };
    }*/

    // vale, este funciona
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
