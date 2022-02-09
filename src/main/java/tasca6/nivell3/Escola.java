package tasca6.nivell3;

import java.util.ArrayList;
import java.util.List;

public class Escola<T> {

    private List<T> items;

    public Escola(final List<T> items) {
        this.items = items;
    }

    public Escola() {
        items = new ArrayList<T>();
    }

    public List<T> getItems() {
        return this.items;
    }

    public void addItem(T item) {
        this.items.add(item);
    }

    


    
    
}
