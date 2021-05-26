package com.oozinoz.carousel;

public class DoorOpen extends DoorState {

	@Override
	public void click(Door d) {
		d.setState(new DoorStayOpen());
	}

	@Override
	public void complete(Door d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void timeout(Door d) {
		d.setState(new DoorClosing());
	}

}
