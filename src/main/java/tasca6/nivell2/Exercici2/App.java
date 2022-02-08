package tasca6.nivell2.Exercici2;

public class App {

    /*
     * Exercici 2. Crea dues interfícies Interficie1 i Interficie2,
     * i una classe ImplementadoraDoble que implementi ambdues interficies.
     * Crea la classe anomenada ClaseGenerica amb dos mètodes genèrics, metode1()
     * que tingui un paràmetre
     * limitat per la primera interfície i metode2() que tingui un altre paràmetre
     * que estigui limitat
     * per la segona interfície. Crea una instància de la classe ImplementadoraDoble
     * (que implementa totes dues interfícies) i demostri que es pot utilitzar amb
     * tots dos mètodes genèrics de 'ClaseGenerica'.
     */

    public static void main(String[] args) {
        ImplementadoraDoble imp = new ImplementadoraDoble();

        ClaseGenerica.metode1(imp);
        ClaseGenerica.metode2(imp);
    }
}
