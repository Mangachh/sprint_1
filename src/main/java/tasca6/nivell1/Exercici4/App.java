package tasca6.nivell1.Exercici4;

import java.util.ArrayList;

public class App {
    /*
     * Exercici 4. Modifica l'anterior apartat de manera que els arguments que rep
     * f() sigui una llista d'arguments de variable indefinida.
     */

    public static void main(String[] args) {
        GenericMethods gen = new GenericMethods();
        gen.f(3, "Hola");
        gen.f(true, "No parametritzat", "No");
        gen.f(new ArrayList<String>(), "Ha de ser String", 2);
        gen.f("lalalal", 2f, true, "lalalala2", 87777890, false, new ArrayList<>(), new GenericMethods(), "fffff", "po",
                58);
    }
}
