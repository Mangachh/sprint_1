package tasca2.nivell1.Exercici4;

public class Main {
    /* Exercici 4. Crea la teva pròpia classe d'excepcions, heretant de la classe Exception. 
     * Utilitza el constructor d'aquesta classe per emmagatzemar dins Exception, 
     * el missatge personalitzat que farà servir aquesta excepció. 
     * Crea una clàusula try-catch per a provar la nova excepció. 
     * Captura i mostra el missatge emmagatzemat. Mostra també la classe de l'excepció.    
    */

    public static void main(String[] args) {
        try{
            throw new MyException("Aquesta és la excepció creada per mí.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getCanonicalName());
        }
    }
}
