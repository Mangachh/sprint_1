package tasca2.nivell2.Exercici2;

public class ThrowException {

    public void f() {
        this.g();
    }
    
    public void g()  {
        throw new RuntimeException("Excepción del método \"g\"");
    }
}
