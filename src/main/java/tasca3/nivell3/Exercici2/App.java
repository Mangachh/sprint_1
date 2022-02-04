package tasca3.nivell3.Exercici2;

import java.util.ArrayList;

public class App {
    /*
     * Exercici 2. Repeteix l'exercici anterior per a un contenidor que encapsuli un array d'enters 
     * (per exemple anomenat Numeros) amb un mètode add(). 
     * Compara el seu rendiment amb el d'un ArrayList<Integer>. 
     * En la comparació de rendiment, inclou el procés d'incrementar cada objecte al contenidor. 
     */

    private static final int NUMBER_COUNT = 40000;

    public static void main(String[] args) {
        long arrayPerf = arrayPerformance();
        long arrayLisPerf = arrayListPerformance();
        System.out.printf("Contenidora Tiempo: %d nanoseconds\n", arrayPerf);
        System.out.printf("Arraylist   Tiempo: %d nanoseconds\n", arrayLisPerf);
        System.out.printf("Diferencia de tiempo entre Contenidora - ArrayList: %d nanoseconds\n", arrayPerf - arrayLisPerf);
        float dif = (float)arrayPerf/ arrayLisPerf;
        System.out.printf("Array list es aproximadamente %.3f veces más rápida que la clase Contenidora", dif);
    }

    private static long arrayPerformance() {
        Contenidora cont = new Contenidora();

        long start = System.nanoTime();
        for (int i = 0; i < NUMBER_COUNT; i++) {
            cont.add(i);
        }
        long end = System.nanoTime();

        //System.out.println(cont);
        return end - start;
        //System.out.printf("Duration: %d\n", end - start);
    }

    private static long arrayListPerformance() {
        ArrayList<Integer> cont = new ArrayList<>();
        long start = System.nanoTime();

        for (int i = 0; i < NUMBER_COUNT; i++) {
            cont.add(i);
        }
        long end = System.nanoTime();

        return end - start;

    }
}
