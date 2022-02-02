package tasca4.nivell1.Exercici1;

import java.util.ArrayList;

public class MonthList {
    
    /* Exercici 1. Crea una classe Java que insereixi en una llista ordenada els noms dels mesos de l'any. 
     * Verifica amb jUnit que la llista té 12 posicions, que no és nul·la i que en la seva posició 8 conté el nom 'Agost'.    
    */

    public ArrayList<String> getMonths() {
        ArrayList<String> months = new ArrayList<>();
        
        months.add("Gener");
        months.add("Febrer");
        months.add("Març");
        months.add("Abril");
        months.add("Maig");
        months.add("Juny");
        months.add("Juliol");
        months.add("Agost");
        months.add("Septembre");
        months.add("Octubre");
        months.add("Novembre");
        months.add("Desembre");

        return months;
    } 
}
