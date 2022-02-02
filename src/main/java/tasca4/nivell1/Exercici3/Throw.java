package tasca4.nivell1.Exercici3;

public class Throw {
    
    /* Exercici 3. 
     * Crea una classe amb un mètode que llanci una 
     * ArrayIndexOutOfBoundsException. Verifica el 
     * seu correcte funcionament amb un test jUnit.    
    */
    
    public void throwMethod() {
        throw new ArrayIndexOutOfBoundsException();
    }
}