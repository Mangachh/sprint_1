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
        List<Escola> escoles = new ArrayList<Escola>();
        List<Integer> tempList2 = Arrays.asList(7, 14, 22, 5);
        escoles.add(esc);
        escoles.add(new Escola(tempList2));

        metodeGeneric1(esc);
        System.out.println("\n-------------------\n");
        metodeGeneric2(escoles);
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
        // String a = esc.getItems().get(0);
    }

    private static void metodeGeneric2(List<Escola> escoles) {
        System.out.println("Cridem al metodeGeneric2 on passem llista d'instancies de Escola");
        System.out.print("Podem veure la mida de la llista: ");
        System.out.println(escoles.size());
        System.out.println(
                "Podem aprofitar el \"metodeGeneric1\" per passar cada instancia d'escola i operar amb ella ja que la llista ens permet agafar les instancies sense cap problema.");
        System.out.println("\n-------------------\n");
        System.out.println("Probem de passar una de les instancies al metodeGeneric1");
        metodeGeneric1(escoles.get(1));
        System.out.println("\n-------------------\n");
        System.out.println("Podem també afegir i treure membres a la llista");
        List<String> temp = Arrays.asList("Tresss", "lalaalal", "pepepepe");
        System.out.println(String.format("Membres originals: %d", escoles.size()));
        escoles.add(new Escola(temp));
        System.out.println(String.format("Membres després d'afegir-ne un de nou: %d", escoles.size()));
        escoles.remove(0);
        System.out.println(String.format("Membres després d'eliminar-ne un: %d", escoles.size()));
        System.out.println(
                "\nEn definitiva, el metodeGeneric2 que treballa amb List<Escola<?>> permet fer totes les operacions d'una llista ja que tots els membres son de la mateixa classe. Per tant, es diferencia del metodeGeneric1 on cada llista podía tenir membres de diferents classes i, per tant, la operativat estaba limitada.");
    }

}
