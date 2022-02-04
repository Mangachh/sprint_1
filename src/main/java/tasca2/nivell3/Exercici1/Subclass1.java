package tasca2.nivell3.Exercici1;

public class Subclass1 extends Class1 {

    // Este constructor
    public Subclass1() throws Exception {
        super();

        try {
            // Error de compilación ya que "super()" debe estar SÍ o SÍ en la primera línea
            // descomentar para comprobar
            // super(); 
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
