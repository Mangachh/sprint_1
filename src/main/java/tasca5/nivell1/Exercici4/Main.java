package tasca5.nivell1.Exercici4;

import java.util.ArrayList;

public class Main {
    /*Exercici 3. Executi l'exercici anterior guardant a un fitxer txt el resultat.
    */
    public static void main(String[] args) {
        DirList d = new DirList();
        ArrayList<String> directories = d.listTreeDirectories("c:/Cosas/Nomi/BBDD", 1);
        d.saveListToTxt(directories, "c:/Cosas/IT_Test.txt");
        d.loadTxt("c:/Cosas/IT_Test2.txt");
    }
}
