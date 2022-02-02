package tasca3.nivell1.Exercici2;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    /* Exercici 2. Asseguri's que si convertim el Contenidor utilitzat en el punt anterior (exercici1)
     * a un Contenidor HashSet, aquest no permet duplicats. Verifica-ho.    
    */

    public static void main(String[] args) {
        ArrayList<Month> months = new ArrayList<Month>();
        createMonths(months);

        //creamos agosto y lo insertamos
        Month august = new Month("Agost");        
        months.add(7, august);
        
        //convertimos el list a hashset
        HashSet<Month> monthsSet = new HashSet<Month>(months);

        //intentamos insertar agosto de nuevo
        if (monthsSet.add(august)) {
            System.out.println("S'ha introduït l'element al HashSet");
        } else {
            System.out.println("No s'ha introduït l'element al HashSet");
        }       

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
