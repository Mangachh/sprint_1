package tasca1.nivell1.Exercici3;

public class App {
    
    /* Exercici 3. Demostra que el procés de càrrega d'una classe només té lloc una vegada. 
     * Demostra que la càrrega pot ser provocada per la creació de la primera instància d'aquesta
     * classe o per l'accés a un membre estàtic d'aquesta. 
     * Idea: Cerca informació sobre els blocs d'inicialització a Java.    
    */
    
    public static void main(String[] args) {
        System.out.println("Creem una instancia. Hauriem de llegir 3 missatges amb aquest ordre: \n\tstatic \n\tconstructor \n\tcàrrega\n");
        Carrega instancia = new Carrega();
        System.out.println("\nCreem nova instancia. Només apareixeràn dos missatges: \n\tconstructor  \n\tcàrrega\n");
        instancia = new Carrega();
    }
}
