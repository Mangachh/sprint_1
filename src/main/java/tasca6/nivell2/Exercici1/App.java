package tasca6.nivell2.Exercici1;

public class App {
    /*
     * Exercici 1. Crea una interfície anomenada MiInterfaz amb dos mètodes
     * metode1() i metode2().
     * Crea una classe anomenada Implementadora que implementi aquesta interfície i
     * afegeixi un tercer mètode anomenat metode3().
     * En una altra classe anomenada Generica, crea el mètode genèric anomenat
     * metodeGeneric() amb un tipus d'argument que estigui
     * limitat per la interfície MiInterfaz. Demostri que els mètodes de la
     * interfície són invocables dins d'aquest mètode genèric.
     * En main(), passa una instància de la classe Implementadora al mètode genèric
     * metodeGeneric().
     */

    public static void main(String[] args) {
        Implementadora imp = new Implementadora();
        Generica gen = new Generica();

        gen.metodeGeneric(imp);
    }
}
