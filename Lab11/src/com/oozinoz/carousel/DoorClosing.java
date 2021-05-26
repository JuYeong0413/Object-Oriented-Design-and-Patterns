package com.oozinoz.carousel;

public class DoorClosing extends DoorState {

	@Override
	public void click(Door d) {
		d.setState(new DoorOpening());
	}

	@Override
	public void complete(Door d) {
		d.setState(new DoorClosed());
	}

	@Override
	public void timeout(Door d) {
		// TODO Auto-generated method stub
		
	}

}
