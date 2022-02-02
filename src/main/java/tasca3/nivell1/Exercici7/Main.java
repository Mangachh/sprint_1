package tasca3.nivell1.Exercici7;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

public class Main {
    /* Exercici 7. Emplena un HashMap amb parelles clau-valor. 
     * Ordeni les parelles segons el codi hash i imprimeixi el resultat (
     * Idea: fer servir un TreeMap). Extregui les parelles ordenades i 
     * introdueixi-les en un mapa LinkedHashMap (Idea: fer servir el seu constructor). 
     * Demostri que es manté l'ordre d'inserció. Extregui només les claus ordenades i 
     * introdueixi-les primer en un HashSet i després en un LinkedHashSet. Es manté l'ordre?    
    */

    public static void main(String[] args) {
        HashMap<String, Integer> dict = new HashMap<>();
        populateHashMap(dict);

        TreeMap<String, Integer> tree = new TreeMap<String, Integer>(dict);
        LinkedHashMap<String, Integer> linked = new LinkedHashMap<>(tree);

        //imprimimos todo
        printMap(dict, "Imprimimos el diccionario:");
        printMap(tree, "Imprimimos el TreeMap");
        printMap(linked, "Imprimimos el LinkedHashMap");

        //sacamos las keys y las metemos en el hashset con un iterator 
        Iterator<String> orderedKeys = linked.keySet().iterator();
        HashSet<String> hashKeys = new HashSet<String>();

        while (orderedKeys.hasNext()) {
            hashKeys.add(orderedKeys.next());
        }

        //ahora en un linkedhashset
        LinkedHashSet<String> linkedKeys = new LinkedHashSet<>(hashKeys);

        // e imprimos todo
        printCollection(hashKeys, "Imprimimos el hashSet de keys");
        printCollection(linkedKeys, "Imprimimos la linkedHashSet de keys");
    }

    private static void populateHashMap(HashMap<String, Integer> dict) {
        dict.put("Primera entrada", 1);
        dict.put("Segunda entrada", 2);
        dict.put("Tercera entrada", 3);
        dict.put("Cuarta entrada", 4);
        dict.put("Quinta entrada", 5);
        dict.put("Sexta entrada", 6);
        dict.put("Séptima entrada", 7);
        dict.put("Octava entrada", 8);
    }

    private static void printMap(final Map<String, Integer> dict, final String mess) {
        System.out.println(mess);
        System.out.println(dict);
        System.out.println("\n");
    }

    private static void printCollection(final Collection<String> coll, final String mess) {
        System.out.println(mess);
        System.out.println(coll);
        System.out.println("\n");
    }
}
