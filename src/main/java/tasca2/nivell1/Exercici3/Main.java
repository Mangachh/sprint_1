package tasca2.nivell1.Exercici3;

public class Main {
    
    /* Exercici 3. Escriu el codi per a generar i capturar 
     * una excepció de tipus ArrayIndexOutOfBoundsException.      
    */

    public static void main(String[] args) {
        int[] tempArray = { 1, 2, 3 };

        try{
            int error = tempArray[7];

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Entrem a l'excepció de \"ArrayIndexOutOfBounds\":");
            System.out.println(e.getMessage());

            System.out.println("Comprobem que l'execpció sigui la correcta:" + e.getClass().getSimpleName());
        }
    }
}
