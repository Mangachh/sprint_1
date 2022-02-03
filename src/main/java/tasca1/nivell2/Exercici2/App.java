package tasca1.nivell2.Exercici2;

public class App {
    /* Exercici 2. Afegeix un mètode wheels() a Cycle, 
     * que retorni el nombre de rodes. Modifica ride() 
     * per a invocar wheels() i verifica que funciona el polimorfisme.
     */

    public static void main(String[] args) {
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }

    public static void ride(final Cycle c) {
        System.out.printf("Número de rodes de %s: %d \n", c.getClass().getName(), c.wheels());
        //System.out.println(c.getClass().getSimpleName());
    }
}
