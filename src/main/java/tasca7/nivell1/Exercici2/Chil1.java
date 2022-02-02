package tasca7.nivell1.Exercici2;

public class Chil1 extends Father {
    
    @Override
    public void saySomething() {
        System.out.println("Soy el children1. Voy a multiplicar 54 x 85 y lo pondré en pantalla");
        System.out.println(54 * 85);
        System.out.println("¿Has visto?");
    }

    @Deprecated
    public void deprecated2() {
        System.out.println("Este esta tambien deprecated");
    }
}
