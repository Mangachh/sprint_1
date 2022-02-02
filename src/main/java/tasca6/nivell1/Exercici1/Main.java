package tasca6.nivell1.Exercici1;

public class Main {
    /* Exercici 1. 
     * Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes 
     * del mateix tipus, juntament amb els mètodes per a emmagatzemar i extreure aquests objectes 
     * i un constructor per a inicialitzar els tres. 
     * Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor. 
     */

    public static void main(String[] args) {
        NoGenericMethods m = new NoGenericMethods(1, 2, 3);
        m = new NoGenericMethods(3, 1, 2);
        m = new NoGenericMethods(2, 3, 1);
    }
}
