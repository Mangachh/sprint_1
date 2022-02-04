package tasca4.nivell3.Exercici4;

import java.util.ArrayList;

import java.util.Arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ArrayListTest {
    /* Exercici 4. Crea un arrayList contenidor de diversos tipus d'objectes (creeu-los també). 
     * Escriu una asserció per a verificar l'ordre dels objectes en l'ArrayList segons han estat inserits.   ✅ 
     * Ara verifica que la llista anterior conté els objectes en qualsevol ordre. ✅
     * Verifica que, en la llista anterior, un dels objectes s'ha afegit només una vegada. ✅
     * Deixa un dels elements sense afegir, i verifica que la llista no conté aquest últim.
    
    */
    private static ArrayList<String> names;

    @BeforeAll
    static void initArrayList() {
        names = testArrayPopulated();
    }

    static ArrayList<String> testArrayPopulated() {
        ArrayList<String> temp = new ArrayList<String>();
        temp.add("Pepito");
        temp.add("Mariela");
        temp.add("Pedrito");
        temp.add("Marieta");

        //descomentar para comprobar el duplicado
        // temp.add("Pedrito"); 
        
        // descomentar para comprobar si no existe
        //temp.add("Tami");
        return temp;
    }

    ArrayList<String> notOrderedArray() {
        ArrayList<String> temp = new ArrayList<String>();
        temp.add("Pedrito");
        temp.add("Pepito");      
        temp.add("Marieta");
        temp.add("Mariela");
        return temp;
    }

    @Test
    void arrayListSameOrderTest() {
        //supongo que he de crear una nueva lista para compararlas, tanto en orden como sin orden
        ArrayList<String> secondary = testArrayPopulated();
        //ArrayList<String> secondary = this.notOrderedArray();        

        Assertions.assertThat(names).containsExactlyElementsOf(secondary);

    }
    
    @Test
    void arrayListSameElementsTest() {
        ArrayList<String> secondary = this.notOrderedArray();

        Assertions.assertThat(names).containsAll(secondary);
    }

    @Test
    void arrayListCheckElement() {
        Assertions.assertThat(names).containsOnlyOnce("Pedrito");
    }

    @Test
    void arrayListCheckNoElement() {
        Assertions.assertThat(names).doesNotContain("Tami");
    }
}
