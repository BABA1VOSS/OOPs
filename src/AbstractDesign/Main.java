package AbstractDesign;


abstract class Bird{
    //pehle template banegi
    abstract void fly();
        abstract void eat();
        public void sleep(){
            System.out.println("bird sleeping");
        }
}
class Sparrow extends Bird {

    @Override
    //fir definition denge common interface ka
    void fly() {
        System.out.println("Sparrow flying in a different way");
    }

    @Override
    void eat() {
        System.out.println("sparrow eating ");
    }
}

class Crow extends Bird {

    @Override
        //fir definition denge common interface ka
    void fly() {
        System.out.println("Crow flying");
    }

    @Override
    void eat() {
        System.out.println("Crow eating in alag way ");
    }
}
public class Main{
    public static void doBirdStuff(Bird b) {
        b.eat();
        b.fly();
        b.sleep();
    }
    public static void main(String[] args) {
//      b.eat();
//      b.fly();

        //yeh polymorphism wala tareeke se call kia hai humne ab
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());
    }
}


// Interface
//package AbstractDesign;
//
//interface Bird {
//
//    void fly();
//    void eat();
//        }
//
//
//
// //ABSTRACT CLASS AB PURANA JAVA KA CODE HO GAYA HAI ..
// class Sparrow implements Bird {
//
//
//     @Override
//     public void fly() {
//         System.out.println("Sparrow flying");
//     }
//
//     @Override
//     public void eat() {
//         System.out.println("Crow eating");
//     }
// }
//
//class Crow implements Bird {
//    //fir definition denge common interface ka
//    @Override
//    public void fly() {
//        System.out.println("Crow flying  234");
//    }
//
//    @Override
//    public void eat() {
//        System.out.println("Crow eating in alag way ");
//    }
//}
//public class Main {
//    public static void doBirdStuff(Bird b) {
//        b.eat();
//        b.fly();
//    }
//    public static void main(String[] args) {
//
//        doBirdStuff(new Sparrow());
//        doBirdStuff(new Crow());
//    }
//}