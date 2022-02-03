package tasca8.nivell1.Exercici1;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    /*
     * Tenint una llista de cadenes de noms propis,
     * escriu un mètode que retorn e una llista de
     * totes les cadenes que comencen amb la lletra
     * 'a' (mayuscula ) i tenen exactament 3 lletres.
     * Imprimeix el resultat .
     */

    public static void main(String[] args) {
        List<String> names = getNamesList();

        System.out.println("Printeando lista con todos los nombres: ");
        printList(names);
        List<String> a = namesWithA(names);
        System.out.println();
        System.out.println("Printeando lista con nombres que empiezan por \"A\" y tienen 3 letras");
        printList(a);
    }

    private static List<String> namesWithA(final List<String> names) {        
        return names.stream().filter(n -> n.startsWith("A") && n.length() == 3).toList();
    }

    private static void printList(final List<String> list) {
        list.forEach(System.out::println);
    }

    private static ArrayList<String> getNamesList() {
        List<String> names = Arrays.asList("Arc", "Pedro", "Am", "Ali", "Alu", "Mireia", "Alexandra", "Miriam", "Api");
        return new ArrayList<String>(names);
    }
}
