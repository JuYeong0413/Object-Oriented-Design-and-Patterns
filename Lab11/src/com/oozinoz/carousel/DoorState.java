package com.oozinoz.carousel;

public abstract class DoorState {
	
	abstract public void click(Door d);
	abstract public void complete(Door d);
	abstract public void timeout(Door d);
	
	void changeState(Door d, DoorState s) {
		d.setState(s);
	}

}
