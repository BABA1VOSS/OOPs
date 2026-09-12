package Transport;

public class Vehicle {
//    public String name;
    protected String name;
//    private String name;
// private kahi bhi accessible nahi hoga !
    // sirf mujhe pata hai kya protected hai or kya nahi

    public String model;

    public int noOfTyres;

    public Vehicle (){
        this.name = "";
        this.model= "";
        this.noOfTyres= -1;
    }
    Vehicle (String name, String model, int noOfTyres){
        this.name = name;
        this.model=model;
        this.noOfTyres=noOfTyres;
    }

    void startEngine(){
        System.out.printf("Engine is starting of %s : %s\n", name,model);
    }



    void stopEngine(){
        System.out.printf("Engine is stopping of %s : %s\n", name,model);
    }





}
