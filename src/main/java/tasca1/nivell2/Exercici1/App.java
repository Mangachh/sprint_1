package tasca1.nivell2.Exercici1;

public class App {
    /*
     * Exercici 1. Crea una classe Cycle, amb les seves subclasses: Unicycle,
     * Bicycle i Tricycle.
     * Demostra que es pot generalitzar una instància de cada
     * tipus a Cycle mitjançant el mètode del main(): public static void ride(Cycle
     * c).
     */

    public static void main(String[] args) {
        ride(new Cycle());
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }

    public static void ride(final Cycle c) {
        System.out.printf("Tipus d'instancia de Cycle: ");
        System.out.println(c.getClass().getSimpleName());
    }
}
