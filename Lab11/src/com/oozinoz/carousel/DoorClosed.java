package com.oozinoz.carousel;

public class DoorClosed extends DoorState {

	@Override
	public void click(Door d) {
		d.setState(new DoorOpening());
	}

	@Override
	public void complete(Door d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void timeout(Door d) {
		// TODO Auto-generated method stub
		
	}

}
