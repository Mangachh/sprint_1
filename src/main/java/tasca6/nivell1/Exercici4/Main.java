package tasca6.nivell1.Exercici4;

import java.util.ArrayList;
public class Main {
    /* Exercici 3. Modifica el punt anterior de manera que 
     * un dels arguments de f() no sigui parametritzat.*/
    
    public static void main(String[] args) {
        GenericMethods gen = new GenericMethods();
        gen.f(3, "Hola");
        gen.f(true, "No parametritzat", "No");
        gen.f(new ArrayList<String>(), "Ha de ser String", 2);
        gen.f("lalalal", 2f, true, "lalalala2", 87777890, false, new ArrayList<>(), new GenericMethods(), "fffff", "po",
                58);
    }
}
