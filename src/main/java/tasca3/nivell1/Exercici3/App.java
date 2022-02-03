package tasca3.nivell1.Exercici3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class App {
    
    /* Exercici 3. Crea una classe anomenada Generadora que retorni noms de personatges (com String) 
     * de la seva pel·lícula favorita cada que vegada que invoqui al mètode 'seguentPersonatge()', 
     * i que torni al principi de la llista de personatges una vegada que hagi acabat amb tots els noms. 
     * Utilitzi aquest generador per a emplenar un ArrayList, 
     * un LinkedList, un HashSet, un LinkedHashSet i un TreeSet, i després imprimeixi per pantalla cada contenidor.    
    */
    public static void main(String[] args) {
        ArrayList<String> arrayNames = new ArrayList<String>();
        LinkedList<String> linkedNames = new LinkedList<String>();
        LinkedHashSet<String> linkedSetNames = new LinkedHashSet<String>();
        TreeSet<String> treeNames = new TreeSet<String>();

        //llenamos las colecciones
        populateCollection(arrayNames, 4);
        populateCollection(linkedNames, 2);
        populateCollection(linkedSetNames, 6);
        populateCollection(treeNames, 3);

        //imprimimos
        printCollection(arrayNames, arrayNames.getClass().getSimpleName());
        printCollection(linkedNames, linkedNames.getClass().getSimpleName());
        printCollection(linkedSetNames, linkedSetNames.getClass().getSimpleName());
        printCollection(treeNames, treeNames.getClass().getSimpleName());

    }

    private static void populateCollection(Collection<String> coll, int amount) {
        for (int i = 0; i < amount; i++) {
            coll.add(Generadora.seguentPersonatge());
        }
    }

    private static void printCollection(final Collection<String> coll, final String collName) {
        System.out.println("Imprimint la colecció de tipus: " + collName);
        for (String name : coll) {
            System.out.println(name);
        }
        System.out.println("\n");
    }
}
