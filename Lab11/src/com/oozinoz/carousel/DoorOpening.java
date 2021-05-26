package com.oozinoz.carousel;

public class DoorOpening extends DoorState {

	@Override
	public void click(Door d) {
		d.setState(new DoorClosing());
	}

	@Override
	public void complete(Door d) {
		d.setState(new DoorOpen());
	}

	@Override
	public void timeout(Door d) {
		// TODO Auto-generated method stub
		
	}

}
