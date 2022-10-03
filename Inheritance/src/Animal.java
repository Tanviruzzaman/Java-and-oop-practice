public class Animal {
    private String eat;
    private int legs;

    public Animal(String eat, int legs) {
        this.eat = eat;
        this.legs = legs;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }



    public static class Cat extends Animal{
        public Cat(String eat,int legs) {
            super(eat,legs);
        }
    }



    public static void main(String[] args) {
        Cat cat = new Cat("Milk",4);
        System.out.println("Cat eats " + cat.getEat());
        System.out.println("Cat have " + cat.getLegs() + " legs");
    }
}
