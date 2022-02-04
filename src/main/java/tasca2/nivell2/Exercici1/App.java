package tasca2.nivell2.Exercici1;

public class App {

    /* Exercici 1. Crea una classe anomenada ThrowException amb dos mètodes, f() i g(). 
     * En g(), generi una excepció d'un nou tipus.
     *  En f() invoca a g(), captura la seva excepció i, en la clàusula catch, 
     * genera una excepció diferent. Comprova el codi en main().    
    */

    public static void main(String[] args) {
        ThrowException exc = new ThrowException();
        
        try{
            exc.f();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}
