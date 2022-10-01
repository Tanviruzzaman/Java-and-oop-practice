public class Static_variable {
//    String name;
//    int id;
    static String universityName="DIU"; //memory consuming when we use static variable

//    Static_variable(String n,int i){
//        name = n;
//        id = i;
//    }
//    void info(){
//        System.out.println("universityName:"+universityName);
//    }

    public static void main(String[] args) {
//        Static_variable student = new Static_variable("Toha",01);
//        Static_variable student1 = new Static_variable("Salman",02);

        System.out.println("university: "+ Static_variable.universityName);
//        System.out.println("id: "+ student.id);
//        student.info();

    }


}
