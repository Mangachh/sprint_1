package tasca8.nivell2.Exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {
    /*
     * Feu una matriu que contingui algunes cadenes de text y numeros. Ordeneu-lo
     * per:
     * 
     * ----- longitud ( de més curta a més llarga) ✅
     * ----- longitud inversa (de més llarga a més curta)✅
     * ----- alfabèticament pel primer caràcter ( Nota: charAt (0) retorna el codi
     * numèric
     * del primer caràcter) ✅
     * ----- Les cadenes que contenen "e" primer, tota la resta en segon lloc. De
     * moment ,
     * poseu el codi directament a la lambda.✅
     * ----- Modifica tots els elements de la matriu per canviar els caracters “a” a
     * “4”✅
     * ----- Mostra només els elements que siguin 100% numerics . (tot i que estigui
     * guardats com strings) ✅
     * 
     * Crea una Functional Interface que continga un mètode abstracte operacio (),
     * que retorne un valor float; injecta a la interfície creada mitjançant una
     * lambda el cos del mètode, de manera que pugis transformar la operació a una
     * suma, resta, multiplicació i divisio.
     */

    public static void main(String[] args) {
        ListOperations op = new ListOperations();
        op.doListOperations();
        FloatOperations fop = new FloatOperations();
        System.out.println("\nAhora las operaciones de float:");
        fop.doFloatOperations();
    }

    

    

}
