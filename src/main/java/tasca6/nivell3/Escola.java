package tasca6.nivell3;

import java.util.List;

public class Escola<T extends List<?>> {

    private List<?> item;

    public Escola(final List<?> item) {
        this.item = item;
    }

    public List<?> getItem() {
        return this.item;
    }

    


    
    
}
