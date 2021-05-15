package memento;

import java.util.List;
import java.util.Map;

public class StateSnapshot {
	
	private int HP;
    private int MP;
    private Position position;
    private Map map;
    private List<Item> items;

    public StateSnapshot(int HP, int MP, Position position, Map map, List<Item> items) {
        this.HP = HP;
        this.MP = MP;
        this.position = position;
        this.map = map;
        this.items = items;
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
