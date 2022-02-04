package tasca3.nivell3.Exercici1;

import java.util.ArrayList;

public class App {
    /*
     * Exercici 1. Crea una classe anomenada Contenidora que encapsuli un array
     * d'objectes String. Defineix un mètode add que només permeti afegir cadenes
     * de caràcters. Si l'array no és prou gran per a la següent inserció, el
     * contenidor
     * ha de redimensionar automàticament aquest array. Al main(), compara el
     * rendiment d'aquest
     * contenidor amb el d'un ArrayList<String>. Idea: Per a la proves de rendiment,
     * es pot fer servir
     * la api System.nanoTime(), que permet calcular el temps utilitzat
     * en les operacions descrites per a l'un o l'altre contenidor.
     */

    private static final int NUMBER_COUNT = 4000;

    public static void main(String[] args) {
        long arrayPerf = arrayPerformance();
        long arrayLisPerf = arrayListPerformance();
        System.out.printf("Contenidora Tiempo: %d ms\n", arrayPerf);
        System.out.printf("Arraylist   Tiempo: %d ms\n", arrayLisPerf);
        System.out.printf("Diferencia de tiempo entre Contenidora - ArrayList: %d ms\n", arrayPerf - arrayLisPerf);
        float dif = (float) arrayLisPerf / arrayPerf;
        System.out.printf("Array list es aproximadamente %.3f más rápida que la clase Contenidora", dif);
    }

    private static long arrayPerformance() {
        Contenidora cont = new Contenidora();

        long start = System.nanoTime();
        for (int i = 0; i < NUMBER_COUNT; i++) {
            cont.add(String.valueOf(i));
        }
        long end = System.nanoTime();

        //System.out.println(cont);
        return end - start;
        //System.out.printf("Duration: %d\n", end - start);
    }

    private static long arrayListPerformance() {
        ArrayList<String> cont = new ArrayList<>();
        long start = System.nanoTime();

        for (int i = 0; i < NUMBER_COUNT; i++) {
            cont.add(String.valueOf(i));
        }
        long end = System.nanoTime();

        return end - start;

    }
}
