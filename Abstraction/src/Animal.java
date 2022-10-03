 public abstract class Animal {
    private  int legs;

     public Animal(int legs) {
         this.legs = legs;
         System.out.println("Inside Abstract Class");
     }
 }
 class Deer extends Animal{
    public Deer(int aValue){
        super(aValue);
        System.out.println("Inside Sub Class");
    }
 }
 class Demo{
     public static void main(String[] args) {
         new Deer(20);
     }
 }




