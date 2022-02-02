package tasca7.nivell1.Exercici2;

public class Main {
    /* Exercici 1. Crea una jerarquia d'objectes Java on 
     * els objectes fill sobreescriguin alguna funcionalitat 
     * de l'objecte pare emprant @Override. Afegeix una classe 
     * que efectuï les invocacions necessàries demostrant el punt anterior.    
    */
    
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Father f = new Father();
        Chil1 chil1 = new Chil1();
        Chil2 chil2 = new Chil2();

        f.deprecated1();
        System.out.println();
        chil1.deprecated2();
        System.out.println();
        chil2.deprecated3();
    }
}
