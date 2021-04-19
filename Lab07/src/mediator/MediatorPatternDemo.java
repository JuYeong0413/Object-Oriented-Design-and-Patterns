// 2016111540 이주영

package mediator;

public class MediatorPatternDemo {

	public static void main(String[] args) {
		ChatRoom chatroom = new ChatRoom();
        User p = new User("Park Seri", chatroom);
        User g = new User("Gildong", chatroom);

        p.sendMessage("Hi! " + p.getName() + "!");
        g.sendMessage("Hello! " + g.getName() + "!");
	}

}
