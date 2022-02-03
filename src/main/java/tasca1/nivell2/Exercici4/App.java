package tasca1.nivell2.Exercici4;

import java.util.Arrays;
import java.util.List;

public class App {
    /* Exercici 4. Crea una jerarquia d'herència Rossegador: Ratolí, 
     * Jerbu, Hamster. A la classe base proporciona els mètodes que 
     * són comuns als rossegadors (ensumar(), rossegar(), correr()) i 
     * substitueix aquests mètodes a les classes derivades per a obtenir diferents 
     * comportaments depenent del tipus específic de rossegador 
     * (per exemple, enviant un missatge a la consola). Crea un array d'objectes Rossegador, 
     * emplena'l amb diferents tipus específics de rossegadors i invoca els mètodes de la classe 
     * base demostrant què succeeix.
    
    +*/

    public static void main(String[] args) {
        List<Rossegador> ross = Arrays.asList(new Ratoli(), new Hamster(), new Jerbu());
        
        ross.forEach(r -> {r.ensumar();
                           r.correr();
                           r.rossegar();});

    }
}
