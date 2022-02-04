package tasca2.nivell3.Exercici1;

public class App {

    /*
     * Exercici 1. Demostra que un constructor d'una classe derivada no pot
     * capturar excepcions generades pel seu constructor de la classe base.
     */

    public static void main(String[] args) {
        try{
            Subclass1 sb = new Subclass1();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
