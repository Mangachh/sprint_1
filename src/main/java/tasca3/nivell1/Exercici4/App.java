package tasca3.nivell1.Exercici4;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class App {
    /* Exercici 4. Escriu un ḿetode que utilitzi un iterador per a recórrer 
     * una col·lecció genèrica passada per argument i imprimeixi tots els seus objectes 
     * (fent servir el mètode toString()). Empleni tots els diferents tipus de 
     * Java Collections (ArrayList, LinkedList, HashSet, LinkedHashSet i TreeSet), 
     * amb una sèrie d'objectes i apliqui el mètode dissenyat a cada Contenidor.    
    */

    public static void main(String[] args) {
        ArrayList<TestData> arrayData = new ArrayList<TestData>();
        LinkedList<TestData> linkedData = new LinkedList<TestData>();
        HashSet<TestData> hashData = new HashSet<TestData>();
        LinkedHashSet<TestData> linkedHashData = new LinkedHashSet<TestData>();
        TreeSet<TestData> treeData = new TreeSet<TestData>();

        //llenamos las colecciones
        populateCollection(arrayData);
        populateCollection(linkedData);
        populateCollection(hashData);
        populateCollection(linkedHashData);
        populateCollection(treeData);

        printCollection(arrayData.iterator(), arrayData.getClass().getSimpleName());
        printCollection(linkedData.iterator(), linkedData.getClass().getSimpleName());
        printCollection(hashData.iterator(), hashData.getClass().getSimpleName());
        printCollection(linkedData.iterator(), linkedData.getClass().getSimpleName());
        printCollection(treeData.iterator(), treeData.getClass().getSimpleName());

    }
    
    private static void populateCollection(Collection<TestData> coll) {
        final int limit = 12;
        final String name = "puesto";
        for (int i = 0; i < limit; i++) {
            coll.add(new TestData(name, i + 1));
        }
    }

    private static void printCollection(final Iterator<TestData> it, final String collName) {
        System.out.println("Imprimint la colecció de tipus: " + collName);

        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
       System.out.println("\n");
   }
}
