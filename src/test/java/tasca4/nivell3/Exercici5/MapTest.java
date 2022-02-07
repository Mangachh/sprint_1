package tasca4.nivell3.Exercici5;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class MapTest {
    /*  Exercici 5. Crea un map i verifica que conté una de les key que li afegeixi.
    */

    @Test
    void checkKey() {
        Map<String, Integer> testMap = new HashMap<String, Integer>();
        testMap.put("Primera", 1);

        Assertions.assertThat(testMap).containsKeys("Primera");

    }
}
