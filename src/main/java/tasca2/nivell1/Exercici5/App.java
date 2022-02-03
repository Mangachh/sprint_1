package tasca2.nivell1.Exercici5;

public class App {
    /* Exercici 5. Defineix un comportament "erroni" utilitzant 
     * un bucle 'while' que es repeteixi fins que es deixi de generar una excepció.    
    */

    public static void main(String[] args) {
        boolean isException = true;
        int[] tempArray = { 1, 2 };
        int index = tempArray.length + 20;

        while (isException) {
            try {
                // aquí hay error 
                int a = tempArray[index];
                isException = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                // quitamos uno sólo para que vaya tirando
                index--;
            }
        }

        System.out.println("Fi del programa.");
    }
}
