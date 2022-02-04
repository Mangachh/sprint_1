package tasca3.nivell3.Exercici1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Contenidora {
    
    private String[] strings;
    private int tail;

    private final static int ARRAY_LIMIT = 4;

    //como no pone mínimo de resize, utilizo esta variable para diferentes pruebas
    public Contenidora() {
        this.strings = new String[ARRAY_LIMIT];
        this.tail = 0;
    }

    // tampoco dice a cuanto hay que redimensionar,
    // al igual que al constructor, he creado la array_limit
    public void add(final String s) {        
        if (this.tail + 1 > this.strings.length) {
            this.strings = Arrays.copyOf(strings, this.strings.length + ARRAY_LIMIT);
        }

        this.strings[this.tail] = s;
        this.tail++;
    }
    
    @Override
    public String toString() {
        String a = Arrays.asList(this.strings).stream().collect(Collectors.joining(", "));
        return a;
    }
}
