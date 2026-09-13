package polymorphism;

public class circle extends shape{
    @Override
    public void Draw(){
        System.out.println("circle Drawing");
    }
    public void personal(){
        System.out.println("Personal method of circle");
    }
}
