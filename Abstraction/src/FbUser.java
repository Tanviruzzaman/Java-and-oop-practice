public abstract class FbUser {
    abstract void sendMessage();

    public static void main(String[] args) {
        FbUser user;
        user = new Toha();
        user.sendMessage();
    }
}
