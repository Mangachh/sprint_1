package tasca2.nivell1.Exercici1;

public class App {

    /* Exercici 1. Crea una classe amb un main() que generi un objecte de la classe Exception 
     * dins d'un bloc try-catch. Proporciona al constructor de l'excepció un missatge especific. 
     * Captura l'excepció dins d'una clàusula catch i imprimeix el seu missatge. 
     * Afegeix una clàusula finally i imprimeix un missatge per a demostrar que va passar per allí.
    */
    public static void main(String[] args){
        try{
            throw new Exception("Benvigut a la excepció");            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Aquest és el block Finally");
        }
    }
   
    

}
