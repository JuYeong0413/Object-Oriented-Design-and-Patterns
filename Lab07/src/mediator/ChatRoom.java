// 2016111540 이주영

package mediator;

import java.util.Date;

public class ChatRoom {
	
	public void showMessage(User user, String message) {
        System.out.println(new Date() + " [" + user.getName() + "] : " + message);
    }

}
