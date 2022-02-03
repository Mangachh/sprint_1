package tasca3.nivell1.Exercici5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class App {
    /* Exercici 5. Crea i emplena un objecte List<Integer>. 
     * Crea i emplena un segon objecte List<Integer> de la mateixa 
     * grandària que el primer. Utilitza sengles objectes ListIterator 
     * per a llegir els elements de la primera llista i inserir-los en la 
     * segona en ordre invers (provi d'explorar diverses formes diferents de resoldre aquest problema).    
    */

    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<Integer>();
        List<Integer> listB = new ArrayList<Integer>();

        populateList(listA);
        //metemos como index por defecto el tamaño del array
        populateInverseList(listA.listIterator(listA.size()), listB.listIterator());

        System.out.println("Imprimint la llistaA");
        System.out.println(listA);
        System.out.println("\nImprimint la llista Reversa");
        System.out.println(listB);
        
    }


    private static void populateList(List<Integer> list) {
        final int limit = 12;

        for (int i = 0; i < limit; i++) {
            list.add(i);
        }
    }

    private static void populateInverseList(final ListIterator<Integer> dataList, ListIterator<Integer> emptyList) {
        while (dataList.hasPrevious()) {
            emptyList.add(dataList.previous());
        }      
    }
}
