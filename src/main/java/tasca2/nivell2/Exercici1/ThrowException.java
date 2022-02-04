package tasca2.nivell2.Exercici1;

import java.util.concurrent.ExecutionException;

public class ThrowException {

    public void f() throws Exception {
        try{
            this.g();
        } catch (Exception e) {
            throw new Exception("Excepción del método \"f\" después de la excecpión del método \"g\"");
        }
    }
    
    public void g() throws Exception {
        throw new Exception("Excepción del método \"g\"");
    }
}
