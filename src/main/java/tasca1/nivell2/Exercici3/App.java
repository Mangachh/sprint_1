package tasca1.nivell2.Exercici3;

import java.util.Arrays;
import java.util.List;

public class App {
    /* Exercici 3. Afegeix un mètode balance() a Unicycle i a Bicycle 
     * amb una implementació diferent a cada un, però no a Tricycle. 
     * Crea instàncies de tres tipus i generalitza-les per a formar un array 
     * d'objectes Cycle. Tracta d'invocar balance() a cada element de l'array. 
     * Realitza una especialització fent servir instanceof i invoca balance demostrant el que ocorre.
     */

    public static void main(String[] args) {
        List<Cycle> cycles = Arrays.asList(new Unicycle(), new Bicycle(), new Tricycle());
        
        for (Cycle c : cycles) {
            if (c instanceof Unicycle) {
                Unicycle uni = (Unicycle) c;
                uni.balance();
            } else if (c instanceof Bicycle) {
                Bicycle bi = (Bicycle) c;
                bi.balance();
            }
        }
    }

    public static void ride(final Cycle c) {
        System.out.printf("Número de rodes de %s: %d \n", c.getClass().getName(), c.wheels());       
    }
}
