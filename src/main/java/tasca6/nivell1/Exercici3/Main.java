package tasca6.nivell1.Exercici3;

import java.util.ArrayList;
public class Main {
    /* Exercici 3. Modifica el punt anterior de manera que 
     * un dels arguments de f() no sigui parametritzat.*/
    
    public static void main(String[] args) {
        GenericMethods gen = new GenericMethods();
        gen.f(3, "Hola", 2.5f);
        gen.f(true, "No parametritzat", "No");
        gen.f(new ArrayList<String>(), "Ha de ser String", 2);
    }
}
