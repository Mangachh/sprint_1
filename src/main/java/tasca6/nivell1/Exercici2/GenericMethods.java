package tasca6.nivell1.Exercici2;

public class GenericMethods {
   
    public <T> void f(T a, T b, T c) {
        System.out.println("S'han introduït els següents objectes:");
        System.out.println(a.getClass());
        System.out.println(b.getClass());
        System.out.println(c.getClass());
    }
}
