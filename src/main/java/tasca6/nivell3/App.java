package tasca6.nivell3;

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
        Escola<List<String>> escola = new Escola<List<String>>(Arrays.asList("Hola", "Adios", "14"));
        metodeGeneric1(escola);
        metodeGeneric12(escola);
    }

    private static void metodeGeneric12(Escola<List<String>> escola) {
    }

    private static void metodeGeneric1(final Escola<T extendsList<?>> escola) {
        //no podemos agregar elementos porque no sabemos qué tipo se puede insertar
        //escola.getItem().add("Pedro");
        System.out.println("Sí que podemos leer elementos" + escola.getItem().get(1));
        

    }

    private static void metodeGeneric2(final List<Escola<?>> escola) {

    }
}
