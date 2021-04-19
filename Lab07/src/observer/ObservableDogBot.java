// 2016111540 이주영

package observer;

import java.util.Observable;
import java.util.Observer;

public class ObservableDogBot extends Observable implements DogBot {
	
	private DogBot dogbot;
	
	public ObservableDogBot(DogBot dogbot) {
        this.dogbot = dogbot;
    }

	@Override
	public boolean eat() {
		if (dogbot.eat()) {
			setChanged(); 
			notifyObservers("eat");
			return true;
		}
		else return false;
	}

	@Override
	public void rest() {
		dogbot.rest();
        setChanged();
        notifyObservers("rest");
	}

	@Override
	public void play() {
		dogbot.play();
        setChanged();
        notifyObservers("play");
	}

	@Override
	public String noise() {
		return dogbot.noise();
	}

	@Override
	public String getName() {
		return dogbot.getName();
	}

}
