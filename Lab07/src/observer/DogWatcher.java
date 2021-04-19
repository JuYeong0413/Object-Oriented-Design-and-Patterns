// 2016111540 이주영

package observer;

import java.util.Observable;
import java.util.Observer;

public class DogWatcher implements Observer {
	
	private String observerName;

    public DogWatcher(String name) {
        this.observerName = name;
    }

	@Override
	public void update(Observable o, Object arg) {
		DogBot dogbot = (DogBot) o;
		System.out.println("Observer " + observerName + " observes " + dogbot.getName() + " " + arg);
	}

}
