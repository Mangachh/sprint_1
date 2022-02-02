package tasca3.nivell1.Exercici3;

public class Generadora {
    
    private static final String[] NAMES = {"Charles", "Lewbosky", "Samantha", "Yukiko", "Pepote", "Marian"};
    private static int index = 0;

    public static String seguentPersonatge(){
        String name = NAMES[index];
        index++;
        
        if (index >= NAMES.length) {
            index = 0;
        }

        return name;
    }
}
