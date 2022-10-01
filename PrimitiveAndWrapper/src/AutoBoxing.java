public class AutoBoxing {
    //reference type of data to primitive data called Autoboxing
    public Integer add(Integer a, Integer b){
        return a+b;
    }
    //object have primitive of data but the class data is reference type
    public static void main(String[] args) {
        AutoBoxing auto = new AutoBoxing();
        int a = 5;
        int b = 10;
        System.out.println(auto.add(a,b));
    }
}
