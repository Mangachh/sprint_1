package tasca1.nivell1.Exercici5;

public class App {
    /* Exercici 5. Crea una classe Animal amb el mètode correr() sobrecarregat tres vegades. 
     * Defineix una nova classe (per exemple Gat) que hereti de l'anterior i afegeix una nova versió sobrecarregada del mateix mètode. 
     * Mostra que els quatre mètodes estan disponibles a la classe derivada (per exemple enviant un missatge a la consola).
    */
    
    public static void main(String[] args) {
        Gat g = new Gat();
        g.correr();
        g.correr(1);
        g.correr(1f);
        g.correr("a");
    }
}
