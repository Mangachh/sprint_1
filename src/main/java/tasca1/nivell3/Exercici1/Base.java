package tasca1.nivell3.Exercici1;

public class Base {

    public void metode1() {
        this.metode2();
    }
    
    protected void metode2() {
        System.out.println("Sóc el metode2 de la clase Base");
    }
    
}
