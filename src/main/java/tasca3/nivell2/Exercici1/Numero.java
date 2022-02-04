package tasca3.nivell2.Exercici1;

public class Numero implements Comparable<Numero>{
    
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public int compareTo(Numero o) {
        if (this.numero > o.getNumero()) {
            return 1;
        } else if (this.numero == o.getNumero()) {
            return 0;
        } else {
            return -1;
        }
    }


    
    
    
}
