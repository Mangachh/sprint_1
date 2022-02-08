package tasca8.nivell3;

import java.util.ArrayList;
import java.util.List;

public class App {
    /*
     * Crea una clase Alumne que tingui com a propietats: Nom, edat, curs i nota. ✅
     * Omple la llista amb 10 alumnes . ✅
     * Mostra per pantalla el nom i l’edat de cada alumne . ✅
     * Filtra la llista per tots els alumnes que el nom comensi per “a”, asigna-ho a
     * un altre llista y mostra per pantalla la nova llista (tot amb lambdas) ✅
     * Filtra y mostra per pantalla els alumnes que tinguin un 5 o mes de nota.✅
     * Filtra y mostra per pantalla els alumnes que tinguin un 5 o mes de nota y que
     * no siguin de PHP.✅
     * Mostra tots els alumnes que facin JAVA i siguin majors d’edat.
     */

    public static void main(String[] args) {
        List<Alumne> alumnes = alumniList();
        printList(alumnes, "Imprimiendo lista con todos los alumnos");
        printNameEdad(alumnes);
        printNameBegLetter(alumnes);
        printFiveOrMore(alumnes);
        printFiveOrMoreNoPHP(alumnes);
        printJavaAndAdult(alumnes);
    }

    private static void printList(final List<Alumne> als, final String mess) {
        System.out.println(mess);
        als.forEach(al -> System.out.println(al.toString() + "\n"));
    }

    private static void printNameBegLetter(final List<Alumne> als) {
        List<Alumne> temp = als.stream().filter(a -> a.getNom().toLowerCase().charAt(0) == 'a').toList();
        printList(temp, "Imprimiendo alumnos cuyo nombre empieza por A:");
    }

    private static void printFiveOrMore(final List<Alumne> als) {
        List<Alumne> temp = als.stream().filter(a -> a.getNota() >= 5f).toList();
        printList(temp, "Imprimiendo alumnos con nota mayor o igual a 5");
    }

    private static void printFiveOrMoreNoPHP(final List<Alumne> als) {
        List<Alumne> temp = als.stream().filter(a -> a.getNota() >= 5f && a.getCurs().equalsIgnoreCase("PHP") == false).toList();
        printList(temp, "Imprimiendo alumnos con nota mayor o igual a 5 que no sean de PHP:");
    }

    private static void printNameEdad(final List<Alumne> als) {
        System.out.println("Imprimiendo el nombre y la edad de los alumnos:");
        String format = "Nom: %s\nEdat: %d\n";
        als.forEach(al -> System.out.println(String.format(format, al.getNom(), al.getEdad())));
    }

    private static void printJavaAndAdult(final List<Alumne> als) {
        List<Alumne> temp = als.stream().filter(a -> a.getCurs().equalsIgnoreCase("JAVA") && a.getEdad() >= 18)
                .toList();
        printList(temp, "Alumnos mayores de edad y cursando JAVA:");
    }


    private static List<Alumne> alumniList() {
        List<Alumne> als = new ArrayList<Alumne>();

        als.add(new Alumne("Mireia", "JAVA", 25, 9.75f));
        als.add(new Alumne("Pedro", "PHP", 21, 2.54f));
        als.add(new Alumne("Miriam", "PHP", 15, 9f));
        als.add(new Alumne("Alexandra", "JAVA", 74, 7f));
        als.add(new Alumne("Noemi", "PHP", 12, 4f));
        als.add(new Alumne("Jaime", "C#", 42, 5f));
        als.add(new Alumne("Carlos", "C#", 24, 8f));
        als.add(new Alumne("Esther", "C++", 15, 10f));
        als.add(new Alumne("Julio", "PHP", 32, 0f));
        als.add(new Alumne("Aina", "JAVA", 12, 3f));

        return als;
    }
}
