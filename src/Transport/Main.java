package Transport;

public class Main {
    static void main(String[] args) {
        Car c = new Car("Maruti", "800", 4, 5, "Automatic");
        c.startEngine();
        c.startAc();
        c.stopEngine();
        System.out.println(c.name);
//        MotorCycle m = new MotorCycle("splendor", "125Xline", 2, "4h","suspensed by gTyre");
//        m.startEngine();
//        m.wheelie();
//        m.stopEngine();
//        System.out.println();
    }
    // 4 types of access specifiers in java --> public , private, protected, default
}
