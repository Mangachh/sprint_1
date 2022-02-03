package tasca3.nivell1.Exercici6;

import java.util.LinkedList;
import java.util.ListIterator;

public class App {
    /*Exercici 6. Crea un objecte buit LinkedList<Integer>. 
    Utilitzant un iterador ListIterator, afegeixi valors sencers a la 
    llista inserint-los sempre a la meitat d'aquesta.   
    */

    public static void main(String[] args) {
        LinkedList<Integer> linked = new LinkedList<Integer>();
        int limit = 20;

        for (int i = 0; i < limit; i++) {
            insertInto(i, linked.listIterator(Math.round(linked.size() / 2)));
        }
        
        for (Integer c : linked) {
            System.out.println(c);
        }
    }
    
    private static void insertInto(int number, ListIterator<Integer> coll) {
        coll.add(number);
    }
}
