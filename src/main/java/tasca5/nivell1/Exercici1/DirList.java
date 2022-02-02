package tasca5.nivell1.Exercici1;

import java.io.File;

public class DirList {
    
    public void listDirectories(final String path) {
        File file = new File(path);
        String[] contents = file.list();

        System.out.println("Mostrando el contenido del directorio: " + path);
        for (String cont : contents) {
            System.out.println(cont);
        }

        System.out.println("Fin.");
        
    }
}
