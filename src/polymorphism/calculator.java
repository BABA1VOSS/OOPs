package polymorphism;

public class calculator {
    int add(int a, int b){
        return a+b;
    }
    //overlaoding add, 3 int addition

    int add(int a, int b , int c){
        return a+b+c;
    }
    double add(int a, int b, int c , double d){
        return a+b+c+d;
    }
}
