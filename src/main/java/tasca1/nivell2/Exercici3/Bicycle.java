package tasca1.nivell2.Exercici3;

public class Bicycle extends Cycle {

    @Override
    public int wheels() {
        return 2;
    }
    
    public void balance() {
        System.out.println("Mètode balance de Bicycle");
    }
}
