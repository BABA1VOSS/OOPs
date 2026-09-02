public class Student {
    //Attribute
    public int id;
    public int age;
    public String name;
    public int nos;

   //default ctor //attr. ->garbage   //ctor means constructor  //yeh by default hai humne isko koi parameter nahi die
    public Student(int id, int age, String name, int nos) {
        //jaise ki yeh sab ctor hai yaa ni ki abhi under construction hai to iska matlab hua object abhi ban rha hai , banne ke bad execute hoga
        //mein bante bante attribute dalunga taki wo call ho jaye or jab pura ho jaye to values dikh jajye iske lie hum use karte hai this.(___) =_______ jo bhi likha hoga
        //parameterized ctor
        System.out.println("Student default ctor called");
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
    }

        // copy ctor ki baari aagayi hai ab.. jisme hum banayenge ek source object
        //copy ctor
        public Student(Student srcobj) { //srcobj -> A
            System.out.println("Student copy ctor called");
            this.id = srcobj.id;
            this.name = srcobj.name;
            this.age = srcobj.age;
            this.nos = srcobj.nos;
        }

    //methods  /Behaviours
    public void study(){
        System.out.println(name + " Studying");
    }
    public void sleep(){
        System.out.println(name + " sleeping");
    }
    public void bunking(){
        System.out.println(name +" bunking");
    }



}
