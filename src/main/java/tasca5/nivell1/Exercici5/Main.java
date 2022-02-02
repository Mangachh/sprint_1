package tasca5.nivell1.Exercici5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main {
    /* Exercici 5. Mostri com serialitzar un Objecte Java a un 
     * fitxer .ser i deserialícelo després.    
    */

    private static final String PATH = "c:/Cosas/Class.ser";

    public static void main(String[] args) {
        SerClass obj = new SerClass("Test de archivo", 2, 7.4f);
        System.out.println("Printeamos objeto para comprobar que se ha creado bien:");
        System.out.println(obj.toString());
        System.out.println("\nGrabando objeto...");
        serialize(obj);

        //nulleamos sólo para comprobar
        System.out.println("Objeto guardado. Nulleando objetdo");
        obj = null;
        System.out.print("Estado objeto: ");
        System.out.println(obj);
        System.out.println("\nAhora cargaremos el objeto.\nCargando objeto...");
        obj = deserialize();

        if (obj != null) {
            System.out.println("Objeto cargado! \nImprimiendo datos:");
            System.out.println(obj.toString());
        } else {
            System.out.println("El objeto no se ha cargado.");
        }
        

    }

    private static void serialize(final SerClass obj) {
        try (FileOutputStream stream = new FileOutputStream(PATH)) {
            ObjectOutputStream saver = new ObjectOutputStream(stream);
            saver.writeObject(obj);
            saver.flush();
            saver.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static SerClass deserialize() {
        SerClass obj = null;
        try (FileInputStream stream = new FileInputStream(PATH)) {
            ObjectInputStream loader = new ObjectInputStream(stream);
            obj = (SerClass)loader.readObject();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return obj;
    }
}
