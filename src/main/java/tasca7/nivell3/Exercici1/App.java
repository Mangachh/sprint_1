package tasca7.nivell3.Exercici1;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.fasterxml.jackson.databind.ObjectMapper;



public class App {

    /*
     * Exercici 1. Crea una annotation personalitzada que permeti serialitzar un
     * objecte wrapper Java en un fitxer JSON. La annotation ha de rebre el
     * directori
     * on es col·locarà el fitxer resultant.
     */

    public static void main(String[] args) {
        TestClass t = new TestClass("Test user", -254, "Something to test");
        String path = getPathFormAnotObj(t);

        // si NO está vacio, serializamos
        if (path.isEmpty() == false) {
            serializeJson(path, t);
        } else {
            System.out.println("No he ha encontrado una ruta.");
        }
    }

    // pillamos el path a partir de la anotación, si no existe devolvemos string vacia
    private static String getPathFormAnotObj(final Object obj) {
        String path = "";
        Class<?> objClass = Objects.requireNonNull(obj).getClass();

        if (objClass.isAnnotationPresent(AnotJson.class)) {
            System.out.println("FOUND PATH");
            path = objClass.getAnnotation(AnotJson.class).path();
            System.out.println(path);
        }
        return path;
    }

    private static void serializeJson(final String path, final TestClass test) {
        File f = new File(path);
        
        ObjectMapper objMapper = new ObjectMapper();
        try {
            f.createNewFile();
            objMapper.writeValue(f, test);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }        
    }
}
