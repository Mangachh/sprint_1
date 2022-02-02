package tasca5.nivell1.Exercici2;

public class Main {
    /* Exercici 2. Afegeixi a la classe del nivell anterior la funcionalitat 
     * de llistar un arbre de directoris amb el contingut de tots els seus nivells 
     * (recursivamente) de manera que s'imprimeixin en pantalla en ordre alfabètic dins de cada nivell, 
     * indicant a més si és un directori (D) o un fitxer (F), i la seva última data de modificació.    
    */

    public static void main(String[] args) {
        DirList d = new DirList();
        d.listTreeDirectories("c:/Cosas/Nomi/BBDD", 1);
    }
}
