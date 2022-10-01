public class Unboxing {
    public int add (int a , int b){
        return a-b;
    }

    public static void main(String[] args) {
        Unboxing unbox = new Unboxing();
        Integer a = 12;
        Integer b = 30;

        System.out.println("plus value:"+ unbox.add(a,b));
        System.out.println( "Minus value:"+ unbox.add(b,a));
    }
}
