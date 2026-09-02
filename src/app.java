import java.sql.SQLOutput;

public class app {
    public static void main(String[] args) throws Exception {
        //default ctor already creaated in Student.java
//        Student A = new Student();
        //yeh technique to bohot hi jyda lambi hai isliye hum is default ctor ka use hi ni karte hai
        //hum hamesha parameterized ctor ka use karte hai
//        A.id = 1;
//        A.age = 14;
//        A.name = "Ranu";
//        A.nos = 5;
//        ab parameterized ctor called karta hu mein
        Student A = new Student(1,12,"Aryan",3);
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);

//        A.bunking();
//        A.study();
//        A.sleep();
//
//        int a = 6;
//        int b = a;

        //copy ctor
//        Student B = new Student(A);// abhi to error dikhayega hi kyunki isme sbhi copy ctor nahi hai              bana hai student wali file mein , pehle wo banaunga uske bad hi mein usko use karunga
//    isme bhi hum use karenge khud se hi jab hum ek source object banayenge
      Student B = new Student(A);
        System.out.println(B.name);
        System.out.println(B.age);
        System.out.println(B.id);
        System.out.println(B.nos);
    }
}
