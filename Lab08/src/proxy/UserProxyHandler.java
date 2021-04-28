package proxy;

public class UserProxyHandler implements User {
	private User user;
	private boolean isLoggedIn;
	
	UserProxyHandler(boolean status) {
		this.isLoggedIn = status;
		
		if (isLoggedIn) {
			user = new AuthorizedUser();
		} else {
			user = new GuestUser();
		}
	}

	@Override
	public void checkOut() {
		this.user.checkOut();
	}
	
	public User getUser() {
		return this.user;
	}

}
