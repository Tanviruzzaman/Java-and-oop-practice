public class Student_count {
    static int count = 0;

    public static void main(String[] args) {
        Student_count s1= new Student_count();
        s1.info();
        Student_count s2= new Student_count();
        s2.info();
        Student_count s3= new Student_count();
        s3.info();
        Student_count s4= new Student_count();
        s4.info();
    }
    Student_count(){
        count++;
    }
    void info(){
        System.out.println("Total Student:" + count);
    }
}
