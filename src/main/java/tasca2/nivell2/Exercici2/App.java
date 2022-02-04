package tasca2.nivell2.Exercici2;

public class App {

    /* Exercici 2. Repeteix l'exercici anterior, 
     * però ara dins de la clàusula catch, embolica l'excepció g() 
     * dins d'una RuntimeException.   
    */

    public static void main(String[] args) {
        ThrowException exc = new ThrowException();
        exc.f();
        
    }
    
}
