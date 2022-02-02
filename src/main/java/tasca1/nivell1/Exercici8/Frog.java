package tasca1.nivell1.Exercici8;

public class Frog extends Amphibian {

    public void saltar() {
        System.out.println("Has cridat al mètode saltar");
    }

    @Override
    public void menjar() {
        System.out.println("Soc el mètode menjar de la classe Frog");
    }
    
    @Override
    public void moure() {
        System.out.println("Soc el mètode moure de la classe Frog");
    }
    
    @Override
    public void respirar() {
        System.out.println("Soc el mètode respirar de la classe Frog");
    }
}
