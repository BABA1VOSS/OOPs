package polymorphism;

public class Main {
    static void main(String[] args) {
//        calculator c = new calculator();
//        System.out.println(c.add(4,3));
//        System.out.println(c.add(4,3,4));
//        System.out.println(c.add(4,3,4,5.0));

        //Runtime polymorphism
//        circle c = new circle();
//        c.Draw();
//        doDrawingStuff(c);
//
//
//        Rect r = new Rect();
//        r.Draw();
//
//        shape s = new shape();
//        s.Draw();
//        doDrawingStuff(s);
        //DownCasting
//        Rect r = new Rect();
//        doDrawingStuff(r);
    }

    public static void doDrawingStuff (shape s){
            s.Draw();//polymorphic also known as UPCASTING
            //DOWNCASATING IS ALSO THERE IN JAVA but not used widely
//      circle c =(circle)s;//downcasting
//        c.personal();
    }
}
