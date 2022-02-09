package tasca6.nivell3;

import java.lang.reflect.Array;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    /*
     * Exercici 1. Crea un mètode genèric que prengui com a argument un contenidor
     * Escola<List<?>>. Determina quins mètodes pot o no invocar per al contenidor
     * Escola i per a la llista List. Repeteix l'exercici per a un argument de tipus
     * List<Escola<?>>.
     */

    public static void main(String[] args) {
        List<String> tempList = Arrays.asList("Uno", "Dos", "Tres", "Cuatro");
        Escola esc = new Escola(tempList);        
        metodeGeneric1(esc);
    }

    private static void metodeGeneric1(final Escola esc) {
        System.out.println("Cridem al mètode Generic1 on passem instancia de Escola");
        System.out.println("Podem veure la mida de la llista:");
        System.out.println(String.format("Mida de la llista: %d\n", esc.getItems().size()));
        System.out.println("Podem imprimir la llista.");
        esc.getItems().forEach(System.out::println);

        try {
            System.out.println("No podem eliminar un element per index (remove element 0)");
            esc.getItems().remove(0);
        } catch (Exception e) {
            System.err.println("Tipus d'exepció a l'hora de treure un element: " + e.getClass().getSimpleName());
        }

        System.out.println("Podem agafar l'index d'un element passant com argument l'element list.indexOf(Object)");
        System.out.println("Index de l'String Dos: " + String.valueOf(esc.getItems().indexOf("Dos")));

        System.out.println(
                "No podem afegir cap item a la Escola.Llista<?> ja que no sabem quin tipus accepta (error de compilació)");

        // descomentar para ver los errores
        // esc.getItems().add("Hola");

        System.out.println(
                "No podem agafar cap item de Escola.Llista<?> ja que no sabem quin tipus retorna (error de compilació)");
        //String a = esc.getItems().get(0);       
    }
    
    private static void metodeGeneric2() {
        
    }

}
