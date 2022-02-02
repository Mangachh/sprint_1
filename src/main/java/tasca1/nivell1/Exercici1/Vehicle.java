package tasca1.nivell1.Exercici1;

public class Vehicle {
    
    /* Exercici 1.
     * Crea una classe Vehicle amb un constructor i un mètode anomenat iniciar(), 
     * que es invocat pel main() (aquest mètode pot estar en la mateixa classe o en una classe apart) . 
     * Demostra la seqüència d'execució dels mètodes de la classe (per exemple, enviant un missatge a la consola).
    */
    
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.iniciar();
    }
    
    public Vehicle() {
        System.out.println("Entrem al constructor!");
    }

    public void iniciar() {
        System.out.println("Entrem al métode \"iniciar\"");
    }
}
