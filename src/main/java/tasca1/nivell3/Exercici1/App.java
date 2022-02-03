package tasca1.nivell3.Exercici1;

public class App {
    /* Exercici 1. Crea una classe anomenada Base amb dos mètodes: 
     * metode1() i metode2(). En el primer mètode, invoca el segon. 
     * Defineix una classe anomenada Derivada que hereti de l'anterior i 
     * substitueix el segon mètode. Crea un objecte de la classe Derivada, 
     * realitza una generalització (upcasting) al tipus Base i crida al primer mètode. 
     * Demostra el que succeeix.    
    */

    public static void main(String[] args) {
        Derivada der = new Derivada();
        
        System.out.println("Metode1 de la clase Derivada sense upcasting");
        der.metode1();

        Base base = (Base) der;
        System.out.println("\nMetode1 de la classe upcasting");
        base.metode1();
    }
}
