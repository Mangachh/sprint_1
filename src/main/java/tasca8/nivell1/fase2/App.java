package tasca8.nivell1.fase2;

public class App {
    /*
     * Crea una Functional Interface que continga un mètode abstracte getPiValue (),
     * que retorn a un valor double; en una altra classe, instancie la interfície i
     * assigneu-li mitjançant una lambda el valor 3.1415.
     * Invoca el mètode getPiValue de la instància d'interfície i
     * imprimeix el resultat .
     */

    public static void main(String[] args) {
        //metemos pi
        IPi pi = () -> 3.1415;
        System.out.println("Printeando el valor de pi: ");
        System.out.println(pi.getPiVaule());

    }
}
