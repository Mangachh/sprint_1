package tasca2.nivell1.Exercici2;

import java.util.Scanner;

public class Main {
    /* Exercici 2. Defineix una referència a un objecte i inicialitza-la amb null. 
     * Tracta d'invocar un mètode a través d'aquesta referència.
     * Ara envolta el codi amb una clàusula try-catch per a capturar l'excepció. 
     * Mostra el missatge i el tipus d'excepció.    
    */
    public static void main(String[] args) {
        Scanner sc = null;

        try{
            sc.nextLine();
        } catch (Exception e) {
            // mensaje
            System.out.println(e.getMessage());
            // nombre excepción
            System.out.println(e.getClass().getCanonicalName());
        }
    }
}
