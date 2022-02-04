package tasca2.nivell3.Exercici3;

public class App {
    // TODO: no hemos entendido nada
    /* Exercici 3. Afegeix una classe amb un mètode finalitza() a l'exercici anterior. 
     * Modifica FailingConstructor perquè el constructor crei un d'aquests  objectes eliminables 
     * com un objecte membre, despres de la qual cosa el constructor pot generar una excepció i crear un 
     * segon objecte membre eliminable. Escriu el codi necessari per a protegir-se 
     * adequadament contra les fallades i verifica en main() que estan cobertes totes les possibles situacions de fallada. */

    public static void main(String[] args) {
        try{
            FailingConstructor f = new FailingConstructor();
        } catch (Exception e) {
            System.err.println(String.format("%s: %s", e.getClass().getSimpleName(), e.getMessage()));
        }
        
        System.out.println("Esto se ejecuta después del constructor fallido");
    }
}
