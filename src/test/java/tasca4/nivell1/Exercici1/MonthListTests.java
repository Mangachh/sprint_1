package tasca4.nivell1.Exercici1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MonthListTests {

    @Test
    void checkLength() {
        MonthList m = new MonthList();
        assertEquals(12, m.getMonths().size(), () -> "La mida hauría de ser 12");
    }

    @Test
    void checkAugustPosition() {
        MonthList m = new MonthList();
        assertEquals("Agost", m.getMonths().get(7), () -> "A la posició 8 hauría de ser-hi \"Agost\"");
    }
    
}
