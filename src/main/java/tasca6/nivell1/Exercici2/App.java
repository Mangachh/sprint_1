package tasca6.nivell1.Exercici2;

import java.util.ArrayList;
public class App {
    /* Exercici 2. Crea una classe anomenada GenericMethods 
     * amb un mètode genèric anomenat f() que accepti tres arguments de tipus genèric. 
     * Realitza al main() diferents crides  
     * d'aquest mètode amb diferents tipus de parametres. 
     * Comprova que es poden posar qualsevol tipus de variable. */
    
    public static void main(String[] args) {
        GenericMethods gen = new GenericMethods();
        gen.f(3, "Hola", 2.5f);
        gen.f(true, false, "No");
        gen.f("Qui sap", new ArrayList<String>(), 2);
    }
}
