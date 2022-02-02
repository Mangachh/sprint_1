package tasca1.nivell1.Exercici4;

public class Vehicle {

    /* Exercici 4. A la classe Vehicle afegeix un camp static final, 
     *un camp final i un camp static. Demostra la diferència entre els tres. 
     * Quins es poden inicialitzar al constructor de la classe?    
    */

    public static String campStatic = "No name.";

    public static final String CAMP_FINAL_STATIC = "El camp \"final static\" no es pot inicialitzar al constructor.";

    public final String CAMP_STATIC = "El camp \"final\" no es pot inicialitzar al constructor.";    
  
    public static void main(String[] args) {
        System.out.println("Comprovem el camp \"static\":");
        System.out.println(Vehicle.campStatic);

        System.out.println("Comprovem el camp \"final static\":");
        System.out.println(Vehicle.CAMP_FINAL_STATIC);

        System.out.println("Creem nova instancia, només podrem modificar el camp marcat amb \"static\"");
        Vehicle v = new Vehicle("Nom 255548877-bna");

        System.out.println("Comprovem el camp \"static\":");
        System.out.println(Vehicle.campStatic);

        System.out.println("Per comprovar que no podem cambiar els camps amb final, descomentar les línees del constructor.");

        
    }
    
    public Vehicle(final String name) {
        System.out.println("Entrem al constructor!");
        campStatic = name;
        // CAMP_FINAL_STATIC = name;
        // CAMP_STATIC = name;
    }

    public void iniciar() {
        System.out.println("Entrem al métode \"iniciar\"");
    }

    public static void parar() {
        System.out.println("Métode \"parar\"");
    }
    
    public void accelerar() {
        System.out.println("Mètode \"accelerar\"");
    }
}
