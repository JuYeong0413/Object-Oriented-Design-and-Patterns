package memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Adventurer {

	private StateSnapshot state;
	
	public int HP;
	public int MP;
	public Position position;
	public Map map;
	public List<Item> items;
	
	public Adventurer(int HP, int MP, Position position, Map map, ArrayList<Item> items) {
		this.HP = HP;
        this.MP = MP;
        this.position = position;
        this.map = map;
        this.items = (List<Item>) items.clone();
	}
	
	public StateSnapshot createMemento() {
		return new StateSnapshot(HP, MP, position, map, items);
	}
	
	public void setMemento(StateSnapshot snapshot) {
		this.state = snapshot;
		
		this.HP = snapshot.getHP();
        this.MP = snapshot.getMP();
        this.position = snapshot.getPosition();
        this.map = snapshot.getMap();
        this.items = snapshot.getItems();
	}
	
	public void printAdventurer() {
		System.out.println("HP: " + HP);
		System.out.println("MP: " + MP);
		System.out.println("Position: (" + position.getX() + ", " + position.getY() + ")");
		System.out.println("Map: " + map);
		System.out.print("Items: ");
		if (items.isEmpty()) {
			System.out.println("empty\n");
		}
		else {
			for (int i = 0; i < items.size(); i++) {
				System.out.print(items.get(i).getItem() + " ");
			}
			System.out.println("\n");
		}
	}
	
	public int getHP() {
        return HP;
    }
    
    public void setHP(int HP) {
    	this.HP = HP;
    }

    public int getMP() {
        return MP;
    }
    
    public void setMP(int MP) {
    	this.MP = MP;
    }

    public Position getPosition() {
        return position;
    }
    
    public void setPosition(Position position) {
    	this.position = position;
    }

    public Map getMap() {
        return map;
    }
    
    public void setMap(Map map) {
    	this.map = map;
    }

    public List<Item> getItems() {
        return items;
    }
    
    public void setItems(List<Item> items) {
    	this.items = items;
    }
	
}
