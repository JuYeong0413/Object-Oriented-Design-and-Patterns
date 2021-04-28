package proxy;

class MainClass {
    public static void main(String[] args) {

        boolean isUserLoggedIn = UserManagerService.isUserLoggedIn();
        User user = new UserProxyHandler(isUserLoggedIn).getUser();
        user.checkOut();
    }
}
