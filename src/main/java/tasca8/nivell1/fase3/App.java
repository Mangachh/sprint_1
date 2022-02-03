package tasca8.nivell1.fase3;

public class App {
    
    public static void main(String[] args) {
        IReverse irev = (str) -> reverse(str);

        String ph = "Vamos a poner esta frase del revés";

        System.out.println(ph);
        System.out.println(irev.reverse(ph));
    }

    private static String reverse(final String g) {
        StringBuilder b = new StringBuilder(g);
        return b.reverse().toString();
    }
}
