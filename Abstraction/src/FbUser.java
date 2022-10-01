public abstract class FbUser {
     //non-abstract method
     void Calling(){
         System.out.println("Messenger Calling");
     }
     //abstract method
    abstract void sendMessage();

    public static void main(String[] args) {
        FbUser user;
        user = new Toha();
        user.Calling();
        user.sendMessage();
    }
}
