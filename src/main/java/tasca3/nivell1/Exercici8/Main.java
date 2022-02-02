package tasca3.nivell1.Exercici8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class Main {
    /* Exercici 8. Emplena un mapa LinkedHashMap amb claus de tipus String 
     * i objectes del tipus que prefereixi. Extregui les parelles, ordeni-les segons les claus (en ordre alfabètic) 
     * i torni a inserir-les en el mapa. Idea: Fes servir un ArrayList per realitzar l'ordenació amb la classe Comparator.    
    */

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHash = new LinkedHashMap<>();
        populateMap(linkedHash);
        HashMap<String, Integer> tempDict = new HashMap<>();

        Iterator<Map.Entry<String, Integer>> iter = linkedHash.entrySet().iterator();
        ArrayList<String> keys = new ArrayList<>();

        printMap(linkedHash, "Imprimim el LinkedHashMap ja omplert:");
        

        //sacamos la pareja, la metemos en el temp y aprovechamos para poner la key en el arraylist        
        while (iter.hasNext()) {
            Map.Entry<String, Integer> keyValue = iter.next();            
            tempDict.put(keyValue.getKey(), keyValue.getValue());
            keys.add(keyValue.getKey());
        }
        
        //quitamos dict
        linkedHash.clear();
        printMap(linkedHash, "Imprimim el LinkedHashMap buït:");
        printMap(tempDict, "Imprimim el HashMap temporal ja omplert:");

        keys.sort(Comparator.naturalOrder());
        
        for (int i = 0; i < keys.size(); i++) {
            linkedHash.put(keys.get(i), tempDict.get(keys.get(i)));
        }
       
        printMap(linkedHash, "Imprimir el LinkedHashMap amb les claus ordenades alfabeticament:");
    }
    
    private static void populateMap(Map<String, Integer> dict) {
        dict.put("Primera entrada", 1);
        dict.put("Segunda entrada", 2);
        dict.put("Tercera entrada", 3);
        dict.put("Cuarta entrada", 4);
        dict.put("Quinta entrada", 5);
        dict.put("Sexta entrada", 6);
        // le quito el acento para usar el natural order bien
        dict.put("Septima entrada", 7);
        dict.put("Octava entrada", 8);
    }
    
    private static void printMap(final Map<String, Integer> dict, final String mess) {
        System.out.println(mess);
        System.out.println(dict);
        System.out.println("\n");
    }
}
