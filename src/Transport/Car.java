package Transport;

public class Car extends Vehicle {

    public int  noOfDoors;

    public String tranmissionType;


    Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType){
        //mein vehicle ka ctor() call karna padega, taaki car ke corresponding vehcile ke public attribute call kar saaku..
        //iske lie hum SUPER keyword use karte hai--> super kyewords in cheezon ke lie shandaar hai
        // ++ ctor body mein super() keyword pehli matlab first body mein aani chaiye --> call to 'super() must be first Statement in constructor body.
        // hierarchy ke hisab se soche agar oops ko life mein implement kar ke dekhe to hum isko dekh sakte hai ki pehle parents ki properties pehle inherit hoti hai 

        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.tranmissionType = transmissionType;


    }






}
