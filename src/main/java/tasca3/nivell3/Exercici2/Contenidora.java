package tasca3.nivell3.Exercici2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Contenidora {
    
    private int[] nums;
    private int tail;

    //como no pone mínimo de resize, utilizo esta variable para diferentes pruebas
    private final static int ARRAY_LIMIT = 1;

    
    public Contenidora() {
        this.nums = new int[ARRAY_LIMIT];
        this.tail = 0;
    }

    // tampoco dice a cuanto hay que redimensionar,
    // al igual que al constructor, he creado la array_limit
    public void add(int num) {        
        if (this.tail + 1 > this.nums.length) {            
            this.nums = Arrays.copyOf(nums, this.nums.length + ARRAY_LIMIT);
        }

        this.nums[this.tail] = num;
        this.tail++;
    }
    
    @Override
    public String toString() {
        String a = Arrays.asList(this.nums).stream().map(n -> String.valueOf(n)).collect(Collectors.joining(", "));
        return a;
    }
}
