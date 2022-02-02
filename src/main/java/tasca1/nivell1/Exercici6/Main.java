package tasca1.nivell1.Exercici6;

public class Main {

    /* Exercici 6. Crea una classe denominada Amphibian i inclou una sèrie de mètodes: moure(), respirar() i menjar(). 
     * Defineix una nova classe denominada Frog que hereti de l'anterior. 
     * Al main() crea un objecte Frog i realitza una generalització a Amphibian, demostrant que tots els mètodes continuen funcionant.    
    */

    public static void main(String[] args) {
        Amphibian a = new Frog();
        a.moure();
        a.respirar();
        a.menjar();
    }
}