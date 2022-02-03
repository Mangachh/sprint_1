package tasca5.nivell1.Exercici1;

public class App {
    /* Exercici 1. Creu una classe Java que llisti el contingut 
     * d'un directori rebut per paràmetre ordenat alfabèticament.    
    */

    public static void main(String[] args) {
        DirList d = new DirList();
        d.listDirectories("c:/");
    }
}
