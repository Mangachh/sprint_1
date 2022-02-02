package tasca5.nivell1.Exercici5;

import java.io.Serializable;

public class SerClass implements Serializable {
    private String name;
    private int number;
    private float other;

    public SerClass(final String name, int number, float other) {
        this.name = name;
        this.number = number;
        this.other = other;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nNumber: %d\nOther: %f", this.name, this.number, this.other);
    }
}
