package tasca8.nivell2.Exercici1;

public class FloatOperations {
    
    private final static float NUM_A = 22.5f;
    private static final float NUM_B = 15.2f;

    public void doFloatOperations() {
        float result = 0f;
        // suma
        FunInt op = (a, b) -> suma(a, b);        
        result = op.operation(NUM_A, NUM_B);
        printOperation("+", NUM_A, NUM_B, result);

        //resta
        op = (a, b) -> resta(a, b);
        result = op.operation(NUM_A, NUM_B);
        printOperation("-", NUM_A, NUM_B, result);

        op = (a, b) -> multiply(a, b);
        result = op.operation(NUM_A, NUM_B);
        printOperation("*", NUM_A, NUM_B, result);

        op = (a, b) -> division(a, b);
        result = op.operation(NUM_A, NUM_B);
        printOperation("/", NUM_A, NUM_B, result);

         
    }

    private void printOperation(String operation, float a, float b, float result) {
        System.out.printf("Operación:\n %f %s %f = %f\n", a, operation, b, result);
    }
    
    private float suma(float a, float b) {
        return a + b;
    }

    private float resta(float a, float b) {
        return a - b;
    }

    private float multiply(float a, float b) {
        return a * b;
    }

    private float division(float a, float b) {
        return a / b;
    }
}
