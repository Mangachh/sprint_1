package tasca8.nivell1.fase1.Exercici2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {

    /*
     * Escriu un mètode que retorne una cadena separada
     * per comes basada en una llista d’Integers. Cada element
     * hauria d'anar precedit per la lletra "e" si el nombre és parell ,
     * i precedit de la lletra "o" si el nombre és im parell. Per exemple,
     * si la llista d'entrada és (3,44), la sortida hauria de ser "o3, e44".
     * Imprimeix el resultat.
     */

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 12, 16, 20);
        System.out.println("Printeando números");
        printList(numbers);
        String strNumbers = numbers.stream().map(n -> (n % 2 == 0 ? "e" : "o") + String.valueOf(n))
                .collect(Collectors.joining(", ")); // -> en el ejemplo parece que están separados por coma y espacio, por eso
                                                    // lo he separado así

        System.out.println("\nPrinteando string con los números:");
        System.out.println(strNumbers);
    }

    private static void printList(final List<?> list) {
        list.forEach(System.out::println);
    }
}
