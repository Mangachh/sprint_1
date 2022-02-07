package tasca5.nivell3.Exercici1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Properties;

public class App {

    /* 
     * Exercici 1. Crea una utilitat que encripti i desencripti els fitxers resultants dels nivells anteriors.
     * Utilitza l'algorisme AES en manera de treball ECB o CBC amb mètode d'ompliment PKCS5Padding. 
     * Es pot emprar javax.crypto o bé org.apache.commons.crypto.
     */    

    private static final String PATH_READ_NAME = "pathToRead";
    private static final String PATH_WRITE_NAME = "pathToSave";
    private static final String PATH_ENCRYPT_NAME = "encryptedPath";
    private static final String PATH_DECRYPT_NAME = "dencryptedPath";
    private static final String PROPERTIES_FILE_NAME = "tasca5ex2.properties";

    public static void main(String[] args) {
        DirList d = new DirList();
        try{
            String pathToRead = readProperty(PATH_READ_NAME);
            String pathToWrite = readProperty(PATH_WRITE_NAME);
            String encPath = readProperty(PATH_ENCRYPT_NAME);
            String decPath = readProperty(PATH_DECRYPT_NAME);
            ArrayList<String> directories = d.listTreeDirectories(pathToRead, 1);
            d.saveListToTxt(directories, pathToWrite);
            EnDeCrypt.encryptFile(EnDeCrypt.getSecretKey(), EnDeCrypt.generateIv(), pathToWrite, encPath);
            EnDeCrypt.deCryptFile(EnDeCrypt.getSecretKey(), EnDeCrypt.generateIv(), encPath, decPath);
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
