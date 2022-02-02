package tasca7.nivell1.Exercici2;

public class Chil2 extends Father{
    
    @Override
    public void saySomething() {
        System.out.println("Child2. Sólo voy a imprimir 40 líneas con un <hola>");
        for (int i = 0; i < 40; i++) {
            System.out.println("Hola");
        }
    }

    @Deprecated
    public void deprecated3() {
        System.out.println("Por supuesto, yo también lo estoy de deprecated");
    }
}
