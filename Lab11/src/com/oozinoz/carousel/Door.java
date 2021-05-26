package com.oozinoz.carousel;

import java.util.Observable;

public class Door extends Observable {

	private DoorState state = new DoorClosed();
	
	public String status()
	{
		switch (state.getClass().getName())
		{
			case "DoorOpening" :
				return "Opening";
			case "DoorOpen" :
				return "Open";
			case "DoorClosing" :
				return "Closing";
			case "DoorStayOpen" :
				return "StayOpen";
			default :
				return "Closed";
		}
	}
	
	public void click()
	{
		state.click(this);
	}
	
	public void setState(DoorState state)
	{
		this.state = state;
		setChanged();
		notifyObservers();
	}
	
	public void complete()
	{
		state.complete(this);
        
    }
	
	public void timeout()
    {
        state.timeout(this);
    }

}
