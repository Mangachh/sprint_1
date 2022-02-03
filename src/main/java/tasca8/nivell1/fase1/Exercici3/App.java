package tasca8.nivell1.fase1.Exercici3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    /* Tenint una llista de Strings, 
     * escriu un mètode  que retorne una llista de totes les  cadenes  
     * que continguen la lletra ‘o’ i  imprimeix el resultat . */
    
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho");
        List<String> oNames = names.stream().filter(n -> n.contains("o")).collect(Collectors.toList());
        oNames.forEach(System.out::println);
    }
}
