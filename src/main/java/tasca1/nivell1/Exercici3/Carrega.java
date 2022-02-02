package tasca1.nivell1.Exercici3;

public class Carrega {

    public Carrega() {
        System.out.println("Estem al constructor de l'instancia ");
    }

    static {
        System.out.println("Estem al mètode static!");
    }
    {
        System.out.println("Estem a un mètode de càrrega ");
    }
}
