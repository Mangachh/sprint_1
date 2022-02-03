package tasca8.nivell1.fase1.Exercici4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    /* Has de fer el mateix que en el punt anterior,  
     * però retornant una llista que  incloga els 
     * elements amb  més de 5 lletres. Imprimeix  el  resultat.  
     */

    public static void main(String[] args) {
        List<String> names = Arrays.asList("uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "octavilla", "olvidar");
        List<String> oNames = names.stream().filter(n -> n.length() > 5 && n.contains("o")).collect(Collectors.toList());
        oNames.forEach(System.out::println);
    }
}
