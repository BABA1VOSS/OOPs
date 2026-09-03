public class Student {
    //Attribute  first they are public after that i do them private for making them perfect encapsulation
    private int id;
    private int age;
    private String name;
    private  int nos;
    private String gf;

    //used for accessing this private attributes by using getter setter ..
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public void setAge(int a) {
        //extra layer of authentication (taaki koi invalid value na de ab koi 5000 age to dal dega to yeh galat cheez accept to hogi ni )
        if (age < 100) {
            this.age = a;
            return;
        }
     else{
            System.out.println("not a valid age ");
        }
    }

   //default ctor //attr. ->garbage   //ctor means constructor  //yeh by default hai humne isko koi parameter nahi die
    public Student(int id, int age, String name, int nos,String gf) {
        //jaise ki yeh sab ctor hai yaa ni ki abhi under construction hai to iska matlab hua object abhi ban rha hai , banne ke bad execute hoga
        //mein bante bante attribute dalunga taki wo call ho jaye or jab pura ho jaye to values dikh jajye iske lie hum use karte hai this.(___) =_______ jo bhi likha hoga
        //parameterized ctor
        System.out.println("Student default ctor called");
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
        this.gf = gf;
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


    private void gfChatting(){
        System.out.println(name + "gfChatting");
    }
}
