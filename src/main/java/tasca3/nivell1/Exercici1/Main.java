package tasca3.nivell1.Exercici1;

import java.util.ArrayList;

public class Main {
    /* Exercici 1. Crea una classe anomenada Month amb un atribut "name" (que emmagatzemarà el nom del mes de l'any). 
     * Afegeix 11 objectes Month (cadascun amb el seu atribut diferent) en un Contenidor ArrayList Java, 
     * a excepció de l'objecte amb atribut "Agost". 
     * Després, efectuï la inserció en el lloc que correspon a aquest mes i demostri que el Contenidor manté l'ordre correcte.    
    */

    public static void main(String[] args) {
        ArrayList<Month> months = new ArrayList<Month>();
        createMonths(months);

        // miramos que esten todos
        System.out.println("Comprobems els messos SENSE agost");
        printMonths(months);

        //insertamos
        months.add(7, new Month("Agost"));

        //y comprobamos
        System.out.println("Comprobems els messos AMB agost");
        printMonths(months);
    }

    private static void createMonths(ArrayList<Month> list) {
        list.add(new Month("Gener"));
        list.add(new Month("Febrer"));
        list.add(new Month("Març"));
        list.add(new Month("Abril"));
        list.add(new Month("Maig"));
        list.add(new Month("Juny"));
        list.add(new Month("Juliol"));
        list.add(new Month("Septembre"));
        list.add(new Month("Octubre"));
        list.add(new Month("Novembre"));
        list.add(new Month("Desembre"));
    }
    
    private static void printMonths(ArrayList<Month> months) {
        System.out.println("Messos per ordre de llista:");
        for (int i = 0; i < months.size(); i++) {
            System.out.printf("%d - %s\n", i +1 , months.get(i).getName());
        }
    }
    
}
