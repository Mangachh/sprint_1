package tasca6.nivell2.Exercici1;

public class Implementadora implements IMiInterfaz {

    @Override
    public void metode1() {
        System.out.println("Sóc el \"metode1\" de la interface \"IMiInterfaz\" cridat desde la classe \"Implementadora\"");
        
    }

    @Override
    public void metode2() {
        System.out.println("Sóc el \"metode2\" de la interface \"IMiInterfaz\" cridat desde la classe \"Implementadora\"");

    }
    
    public void metode3() {
        System.out.println("Sóc el \"metode3\" de la classe \"Implementadora\"");
    }
    
}
