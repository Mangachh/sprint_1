package tasca1.nivell1.Exercici7;

public class Main {

    /* Exercici 7. A l'exercici anterior crea un nou mètode saltar() a la classe Frog i crida’l des del main(), 
     * desprès de fer la generalització a Amphibian. Demostra que la crida a aquest mètode saltar dona error.
    */

    public static void main(String[] args) {
        Amphibian a = new Frog();
        a.moure();
        a.respirar();
        a.menjar();
        
        //TODO: a la hora de comprobar, quitar el comentario.
        //a.saltar(); 
    }
}