package strategy.q4;

import java.util.ArrayList;
import java.util.List;

public class SortedList {

	private List<String> list = new ArrayList<String>();
    private SortStrategy strategy;

    public void setSortStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void add(String name) {
        list.add(name);
    }

    public void sort() {
        strategy.sort(list);
    }
    
}
