package tasca3.nivell2.Exercici1;

import java.util.PriorityQueue;
import java.util.Random;

public class App {
    /*
     * Exercici 1. Crea una classe anomenada Numero que contingui un objecte Integer
     * que s'inicialitzi amb un valor comprès entre 0 i 100 utilitzant
     * java.util.Random.
     * Emplena una cua de tipus PriorityQueue amb objectes d'aquesta classe i extreu
     * els valors
     * utilitzant poll() per a demostrar que s'obté l'ordre desitjat.
     */

    public static void main(String[] args) {
       
        PriorityQueue<Numero> numbers = new PriorityQueue<Numero>();
        populateQueue(numbers);
        depopulateQueure(numbers);
    }

    private static void populateQueue(PriorityQueue<Numero> numeros) {
        final int limit = 100;
        Random rnd = new Random();
        Numero num = null;
        for (int i = 0; i < limit; i++) {
            // supongo que el 100 es inclusivo en el enunciado
            num = new Numero(rnd.nextInt(101));
            numeros.add(num);
            //printeamos para comprobar
            System.out.printf("Introducido el número: %d\n", num.getNumero());
        }
    }

    private static void depopulateQueure(PriorityQueue<Numero> numeros) {
        Numero num = null;
        while (numeros.size() > 0) {
            num = numeros.poll();
            System.out.printf("Se ha quitado de la cola el número: %d\n", num.getNumero());
        }
    }
}
