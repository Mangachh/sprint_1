package tasca8.nivell1.fase1.Exercici6;

import java.util.Arrays;
import java.util.List;

public class App {
    /*     
     * Crea una llista amb  els nombs dels mesos de  l’any. 
     * Imprimeix tots els  elements de la llista amb  una lambda. 
     */
    
    public static void main(String[] args) {
        List<String> months = Arrays.asList("Gener", "Febre", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost",
                "Septembre", "Octubre", "Novembre", "Desembre");

        System.out.println("\nImprimiendo meses con method reference");
        months.forEach(System.out::println);
    }
}
