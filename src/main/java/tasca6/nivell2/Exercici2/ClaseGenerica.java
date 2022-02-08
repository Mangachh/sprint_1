package tasca6.nivell2.Exercici2;

public class ClaseGenerica {

    public static void metode1(final Interficie1 inter) {
        System.out.println("Cridant intercifie1 desde la ClaseGenerica");
        inter.metodeInt1();
    }
    
    public static void metode2(final Interficie2 inter) {
        System.out.println("Cridant intercifie2 desde la ClaseGenerica");
        inter.metodeInt2();
    }
}
