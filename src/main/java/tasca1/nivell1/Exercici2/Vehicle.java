package tasca1.nivell1.Exercici2;


public class Vehicle {
    
    /* Exercici 2. A la classe Vehicle afegeix dos mètodes: un static anomenat parar() 
     * i un altre no-static anomenat accelerar(). 
     * Demostra com invocar el mètode static i el no-static des del main() 
     * (per exemple, enviant un missatge a la consola).
    */

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Vehicle.parar();
        v.accelerar();
    }
    
    public Vehicle() {
        System.out.println("Entrem al constructor!");
    }

    public void iniciar() {
        System.out.println("Entrem al métode \"iniciar\"");
    }

    public static void parar() {
        System.out.println("Métode \"parar\"");
    }
    
    public void accelerar() {
        System.out.println("Mètode \"accelerar\"");
    }
}
