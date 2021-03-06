package tasca5.nivell2.Exercici1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Properties;

public class App {
    /*
     * Exercici 3. Executi l'exercici anterior guardant a un fitxer txt el resultat.
     */
    /*
     * Exercici 1. Executa l'exercici 3 del nivell anterior parametritzant tots els
     * mètodes en un file de configuració. Pot utilitzar un file Java Properties, o
     * bé la llibreria Apache Commons Configuration si ho desitja. De l'exercici
     * anterior, parametritzi el següent:
     * Directori a llegir
     * Nom i directori del fitxer txt resultant
     */

    private static final String PATH_READ_NAME = "pathToRead";
    private static final String PATH_WRITE_NAME = "pathToSave";
    private static final String PROPERTIES_FILE_NAME = "tasca5ex2.properties";

    public static void main(String[] args) {
        DirList d = new DirList();
        try{
            String pathToRead = readProperty(PATH_READ_NAME);
            String pathToWrite = readProperty(PATH_WRITE_NAME);
            ArrayList<String> directories = d.listTreeDirectories(pathToRead, 1);
            d.saveListToTxt(directories, pathToWrite);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
        
    }

    private static String readProperty(final String propName) throws NullPointerException {
        String propText = "";
        try (InputStream input = App.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE_NAME)) {
            Properties prop = new Properties();

            if (input == null) {
                throw new NullPointerException(
                        "No se ha encontrado el archivo de propiedades: " + PROPERTIES_FILE_NAME);
            }

            prop.load(input);
            propText = prop.getProperty(propName);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return propText;
    }

    
}
