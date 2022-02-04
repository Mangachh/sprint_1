package tasca2.nivell3.Exercici2;

public class FailingConstructor {
    
    public FailingConstructor() {
        System.out.println("Primera línea");
        int a = 3 / 0; // excepción
        System.out.println("No deberíamos llegar a esta línea por la excepción");
    }
}
