package memento;

import java.util.Stack;

public class Caretaker {

	Stack<StateSnapshot> mementos = new Stack<StateSnapshot>();
	
    public void push(StateSnapshot snapshot) {
        mementos.push(snapshot);
    }
    
    public StateSnapshot pop() {
        return mementos.pop();
    }
    
}
