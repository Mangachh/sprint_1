package tasca6.nivell1.Exercici4;

public class GenericMethods {
   
    public <T> void f(T... args) {
        System.out.printf("\nNúmero de parametres passats: %d\n", args.length);
        System.out.println("Imprimint clase de cada parametre");

        for (T obj : args) {
            System.out.println("    " + obj.getClass());
        }
    }
}
