package Java.OOP;

class Constructors{
    int x = 30;  //It will be used when constructor with no parameters is called
    int y;

    Constructors(){
        System.out.println("Constructor with no arguments");
    }

    Constructors(int a){
        x = a;
        System.out.println("A constructor with one parameter/argument");
    }

    Constructors(int a, int b){
        x = a;
        y = b;
        System.out.println("A constructor with two parameters.");
    }
    void show(){
        System.out.println("The attributes of the objects are:");
        System.out.println("x = "+x+"\ny = "+y);
    }
}
public class OverloadedConstructors{
    public static void main(String[] args) {
        Constructors obj1 = new Constructors();
        Constructors obj2 = new Constructors(5);
        Constructors obj3 = new Constructors(10, 20);

        obj1.show();
        obj2.show();
        obj3.show();
    }
}
