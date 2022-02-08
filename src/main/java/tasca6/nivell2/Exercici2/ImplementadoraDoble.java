package tasca6.nivell2.Exercici2;

public class ImplementadoraDoble implements Interficie1, Interficie2 {

    @Override
    public void metodeInt2() {
        System.out.println("Soc la interficie1 de la classe" + this.getClass().getSimpleName());
        
    }

    @Override
    public void metodeInt1() {
       System.out.println("Soc la interifice2 de la classe " + this.getClass().getSimpleName());
        
    }
    
}
