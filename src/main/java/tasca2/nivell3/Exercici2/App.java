package tasca2.nivell3.Exercici2;

public class App {
    /* Exercici 2. Crea una classe denominada FailingConstructor 
     * amb un constructor que falli a la meitat del procés de construcció i generi una excepció. 
     * En main() escriu el codi que permeti protegir-se apropiadament enfront d'aquesta fallada.   
     * */

    public static void main(String[] args) {
        try{
            FailingConstructor f = new FailingConstructor();
        } catch (Exception e) {
            System.err.println(String.format("%s: %s", e.getClass().getSimpleName(), e.getMessage()));
        }
        
        System.out.println("Esto se ejecuta después del constructor fallido");
    }
}
