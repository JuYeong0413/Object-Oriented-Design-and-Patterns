package memento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Game {

	 public static void main(String[] args) {
		 play();
	 }

    static void play() {
    	Map<Integer, Integer> map = new HashMap<>();
    	map.put(1000, 1000);
    	
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("apple"));
        
        Adventurer adventurer = new Adventurer(100, 100, new Position(0, 0), map, items);
        Caretaker careTaker = new Caretaker();

        StateSnapshot snapshot1 = adventurer.createMemento();
        careTaker.push(snapshot1);
        adventurer.printAdventurer();
        
        adventurer.setPosition(new Position(10, 10));
        items.remove(0);
        adventurer.setItems(items);
        adventurer.setHP(200);
        StateSnapshot snapshot2 = adventurer.createMemento();
        careTaker.push(snapshot2);
        adventurer.printAdventurer();
        
        StateSnapshot s2 = careTaker.pop();
        StateSnapshot s1 = careTaker.pop();
        adventurer.setMemento(s1);
        adventurer.printAdventurer();
    }
    
}
